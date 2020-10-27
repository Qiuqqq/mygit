package com.test.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author ：qs
 * @date ：2020/10/23 18:11
 * @description：
 */
@RestController
@RequestMapping("test")
public class TestController {
    @RequestMapping("/first")
    public String test(){
        return "second jenkins";
    }
}
