/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pakage.dao;


import com.pakage.model.AdmissioModel;
import java.util.ArrayList;
import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;


/**
 *
 * @author michael
 */
public class AdmissionDao {
    
     public boolean SaveAdmission(AdmissioModel admission) {
        boolean result = false;
        Session session = FactoryManager.getSessionFactory().openSession();
        Transaction tx = session.beginTransaction();
        session.save(admission);
        tx.commit();
        session.close();
        result = Boolean.TRUE;
        return result;
    }

    public void updateAdmission(AdmissioModel admission) { 
        try{
            Session session = FactoryManager.getSessionFactory().openSession();
        
        Transaction tx = session.beginTransaction();
        session.update(admission);
        tx.commit();
        session.close();
        }catch(HibernateException ss){
            System.out.println("the accured error into update is::: "+ss);
        }
    }

    public List<AdmissioModel> findAllAdmission() {
        Session session = null;
        List<AdmissioModel> result = new ArrayList<>();
        try {
            session = FactoryManager.getSessionFactory().openSession();
            result = session.createQuery("from AdmissioModel").list();
        } catch (HibernateException ex) {
           System.out.println("error accoured |||||||||::::"+ ex);
        } finally {
            if (session != null) {
                session.close();
            }
        }
        return result;

    }

    public AdmissioModel findStudent(String email) {
        Session session = null;
        AdmissioModel result = null;
        try {
            session = FactoryManager.getSessionFactory().openSession();
            Criteria criteria = session.createCriteria(AdmissioModel.class);
            criteria.add(Restrictions.eq("Email", email));
         
            result = (AdmissioModel) criteria.uniqueResult();
            
        } catch (HibernateException ex) {
             System.out.println("error accoured |||||||||::::"+ ex);
        } finally {
            if (session != null) {
                session.close();
            }
            else {
                System.out.println("it wasn't null");
            }
          
        }
        return result;
    }

    public void deleteAdmission(AdmissioModel admissiont) {
        Session session = FactoryManager.getSessionFactory().openSession();
        Transaction tx = session.beginTransaction();
        session.delete(admissiont);
        tx.commit();
        session.close();
    }

    
}
