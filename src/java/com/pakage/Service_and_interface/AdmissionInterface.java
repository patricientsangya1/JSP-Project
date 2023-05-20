/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pakage.Service_and_interface;

import com.pakage.model.AdmissioModel;
import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;

/**
 *
 * @author michael
 */
public interface AdmissionInterface extends Remote {

    public void saveAdmission(AdmissioModel admission) throws RemoteException;
    public void updateAdmission(AdmissioModel admission) throws RemoteException;
    public void deleteAdmission(AdmissioModel admission) throws RemoteException;
    public List<AdmissioModel> getAdmitedStudents() throws RemoteException;
    public AdmissioModel getonestudent(String email) throws RemoteException;
 }
