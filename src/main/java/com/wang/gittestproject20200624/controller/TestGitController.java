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

        return "hello world";
    }
}
