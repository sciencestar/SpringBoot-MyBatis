package com.springboot.demo.controller;

import com.springboot.demo.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName SpringBootController
 * @Description: TODO
 * @Author lxc
 * @Date 2020/3/30 15:27
 * @Version V1.0
 **/
@RestController
public class SpringBootController {
    @Autowired
    TestService testService;

    @GetMapping("/hello")
    public String hello() {
        return testService.test();
    }
}
