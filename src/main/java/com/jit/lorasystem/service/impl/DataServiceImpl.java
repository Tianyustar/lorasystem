package com.jit.lorasystem.service.impl;

import com.jit.lorasystem.entity.Data;
import com.jit.lorasystem.mapper.DataMapper;
import com.jit.lorasystem.service.IDataService;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author libre
 * @since 2018-04-18
 */
@Service
public class DataServiceImpl extends ServiceImpl<DataMapper, Data> implements IDataService {

}
