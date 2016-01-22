package com.example;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by phuang on 2016/1/22.
 */
@Controller
public class Example {
    @RequestMapping("/a")
    public String home(){
        return "a";
    }
}
