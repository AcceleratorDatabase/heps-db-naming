/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package heps.db.naming.service;

import heps.db.naming.api.DeviceAPI;
import heps.db.naming.api.DeviceTypeAPI;
import heps.db.naming.entity.Device;
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
public class DeviceService implements Serializable{

    private List<Device> deviceList;
    private DeviceAPI api;
    
    public DeviceService() {
        api=new DeviceAPI();
        this.deviceList=api.getAllDevice();
    }
    
    public List<Device> getDeviceList() {      
        return this.deviceList;
    }
    
     public void setDeviceList(List<Device> deviceList) {
        this.deviceList=deviceList;
    }
       
}
