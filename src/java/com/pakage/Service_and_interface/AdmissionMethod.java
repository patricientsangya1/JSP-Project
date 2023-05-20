/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pakage.Service_and_interface;

import com.pakage.dao.AdmissionDao;
import com.pakage.model.AdmissioModel;
import java.rmi.RemoteException;
import java.util.List;

/**
 *
 * @author michael
 */
public class AdmissionMethod implements AdmissionInterface{
        AdmissionDao admissiondao = new AdmissionDao(); 
   public AdmissionMethod() throws RemoteException {
        super();
    }
     @Override
    public void saveAdmission(AdmissioModel admission) throws RemoteException {
        admissiondao.SaveAdmission(admission);
    }    

    @Override
    public void updateAdmission(AdmissioModel admission) throws RemoteException {
       admissiondao.updateAdmission(admission);
    }

    @Override
    public void deleteAdmission(AdmissioModel admission) throws RemoteException {
        admissiondao.deleteAdmission(admission);
    }

    @Override
    public List<AdmissioModel> getAdmitedStudents() throws RemoteException {
        return admissiondao.findAllAdmission();
    }

    @Override
    public AdmissioModel getonestudent(String Email) throws RemoteException {
         return admissiondao.findStudent(Email);
    }
        
    
    
}
