/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package heps.db.naming.service;

import heps.db.naming.api.TSignalAPI;
import heps.db.naming.entity.TSignal;
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
public class TSignalService implements Serializable{

    private List<TSignal> tsignalList;
    private TSignalAPI api;
    
    public TSignalService() {
        api=new TSignalAPI();
        this.tsignalList=api.getAllTSignal();
    }
    
    public List<TSignal> getTSignalList() {      
        return this.tsignalList;
    }
    
     public void setSignalList(List<TSignal> tsignalList) {
        this.tsignalList=tsignalList;
    }
       
}
