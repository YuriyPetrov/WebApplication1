package controls;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import entityhelpers.Cathodhelper;
import entity.Cathodicconverter;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.model.DataModel;
import javax.faces.model.ListDataModel;

/**
 *
 * @author profi
 */
@ManagedBean
@SessionScoped
public class CathController {
    int startId;
    int endId;
    DataModel cathodeInf;
    Cathodhelper helper;
    private int recordCount = 1000;
    private int pageSize = 10;

    private Cathodicconverter current;
    private int selectedItemIndex;
    
    public CathController() {
        helper = new Cathodhelper();
        startId = 1;
        endId = 10;
    }
    
     public CathController(int startId, int endId) {
        helper = new Cathodhelper();
        this.startId = startId;
        this.endId = endId;
    }

    public Cathodicconverter getSelected() {
        if (current == null) {
            current = new Cathodicconverter();
            selectedItemIndex = -1;
        }
        return current;
    }


    public DataModel getCathods() {
        if (cathodeInf == null) {
            cathodeInf = new ListDataModel(helper.getCathodeInf(startId, endId));
        }
        return cathodeInf;
    }

    void recreateModel() {
        cathodeInf = null;
    }
    public boolean isHasNextPage() {
        if (endId + pageSize <= recordCount) {
            return true;
        }
        return false;
    }

    public boolean isHasPreviousPage() {
        if (startId-pageSize > 0) {
            return true;
        }
        return false;
    }

    public String next() {
        startId = endId+1;
        endId = endId + pageSize;
        recreateModel();
        return "index";
    }

    public String previous() {
        startId = startId - pageSize;
        endId = endId - pageSize;
        recreateModel();
        return "index";
    }

    public int getPageSize() {
        return pageSize;
    }

    public String prepareView(){
        current = (Cathodicconverter) getCathods().getRowData();
        return "browse";
    }
    public String prepareList(){
        recreateModel();
        return "index";
    }
       
}
