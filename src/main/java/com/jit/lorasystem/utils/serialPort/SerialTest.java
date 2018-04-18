package com.jit.lorasystem.utils.serialPort;

import com.jit.lorasystem.utils.serialException.*;
import gnu.io.SerialPort;
import gnu.io.SerialPortEvent;
import gnu.io.SerialPortEventListener;

import java.util.List;

import static com.jit.lorasystem.utils.serialPort.SerialTool.*;


public class SerialTest {

    private static final long serialVersionUID = 1L;
    private List<String> commList = null;    //保存可用端口号
    private  static SerialPort serialPort = null;    //保存串口对象


    private static class SerialListener implements SerialPortEventListener {

        /**
         * 处理监控到的串口事件
         */
        public void serialEvent(SerialPortEvent serialPortEvent) {

            switch (serialPortEvent.getEventType()) {

                case SerialPortEvent.BI: // 10 通讯中断
                    System.out.println("与串口设备通讯中断");
                    break;

                case SerialPortEvent.OE: // 7 溢位（溢出）错误

                case SerialPortEvent.FE: // 9 帧错误

                case SerialPortEvent.PE: // 8 奇偶校验错误

                case SerialPortEvent.CD: // 6 载波检测

                case SerialPortEvent.CTS: // 3 清除待发送数据

                case SerialPortEvent.DSR: // 4 待发送数据准备好了

                case SerialPortEvent.RI: // 5 振铃指示

                case SerialPortEvent.OUTPUT_BUFFER_EMPTY: // 2 输出缓冲区已清空
                    break;

                case SerialPortEvent.DATA_AVAILABLE: // 1 串口存在可用数据

                //    System.out.println("found data/////////////////////////////");
                    byte[] data = null;
                    try {
                        if (serialPort == null) {
                            System.out.println("串口对象为空！监听失败！");
                        } else {
                            data = readFromPort(serialPort);    //读取数据，存入字节数组
                            System.out.println(new String(data));

                        }

                    } catch (ReadDataFromSerialPortFailure | SerialPortInputStreamCloseFailure e) {
                        System.exit(0);    //发生读取错误时显示错误信息后退出系统
                    }

                    break;
            }

        }

    }


    public static  void  main(String[] args) throws SerialPortParameterFailure, NoSuchPort, PortInUse, NotASerialPort, ReadDataFromSerialPortFailure, SerialPortInputStreamCloseFailure, TooManyListeners, SerialPortOutputStreamCloseFailure, SendDataToSerialPortFailure {

        serialPort = openPort("COM1",9600);
        sendToPort(serialPort,new byte[] {1,2,3,4});
        addListener(serialPort, new SerialListener());
        // System.out.println("serial is open");
        int sign = 10000000;

//       System.out.println(bytes[0]);
//
    }

}
