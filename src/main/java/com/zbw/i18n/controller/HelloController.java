package com.zbw.i18n.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author zbw
 * @create 2018/4/2 22:56
 */
@Controller
public class HelloController {

    @GetMapping("hello")
    public String Hello() {
        return "hello";
    }
}
