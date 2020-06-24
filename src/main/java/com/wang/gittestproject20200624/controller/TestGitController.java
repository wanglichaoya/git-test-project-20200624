package com.wang.gittestproject20200624.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author 王立朝
 * @date 2020-6-24
 * @description:
 */
@RestController
public class TestGitController {


    @GetMapping("/test")
    public String test() {
        System.out.println("这个同学A开发的版本");
        System.out.println("test1");

        return "hello world";
    }
}
