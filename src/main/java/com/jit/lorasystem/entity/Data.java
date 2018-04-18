package com.jit.lorasystem.entity;

import com.baomidou.mybatisplus.enums.IdType;
import java.util.Date;
import com.baomidou.mybatisplus.annotations.TableId;
import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 *
 * @author libre
 * @since 2018-04-18
 */
public class Data implements Serializable {

    private static final long serialVersionUID = 1L;

    private Float tempture;
    private Integer redValue;
    private Integer irValue;
    private Integer ax;
    private Integer ay;
    private Integer az;
    private Integer wx;
    private Integer wy;
    private Integer wz;
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;
    private Date time;


    public Float getTempture() {
        return tempture;
    }

    public void setTempture(Float tempture) {
        this.tempture = tempture;
    }

    public Integer getRedValue() {
        return redValue;
    }

    public void setRedValue(Integer redValue) {
        this.redValue = redValue;
    }

    public Integer getIrValue() {
        return irValue;
    }

    public void setIrValue(Integer irValue) {
        this.irValue = irValue;
    }

    public Integer getAx() {
        return ax;
    }

    public void setAx(Integer ax) {
        this.ax = ax;
    }

    public Integer getAy() {
        return ay;
    }

    public void setAy(Integer ay) {
        this.ay = ay;
    }

    public Integer getAz() {
        return az;
    }

    public void setAz(Integer az) {
        this.az = az;
    }

    public Integer getWx() {
        return wx;
    }

    public void setWx(Integer wx) {
        this.wx = wx;
    }

    public Integer getWy() {
        return wy;
    }

    public void setWy(Integer wy) {
        this.wy = wy;
    }

    public Integer getWz() {
        return wz;
    }

    public void setWz(Integer wz) {
        this.wz = wz;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    @Override
    public String toString() {
        return "Data{" +
        ", tempture=" + tempture +
        ", redValue=" + redValue +
        ", irValue=" + irValue +
        ", ax=" + ax +
        ", ay=" + ay +
        ", az=" + az +
        ", wx=" + wx +
        ", wy=" + wy +
        ", wz=" + wz +
        ", id=" + id +
        ", time=" + time +
        "}";
    }
}
