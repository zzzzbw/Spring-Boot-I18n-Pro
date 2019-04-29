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
        System.out.println("1");
        String msg3 = localeMessage.getMessage("module.title");
        System.out.println("module.title:"+msg3);
        msg3 = localeMessage.getMessage("title");
        System.out.println("title:"+localeMessage.getMessage("title"));

        System.out.println("title:"+msg3);
        System.out.println(localeMessage.getLocale());
        return msg3;
    }
}
