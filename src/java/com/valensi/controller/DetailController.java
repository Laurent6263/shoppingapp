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
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/itemdetail")
public class DetailController {
    
    
    @RequestMapping(value="/{id}")
    public String detailBarang(HttpSession session, @PathVariable Integer id, Model model){
        User user = (User) session.getAttribute("user");
        Product product = new Product();
        List<Product> listProducts = (List<Product>) session.getAttribute("product");
        for (Product p : listProducts) {
            if (p.getId().compareTo(id) == 0) {
                product = p;
            }
        }
        session.setAttribute("productInformation", product);
        return "detail";
    }
    
    
}
