
package com.accordian;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;
import org.primefaces.event.CloseEvent;
import org.primefaces.event.TabChangeEvent;
import org.primefaces.event.TabCloseEvent;

@ManagedBean
public class Tabbedview {
    public void m1(TabChangeEvent e){
        FacesMessage fm= new FacesMessage(FacesMessage.SEVERITY_INFO, "Accordion", "Get tab change");
        FacesContext.getCurrentInstance().addMessage("f", fm);
    }
    public void m2(TabCloseEvent m){
        FacesMessage fm= new FacesMessage(FacesMessage.SEVERITY_INFO, "Accordion", "Get tab Close");
        FacesContext.getCurrentInstance().addMessage("f", fm);
    }
}
