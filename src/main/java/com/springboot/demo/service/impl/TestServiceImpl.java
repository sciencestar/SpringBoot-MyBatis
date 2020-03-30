package com.springboot.demo.service.impl;

import com.springboot.demo.mapper.master.MasterMapper;
import com.springboot.demo.mapper.slave.SlaveMapper;
import com.springboot.demo.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @ClassName TestServiceImpl
 * @Description: TODO
 * @Author lxc
 * @Date 2020/3/30 15:30
 * @Version V1.0
 **/
@Service
public class TestServiceImpl implements TestService {
    @Autowired
    MasterMapper masterMapper;

    @Autowired
    SlaveMapper slaveMapper;
    @Override
    public String test() {
        return masterMapper.test() + "---" + slaveMapper.test();
    }
}
