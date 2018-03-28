<%@ page language="java" contentType="text/html; charset=UTF-8"
 pageEncoding="UTF-8" isELIgnored="false"%>
 
<%@ taglib prefix="s" uri="/struts-tags" %>
 
<%@page isELIgnored="false"%>
 
<table>
    <tr>
        <td>RoleName</td>
        <td>Description</td>
    </tr>
                 
<s:iterator value="roles" var="r">
    <tr>
        <td>${r.Id}</td>
        <td>${r.Description}</td>
    </tr>
</s:iterator>
 
</table>