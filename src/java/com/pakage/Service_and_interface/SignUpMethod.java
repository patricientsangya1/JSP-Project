/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pakage.Service_and_interface;

import com.pakage.dao.SignUpdDao;
import com.pakage.model.SignUpModel;
import java.rmi.RemoteException;
import java.util.List;

/**
 *
 * @author michael
 */
public class SignUpMethod implements SignUpInterface{
    
    SignUpdDao signupdao = new SignUpdDao();

    public SignUpMethod()   throws RemoteException{
        super();
    }
    
    @Override
    public void saveAccount(SignUpModel account) throws RemoteException {
            signupdao.SaveAccount(account);
    }

    @Override
    public void updateAcount(SignUpModel account) throws RemoteException {
            signupdao.updateAccount(account);
    }

    @Override
    public List<SignUpModel> getAllAcounts() throws RemoteException {
      return signupdao.findAccounts();  
    }

}
