/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.exam;



import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;
import org.primefaces.event.CloseEvent;
import org.primefaces.event.ToggleEvent;



/**
 *
 * @author l2pc208e
 */
@ManagedBean
public class PanelBean {
    
       public void onClose(CloseEvent event) {
        FacesMessage message = new FacesMessage(FacesMessage.SEVERITY_INFO, "Panel Closed", "Closed panel Hello");
        FacesContext.getCurrentInstance().addMessage(null, message);
    }
     public void onToggle(ToggleEvent event) {
        FacesMessage message = new FacesMessage(FacesMessage.SEVERITY_INFO, " toggled", "Status:");
        FacesContext.getCurrentInstance().addMessage(null, message);
    }
    
}
