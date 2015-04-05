/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controls;

import entity.Cathodicprotection;
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
    DataModel cathodProtect;
    CathodProtecthelper helper;
    private int recordCount = 1000;
    private int pageSize = 10;

    private Cathodicprotection current;
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
}
