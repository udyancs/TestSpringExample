package com.sun.us.rest;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by udyan.shardhar on 4/2/17.
 */
@RestController
public class HelloResouces {

    @RequestMapping("/hi")
    public String sayHello() {
        return "Hi Udyan";
    }
}
