package com.tags;

import java.io.IOException;
import javax.servlet.jsp.JspException;
import javax.servlet.jsp.tagext.SimpleTagSupport;


public class DateTimeTag extends SimpleTagSupport{
    @Override
    public void doTag() throws JspException, IOException{
        getJspContext().getOut().write("This is Mohammad Moniruzzaman");
    }
    
}
