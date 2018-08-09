/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package heps.db.naming.entity.converter;

import heps.db.naming.api.SystemAPI;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.FacesConverter;

/**
 *
 * @author Lvhuihui
 */
@FacesConverter("systemConverter")
public class SystemConverter implements Converter {


    @Override
    public Object getAsObject(FacesContext fc, UIComponent uic, String string) {
        if (string == null || string.isEmpty()) {
            return null;
        } else {        
            return new SystemAPI().findBySystemName(string);
        }

    }

    @Override
    public String getAsString(FacesContext fc, UIComponent uic, Object o) {
        if (o == null || o.equals("")) {
            return "";
        } else {
            return ((heps.db.naming.entity.System) o).getSystemName();
        }

    }
}
