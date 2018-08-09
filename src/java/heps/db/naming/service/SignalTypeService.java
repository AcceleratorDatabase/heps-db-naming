/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package heps.db.naming.service;

import heps.db.naming.api.SignalTypeAPI;
import heps.db.naming.entity.SignalType;
import java.io.Serializable;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.view.ViewScoped;

/**
 *
 * @author Lvhuihui
 */
@ManagedBean
@ViewScoped
public class SignalTypeService implements Serializable{

    private List<SignalType> signaltypeList;
    private SignalTypeAPI api;
    
    public SignalTypeService() {
        api=new SignalTypeAPI();
        this.signaltypeList=api.getAllSignalType();
    }
    
    public List<SignalType> getSignalTypeList() {      
        return this.signaltypeList;
    }
    
     public void setSignalTypeList(List<SignalType> signaltypeList) {
        this.signaltypeList=signaltypeList;
    }
       
}
