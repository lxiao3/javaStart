package com.lxiao.rpc.dubbo.provider.service;

import com.lxiao.rpc.dubbo.api.service.IDemoService;
import org.springframework.stereotype.Service;

@Service(value = "demoService")
public class DemoServiceImpl implements IDemoService {

    @Override
    public String sayHello() {
        return null;
    }

}
