package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Date;

@Controller
public class IndexController {

    @RequestMapping("/BingDD")
    public String index(){
        System.out.println("有人访问了冰墩墩"+new Date());
        return "bingdundun";
    }
}
