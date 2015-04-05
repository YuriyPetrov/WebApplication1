package entityhelpers;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import entity.Cathodicconverter;
import entity.Cathodicconverter;
import dbutils.HibernateUtil;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;

/**
 *
 * @author profi
 */
public class Cathodhelper {
      Session session = null;

    public Cathodhelper() {
        this.session = HibernateUtil.getSessionFactory().getCurrentSession();
}
    
 public List getCathodeInf(int startID, int endID) {
    List<Cathodicconverter> cathList = null;
    try {
        org.hibernate.Transaction tx = session.beginTransaction();
        Query q = session.createQuery ("from Cathodicconverter");
        cathList = (List<Cathodicconverter>) q.list();
    } catch (Exception e) {
        e.printStackTrace();
    }
    return cathList;
 }
 
 public void addCathodic(int startID, int endID) {

    }
}
