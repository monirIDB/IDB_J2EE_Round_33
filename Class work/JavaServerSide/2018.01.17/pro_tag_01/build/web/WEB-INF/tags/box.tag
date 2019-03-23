<%-- 
    Document   : box
    Created on : Jan 18, 2018, 5:31:14 PM
    Author     : l2pc208e
--%>

<%@tag description="put the tag description here" pageEncoding="UTF-8"%>

<%-- The list of normal or fragment attributes can be specified here: --%>
<%@attribute name="message"%>
<%@attribute name="color" required="true" rtexprvalue="false"%>
<%@attribute name="title" required="true" rtexprvalue="false" %>
<%@attribute name="titleSize" required="true" rtexprvalue="false" %>
<%@attribute name="bodySize" required="true" rtexprvalue="false" %>
<%@attribute name="titleColor" required="true" rtexprvalue="false" %>
<%@attribute name="footer" required="true" rtexprvalue="false" %>
<%@attribute name="align" required="true" rtexprvalue="false" %>


<table width="320" bordercolor="${color}" border="5" cellpadding = "4" cellspacing="0" >
    <tr bgcolor="${color}" color="#ffffff" style='font-size: ${titleSize}; color: ${titleColor}; '>
        <td class="boxHeader" nowrap>${title}</td>
    </tr>
   
    <tr>
        <td valign="top" class="boxText" style='font-size: ${bodySize}'>
            <jsp:doBody/>
        </td>
    </tr>
    <tr bgcolor="${color}" color="#ffffff" style='font-size: ${titleSize}; color: ${titleColor}; text-align: ${align}'>
        <td class="boxFooter">${footer}</td> 
    </tr>
</table>

<%-- any content can be specified here e.g.: --%>
<h2>${message}</h2>