/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pakage.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 *
 * @author michael
 */
@Entity
public class SignUpModel implements Serializable{
   
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;
    private String userpassword;
    private String Confirm_userpassword;
    private String username;

    /**
     *
     */
    public SignUpModel(){
    }

    /**
     *
     * @return
     */
    public String getUserpassword() {
        return userpassword;
    }

    /**
     *
     * @param userpassword
     */
    public void setUserpassword(String userpassword) {
        this.userpassword = userpassword;
    }

    /**
     *
     * @return
     */
    public String getUsername() {
        return username;
    }

    /**
     *
     * @param username
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     *
     * @return
     */
    public String getConfirm_userpassword() {
        return Confirm_userpassword;
    }

    /**
     *
     * @param Confirm_userpassword
     */
    public void setConfirm_userpassword(String Confirm_userpassword) {
        this.Confirm_userpassword = Confirm_userpassword;
    }
    
}
