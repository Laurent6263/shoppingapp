/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.valensi.model;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author user
 */
public class User {
    private String username;
    private String password;
    private List<Product> carts;

    public User() {
    }

    public User(String username, String password, List<Product> carts) {
        this.username = username;
        this.password = password;
        this.carts = carts;
    }    
    

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public List<Product> getCarts() {
        return carts;
    }

    public void setCarts(List<Product> carts) {
        this.carts = carts;
    }
    
    
    
    
}
