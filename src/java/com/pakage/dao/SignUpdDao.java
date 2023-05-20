/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pakage.dao;

import com.pakage.model.SignUpModel;
import java.util.ArrayList;
import java.util.List;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author michael
 */
public class SignUpdDao {
    
    public boolean SaveAccount(SignUpModel account) {
        boolean result = false;
        Session session = FactoryManager.getSessionFactory().openSession();
        Transaction tx = session.beginTransaction();
        session.save(account);
        tx.commit();
        session.close();
        result = Boolean.TRUE;
        return result;
    }

    public boolean updateAccount(SignUpModel account) {
        boolean result = false;
        Session session = FactoryManager.getSessionFactory().openSession();
        Transaction tx = session.beginTransaction();
        session.update(account);
        tx.commit();
        session.close();
        result = Boolean.TRUE;
        return result;
    }
    
    public List<SignUpModel> findAccounts(){
        Session session = null;
        List<SignUpModel> result = new ArrayList<>();
        try {
            session = FactoryManager.getSessionFactory().openSession();
            result = session.createQuery("from SignUpModel").list();
        } catch (HibernateException ex) {
        } finally {
            if (session != null) {
                session.close();
            }
        }
        return result;
    }
    
}
