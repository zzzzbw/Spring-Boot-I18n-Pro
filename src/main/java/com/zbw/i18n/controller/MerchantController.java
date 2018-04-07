package com.zbw.i18n.controller;

import com.zbw.i18n.annotation.I18n;
import com.zbw.i18n.model.Merchant;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * @author zbw
 * @create 2018/4/22 11:37
 */
@Controller
@RequestMapping("merchant")
public class MerchantController {

    @I18n("merchant")
    @GetMapping
    public String index(Model model) {
        List<Merchant> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            Merchant merchant = new Merchant();
            merchant.setId(i);
            merchant.setNumber(1000 + i);
            merchant.setName("Merchant" + i);
            merchant.setCreate(new Date());
            list.add(merchant);
        }
        model.addAttribute("list", list);
        return "system/merchant";
    }
}
