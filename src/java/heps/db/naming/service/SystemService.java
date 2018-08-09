/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package heps.db.naming.service;

import heps.db.naming.api.SystemAPI;
import java.io.Serializable;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.view.ViewScoped;
import heps.db.naming.entity.System;

/**
 *
 * @author Lvhuihui
 */
@ManagedBean
@ViewScoped
public class SystemService implements Serializable{

    private List<System> systemList;
    private SystemAPI api;
    
    public SystemService() {       
        api=new SystemAPI();
        this.systemList=api.getAllSystem();
    }
    
    public List<System> getSystemList() {      
        return this.systemList;
    }
    
     public void setSystemList(List<System> systemList) {
        this.systemList=systemList;
    }
       
}
