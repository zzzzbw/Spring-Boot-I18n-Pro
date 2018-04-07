package com.zbw.i18n.controller;

import com.zbw.i18n.annotation.I18n;
import com.zbw.i18n.model.Merchant;
import com.zbw.i18n.model.Shop;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * @author zbw
 * @create 2018/4/22 10:21
 */
@I18n("shop")
@Controller
public class ShopController {

    @GetMapping("shop")
    public String shop(Model model) {
        List<Shop> list = new ArrayList<>();
        Merchant merchant1 = new Merchant();
        merchant1.setName("merchant1");
        Merchant merchant2 = new Merchant();
        merchant2.setName("merchant2");
        for (int i = 0; i < 10; i++) {
            Shop shop = new Shop();
            shop.setId(i);
            shop.setNumber(500 + i);
            if (i % 2 == 0) {
                shop.setMerchant(merchant1);
            } else {
                shop.setMerchant(merchant2);
            }
            shop.setName("shop" + i);
            shop.setCreate(new Date());
            list.add(shop);
        }
        model.addAttribute("list", list);
        return "system/shop";
    }
}
