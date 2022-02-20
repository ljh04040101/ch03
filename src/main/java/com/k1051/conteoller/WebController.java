package com.k1051.conteoller;

import org.springframework.web.bind.annotation.RequestMapping;

public class WebController {

    @RequestMapping("/")
    public String index(String name){

        return "index";
    }
}
