package com.lxiao.springmvc.controller;

import com.lxiao.springmvc.aop.IndexAspect;
import com.lxiao.springmvc.service.IIndexService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("/")
public class IntexController {
    @Autowired
    private IIndexService indexService;


    @RequestMapping("/")
    public String start() {
        return "HAHA, I am back";
    }
    @RequestMapping("/index")
    public String index() {
        System.out.println("/index");
        indexService.showSomething();
        return "index";
    }
}
