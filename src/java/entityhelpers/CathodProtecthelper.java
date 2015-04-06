/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entityhelpers;

import dbutils.HibernateUtil;
import entity.Anodegrounding;
import entity.Cathodicconverter;
import entity.Cathodicprotection;
import entity.Expluatationcontrol;
import entity.Plannedpreventivemaintenance;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;

/**
 *
 * @author profi
 */
public class CathodProtecthelper {
         Session session = null;

    public CathodProtecthelper() {
        this.session = HibernateUtil.getSessionFactory().getCurrentSession();
}
    
 public List getCathodeProtector(int startID, int endID) {
    List<Cathodicprotection> cathList = null;
    try {
        org.hibernate.Transaction tx = session.beginTransaction();
        Query q = session.createQuery ("from Cathodicprotection");
        cathList = (List<Cathodicprotection>) q.list();
    } catch (Exception e) {
        e.printStackTrace();
    }
    return cathList;
    }
 
 public Cathodicprotection getCathodeProtectorbyID(int cathID) {
    Cathodicprotection cathod = null;
    try {
        org.hibernate.Transaction tx = session.beginTransaction();
        Query q = session.createQuery ("from Cathodicprotection as c where c.id_protect="+ cathID);
        cathod = (Cathodicprotection) q.uniqueResult();
    } catch (Exception e) {
        e.printStackTrace();
    }
    return cathod;
    }
 
    public List<Cathodicconverter> getCathodicConverterbyID(int cathconvID){
       List<Cathodicconverter> cathodconv = null;
    try {
        org.hibernate.Transaction tx = session.beginTransaction();
        Query q = session.createQuery ("from Cathodicconverter as c where c.idprotect="+ cathconvID);
        cathodconv = (List<Cathodicconverter>) q.list();
    } catch (Exception e) {
        e.printStackTrace();
    }
    return cathodconv;           
    }
    
    public List<Anodegrounding> getAnodeGroundingbyID(int anodeID){
        List<Anodegrounding> anode = null;
    try {
        org.hibernate.Transaction tx = session.beginTransaction();
        Query q = session.createQuery ("from Anodegrounding as c where c.idprotect="+ anodeID);
        anode = (List<Anodegrounding>) q.list();
    } catch (Exception e) {
        e.printStackTrace();
    }
        return anode;
    }
    
    public List<Expluatationcontrol> getExpluatationcontrolbyID(int explID){
        List<Expluatationcontrol> expcontrol = null;
     try {
        org.hibernate.Transaction tx = session.beginTransaction();
        Query q = session.createQuery ("from Expluatationcontrol as c where c.idprotect="+ explID);
        expcontrol = (List<Expluatationcontrol>) q.list();
    } catch (Exception e) {
        e.printStackTrace();
    }
        return expcontrol;
    }
    
    public List<Plannedpreventivemaintenance> getPlannedpreventivemaintenancebyID(int maintranceID){
        List<Plannedpreventivemaintenance> maintrance = null;
         try {
        org.hibernate.Transaction tx = session.beginTransaction();
        Query q = session.createQuery ("from Expluatationcontrol as c where c.idprotect="+ maintranceID);
        maintrance = (List<Plannedpreventivemaintenance>) q.list();
    } catch (Exception e) {
        e.printStackTrace();
    }
        return maintrance;
    }

}
