package com.zbw.i18n.controller;

import com.zbw.i18n.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * @author zbw
 * @create 2018/4/22 10:27
 */
@Controller
public class UserController {
    @GetMapping("user")
    public String user(Model model) {
        List<User> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            User user = new User();
            user.setId(i);
            user.setName("user" + i);
            user.setCreate(new Date());
            list.add(user);
        }
        model.addAttribute("list", list);
        return "system/user";
    }
}
