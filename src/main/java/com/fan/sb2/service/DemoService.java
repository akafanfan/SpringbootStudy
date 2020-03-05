package com.fan.sb2.service;

import com.fan.sb2.bean.Demo;
import com.fan.sb2.mapper.DemoMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
public class DemoService {

    @Autowired
    private DemoMapper demoMapper;

    public Demo getDemoById(Integer id) {
        return Optional.ofNullable(demoMapper.selectByPrimaryKey(id)).orElse(null);
    }

}
