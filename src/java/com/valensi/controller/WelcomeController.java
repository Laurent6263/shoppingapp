/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.valensi.controller;

import com.valensi.dao.ProductService;
import com.valensi.model.Product;
import com.valensi.model.User;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

@Controller
@RequestMapping("/welcome")
//@SessionAttributes("user")
public class WelcomeController {
    
    @Autowired
    ProductService ps;
    List<Product> cart = new ArrayList<>();
    User user = new User("Laurentsia","secret",cart);
    @RequestMapping()
    public String welcome(HttpSession session, Model model){
        
        
        List<Product> products = ps.findAll();
        model.addAttribute("products", products);
        model.addAttribute("msg", "Selamat datang di situs ini, selamat berbelanja");
        session.setAttribute("user", user);
        session.setAttribute("product", products);
        return "welcome";
    }
    
    
}
