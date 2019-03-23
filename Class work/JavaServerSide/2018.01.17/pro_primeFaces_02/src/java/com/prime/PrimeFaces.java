
package com.prime;

import javax.faces.bean.ManagedBean;

@ManagedBean
public class PrimeFaces {
    int num;
    int show;

    public int getNum() {
        
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public int getShow() {
       
        return show;
    }

    public void setShow(int show) {
        this.show = num;
    }
    
}
