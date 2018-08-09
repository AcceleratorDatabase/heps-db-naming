/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package heps.db.naming.service;

import heps.db.naming.api.SubsystemAPI;
import heps.db.naming.entity.Subsystem;
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
public class SubsystemService implements Serializable{

    private List<Subsystem> subsystemList;
    private SubsystemAPI api;
    
    public SubsystemService() {
        api=new SubsystemAPI();
        this.subsystemList=api.getAllSubsystem();
    }
    
    public List<Subsystem> getSubsystemList() {      
        return this.subsystemList;
    }
    
     public void setSubsystemList(List<Subsystem> subsystemList) {
        this.subsystemList=subsystemList;
    }
       
}
