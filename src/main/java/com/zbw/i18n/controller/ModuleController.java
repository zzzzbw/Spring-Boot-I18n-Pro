package com.zbw.i18n.controller;

import com.zbw.i18n.util.LocaleMessage;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;


/**
 * @author fox
 */
@RestController
public class ModuleController {

    @Resource
    private LocaleMessage localeMessage;

    @GetMapping("/module")
    public String hello() {
        System.out.println("module.title: " + localeMessage.getMessage("module.title"));
        System.out.println("title: " + localeMessage.getMessage("title"));
        System.out.println("name: " + localeMessage.getMessage("name", new Object[]{"spring"}));
        System.out.println(localeMessage.getLocale());
        return "module";
    }
}
