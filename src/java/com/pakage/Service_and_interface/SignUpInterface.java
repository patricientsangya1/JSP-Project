/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pakage.Service_and_interface;

import com.pakage.model.SignUpModel;
import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;

/**
 *
 * @author michael
 */
public interface SignUpInterface extends Remote{
    
    public void saveAccount(SignUpModel account) throws RemoteException;
    public void updateAcount(SignUpModel account) throws RemoteException;
    public List<SignUpModel> getAllAcounts() throws RemoteException; 
}
