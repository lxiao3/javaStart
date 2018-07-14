package com.lxiao.springmvc.service.impl;

import com.lxiao.springmvc.service.IIndexService;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.Date;

@Service
public class IndexServiceImpl implements IIndexService{

    @Override
    public void showSomething() {
        for (int i = 0; i< 100; i++) {
            System.out.println(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date()) + "  Hello World !");
        }
    }
}
