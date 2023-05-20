package com.pakage.beans_Front_end;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Date;
import java.util.Objects;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */



/**
 *
 * @author michael
 */
public class AdmissioBeans implements Serializable{
    
    private String FirstName;
    private String MiddleName;
    private String LastName;
    private String Email;
    private int PhoneNumber;
    private String Degree;
    private String BirthDay;
    private byte[] PhotoPasspport;
    private byte[] Diplomat;
    private String Gender;
    private String Status;

    public AdmissioBeans() {
    }

    public String getFirstName() {
        return FirstName;
    }

    public void setFirstName(String FirstName) {
        this.FirstName = FirstName;
    }

    public String getMiddleName() {
        return MiddleName;
    }

    public void setMiddleName(String MiddleName) {
        this.MiddleName = MiddleName;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String LastName) {
        this.LastName = LastName;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public int getPhoneNumber() {
        return PhoneNumber;
    }

    public void setPhoneNumber(int PhoneNumber) {
        this.PhoneNumber = PhoneNumber;
    }

    public String getDegree() {
        return Degree;
    }

    public void setDegree(String Degree) {
        this.Degree = Degree;
    }

    public String getBirthDay() {
        return BirthDay;
    }

    public void setBirthDay(String BirthDay) {
        this.BirthDay = BirthDay;
    }

    public byte[] getPhotoPasspport() {
        return PhotoPasspport;
    }

    public void setPhotoPasspport(byte[] PhotoPasspport) {
        this.PhotoPasspport = PhotoPasspport;
    }

    public byte[] getDiplomat() {
        return Diplomat;
    }

    public void setDiplomat(byte[] Diplomat) {
        this.Diplomat = Diplomat;
    }

    public String getGender() {
        return Gender;
    }

    public void setGender(String Gender) {
        this.Gender = Gender;
    }

    public String getStatus() {
        return Status;
    }

    public void setStatus(String Status) {
        this.Status = Status;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 83 * hash + Objects.hashCode(this.FirstName);
        hash = 83 * hash + Objects.hashCode(this.MiddleName);
        hash = 83 * hash + Objects.hashCode(this.LastName);
        hash = 83 * hash + Objects.hashCode(this.Email);
        hash = 83 * hash + this.PhoneNumber;
        hash = 83 * hash + Objects.hashCode(this.Degree);
        hash = 83 * hash + Objects.hashCode(this.BirthDay);
        hash = 83 * hash + Arrays.hashCode(this.PhotoPasspport);
        hash = 83 * hash + Arrays.hashCode(this.Diplomat);
        hash = 83 * hash + Objects.hashCode(this.Gender);
        hash = 83 * hash + Objects.hashCode(this.Status);
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
        final AdmissioBeans other = (AdmissioBeans) obj;
        if (this.PhoneNumber != other.PhoneNumber) {
            return false;
        }
        if (!Objects.equals(this.FirstName, other.FirstName)) {
            return false;
        }
        if (!Objects.equals(this.MiddleName, other.MiddleName)) {
            return false;
        }
        if (!Objects.equals(this.LastName, other.LastName)) {
            return false;
        }
        if (!Objects.equals(this.Email, other.Email)) {
            return false;
        }
        if (!Objects.equals(this.Degree, other.Degree)) {
            return false;
        }
        if (!Objects.equals(this.Gender, other.Gender)) {
            return false;
        }
        if (!Objects.equals(this.Status, other.Status)) {
            return false;
        }
        if (!Objects.equals(this.BirthDay, other.BirthDay)) {
            return false;
        }
        if (!Arrays.equals(this.PhotoPasspport, other.PhotoPasspport)) {
            return false;
        }
        if (!Arrays.equals(this.Diplomat, other.Diplomat)) {
            return false;
        }
        return true;
    }
    
    
    
    
    
}
