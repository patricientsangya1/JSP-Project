/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pakage.beans_Front_end;

import java.io.Serializable;

/**
 *
 * @author michael
 */
public class loginBeans implements Serializable{
    
    private String userpassword;
    private String username;

    public loginBeans() {
    }

    public String getUserpassword() {
        return userpassword;
    }

    public void setUserpassword(String userpassword) {
        this.userpassword = userpassword;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
        
        
    
    
}
