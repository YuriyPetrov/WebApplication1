/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controls;

import entity.Anodegrounding;
import entity.Cathodicconverter;
import entity.Cathodicprotection;
import entity.Expluatationcontrol;
import entity.Plannedpreventivemaintenance;
import entityhelpers.CathodProtecthelper;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.model.DataModel;
import javax.faces.model.ListDataModel;

/**
 *
 * @author profi
 */
@ManagedBean
@RequestScoped
public class CathPtotectController {

    int startId;
    int endId;
    int findID;
    DataModel cathodProtect;
    CathodProtecthelper helper;
    private int recordCount = 1000;
    private int pageSize = 10;
    DataModel cathodConverter;
    DataModel anodeGrounding;
    DataModel expControll;
    DataModel maintrance;

    private Cathodicprotection current;
    private Cathodicconverter currentConverter;
    private Anodegrounding currentAnodic;
    private Expluatationcontrol currentExpcontrol;
    private Plannedpreventivemaintenance currentMaintrance;
 
    private int selectedItemIndex;
    
    public CathPtotectController() {
        helper = new CathodProtecthelper();
        startId = 1;
        endId = 10;
    }
    
    public DataModel getProtectors() {
        if (cathodProtect == null) {
            cathodProtect = new ListDataModel(helper.getCathodeProtector(startId, endId));
        }
        return cathodProtect;
    }
    
    public DataModel getCathodicConverter(){
        if (cathodConverter == null) {
            cathodConverter = new ListDataModel(helper.getCathodicConverterbyID(current.getId()));
        }
        return cathodConverter;
    }
   
    public DataModel getAnodeGrounding(){
        if (anodeGrounding == null) {
            anodeGrounding = new ListDataModel(helper.getAnodeGroundingbyID(current.getId()));
        }
        return anodeGrounding;
    }
    public DataModel getExpluatationcontrol(){
        if (expControll == null) {
            expControll = new ListDataModel(helper.getExpluatationcontrolbyID(current.getId()));
        }
        return expControll;
    }
    public DataModel getPlannedpreventivemaintenance(){
        if (maintrance == null) {
            maintrance = new ListDataModel(helper.getPlannedpreventivemaintenancebyID(current.getId()));
        }
        return maintrance;
    }
    public Cathodicprotection getSelected() {
        if (current == null) {
            current = new Cathodicprotection();
            selectedItemIndex = -1;
        }
        
        return current;
    }
    public String prepareView() {
        current = (Cathodicprotection) getProtectors().getRowData();       
        return "browse";
    }
}