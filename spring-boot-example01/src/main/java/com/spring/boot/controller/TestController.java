package com.spring.boot.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: Emilia
 * @Since: 2020.11.16 17:13
 */
@RestController
public class TestController {

    @GetMapping("/test")
    public String test() {
        return "Hello World";
    }
}
