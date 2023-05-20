/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pakage.model;

import java.io.Serializable;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.persistence.Entity;
import javax.persistence.Id;



/**
 *
 * @author michael
 */
/**
 * This class represents the model for admission details.
 * It contains fields for storing personal information, contact details, education details, and more.
 */
@Entity
public class AdmissioModel implements Serializable{
    
    /**
     * First name of the applicant.
     */
    private String FirstName;
    
    /**
     * Middle name of the applicant.
     */
    private String MiddleName;
    
    /**
     * Last name of the applicant.
     */
    private String LastName;
    
    /**
     * Email address of the applicant. 
     * This field is also used as the primary key in the database table.
     */
    @Id
    private String Email;
    
    /**
     * Phone number of the applicant.
     */
    private int PhoneNumber;
    
    /**
     * Highest degree obtained by the applicant.
     */
    private String Degree;
    
    /**
     * Date of birth of the applicant.
     */

    private Date BirthDay;
    
    /**
     * Photograph of the applicant's passport.
     */
    private byte[] PhotoPasspport;
    
    /**
     * Scanned copy of the applicant's diploma.
     */
    private byte[] Diplomat;
    
    /**
     * Gender of the applicant.
     */
    private String Gender;
    
    /**
     * Status of the admission application.
     */
    private String Status;

    /**
     * Default constructor for AdmissioModel class.
     */
    public AdmissioModel() {
    }

    /**
     * Getter method for FirstName field.
     * 
     * @return First name of the applicant.
     */
    public String getFirstName() {
        return FirstName;
    }

    /**
     * Setter method for FirstName field.
     * 
     * @param FirstName First name of the applicant.
     */
    public void setFirstName(String FirstName) {
        this.FirstName = FirstName;
    }

    /**
     * Getter method for MiddleName field.
     * 
     * @return Middle name of the applicant.
     */
    public String getMiddleName() {
        return MiddleName;
    }

    /**
     * Setter method for MiddleName field.
     * 
     * @param MiddleName Middle name of the applicant.
     */
    public void setMiddleName(String MiddleName) {
        this.MiddleName = MiddleName;
    }

    /**
     * Getter method for LastName field.
     * 
     * @return Last name of the applicant.
     */
    public String getLastName() {
        return LastName;
    }

    /**
     * Setter method for LastName field.
     * 
     * @param LastName Last name of the applicant.
     */
    public void setLastName(String LastName) {
        this.LastName = LastName;
    }
    
    /**
     * Getter method for Email field.
     * 
     * @return Email address of the applicant.
     */
    public String getEmail() {
        return Email;
    }

    /**
     * Setter method for Email field.
     * 
     * @param Email Email address of the applicant.
     */
    public void setEmail(String Email) {
        this.Email = Email;
    }

    /**
     * Getter method for PhoneNumber field.
     * 
     * @return Phone number of the applicant.
     */
    public int getPhoneNumber() {
        return PhoneNumber;
    }

    /**
     * Setter method for PhoneNumber field.
     * 
     * @param PhoneNumber Phone number of the applicant.
     */
    public void setPhoneNumber(int PhoneNumber) {
        this.PhoneNumber = PhoneNumber;
    }

    /**
     * Getter method for Degree field.
     * 
     * @return Highest degree obtained by the applicant.
     */
    public String getDegree() {
        return Degree;
    }
    
    /**
 * Sets the degree of the admission model.
 * 
 * @param Degree the degree to set
 */
public void setDegree(String Degree) {
    this.Degree = Degree;
}

/**
 * Gets the birth date of the admission model.
 * 
 * @return the birth date
 */
public Date getBirthDay() {
    return BirthDay;
}

/**
 * Gets the birth date of the admission model as a string formatted as "yyyy-MM-dd".
 * 
 * @return the birth date as a string
 */
public String getDateOfBirth() {
        DateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
        if (this.BirthDay != null) {
            return formatter.format(this.BirthDay);
        }
        return "";
    }


/**
 * Sets the birth date of the admission model from a string formatted as "yyyy-MM-dd".
 * 
 * @param BirthDay the birth date to set as a string
 */
 public void setBirthDay(String BirthDay) {
        DateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
        try {
            this.BirthDay = formatter.parse(BirthDay);
        } catch (ParseException ex) {
            Logger.getLogger(AdmissioModel.class.getName()).log(Level.SEVERE, null, ex);
        }
    }




/**
 * Gets the photo passport of the admission model.
 * 
 * @return the photo passport
 */
public byte[] getPhotoPasspport() {
    return PhotoPasspport;
}

/**
 * Sets the photo passport of the admission model.
 * 
 * @param PhotoPasspport the photo passport to set
 */
public void setPhotoPasspport(byte[] PhotoPasspport) {
    this.PhotoPasspport = PhotoPasspport;
}

/**
 * Gets the diplomat of the admission model.
 * 
 * @return the diplomat
 */
public byte[] getDiplomat() {
    return Diplomat;
}

/**
 * Sets the diplomat of the admission model.
 * 
 * @param Diplomat the diplomat to set
 */
public void setDiplomat(byte[] Diplomat) {
    this.Diplomat = Diplomat;
}

/**
 * Gets the gender of the admission model.
 * 
 * @return the gender
 */
public String getGender() {
    return Gender;
}

/**
 * Sets the gender of the admission model.
 * 
 * @param Gender the gender to set
 */
public void setGender(String Gender) {
    this.Gender = Gender;
}

/**
 * Gets the status of the admission model.
 * 
 * @return the status
 */
public String getStatus() {
    return Status;
}

/**
 * Sets the status of the admission model.
 * 
 * @param Status the status to set
 */
public void setStatus(String Status) {
    this.Status = Status;
}

    
}