/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pakage.beans_Front_end;

import java.io.Serializable;
import java.util.Objects;



/**
 *
 * @author michael
 */
public class SignUpBeans implements Serializable{
    
    private String userpassword;
    private String Confirm_userpassword;
    private String username;

    public SignUpBeans(){
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

    public String getConfirm_userpassword() {
        return Confirm_userpassword;
    }

    public void setConfirm_userpassword(String Confirm_userpassword) {
        this.Confirm_userpassword = Confirm_userpassword;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 43 * hash + Objects.hashCode(this.userpassword);
        hash = 43 * hash + Objects.hashCode(this.Confirm_userpassword);
        hash = 43 * hash + Objects.hashCode(this.username);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final SignUpBeans other = (SignUpBeans) obj;
        if (!Objects.equals(this.userpassword, other.userpassword)) {
            return false;
        }
        if (!Objects.equals(this.Confirm_userpassword, other.Confirm_userpassword)) {
            return false;
        }
        if (!Objects.equals(this.username, other.username)) {
            return false;
        }
        return true;
    }
    
    
}
