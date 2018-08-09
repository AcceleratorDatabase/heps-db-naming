/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package heps.db.naming.service;

import heps.db.naming.api.DeviceTypeAPI;
import heps.db.naming.entity.DeviceType;
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
public class DeviceTypeService implements Serializable{

    private List<DeviceType> devicetypeList;
    private DeviceTypeAPI api;
    
    public DeviceTypeService() {
        api=new DeviceTypeAPI();
        this.devicetypeList=api.getAllDeviceType();
    }
    
    public List<DeviceType> getDevicetypeList() {      
        return this.devicetypeList;
    }
    
     public void setDevicetypeList(List<DeviceType> devicetypeList) {
        this.devicetypeList=devicetypeList;
    }
       
}
