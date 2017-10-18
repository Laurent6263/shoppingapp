/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.valensi.controller;

import com.valensi.model.Product;
import com.valensi.model.User;
import java.util.List;
import javax.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author Laurentsia
 */
@Controller
@RequestMapping("/itemlist")
public class CartController {
    
    @RequestMapping()
    public String isiKeranjang() {
        return "cart";
    }
    
    @RequestMapping(value = "/remove/{id}")
    public String isiKeranjang(HttpSession session, @PathVariable("id") Integer id) {
        User user = (User) session.getAttribute("user");
        List<Product> listProducts = user.getCarts();
        int item = 0;
        for (int i = 0; i < listProducts.size(); i++) {
            if (listProducts.get(i).getId() == id) {
                item = i;
            }
        }
        listProducts.remove(item);
        return "removecartitem";
    }
}
