<%-- Jsp Summary                                                                                 	--%>
<%-- ---------------------------------------------------------------------------------------------- --%>
<%-- @author : chetan_patil

<%-- TagLibs --%>
<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/c.tld" prefix="c" %>

<%-- Imports --%>
<%@	
	page language="java" contentType="text/html" 
    import="java.util.List"
    import="java.util.Collection"
    import="edu.common.dynamicextensions.entitymanager.EntityManagerInterface"
%>

<%-- Stylesheet --%>
<link rel="stylesheet" type="text/css" href="css/stylesheet.css" />

<html>
	<head>
		<bean:message key="table.heading" />
	</head>
	
	<body  class='bodyStyle'>
		
		<c:set var="entityList" value="${formsIndexForm.entityList}"/>
 		<jsp:useBean id="entityList" type="java.util.Collection"/>
							
		<table border='0' align='center'>
			<tr>
				<td align='center'>
					<bean:message key="table.heading" />
				</td>
			</tr>
			
			<tr>
				<td align='left'>
					<html:button>
						<bean:message key="buttons.build.form" />
					</html:button>
				</td>
			</tr>
			
			<tr>
				<table >				
					<tr>
						<th>
							<html:checkbox property="dummy"/>
						</th>
						
						<th align='left'>
							<bean:message key="table.title" />
						</th>
						
						<th align='left'>
							<bean:message key="table.date" />
						</th>
						
						<th align='left'>
							<bean:message key="table.createdBy" />
						</th>
						
						<th align='left'>
							<bean:message key="table.status" />
						</th>			
					</tr>
					
					<c:forEach items="${entityList}" var="entityInstance">
					<jsp:useBean id="entityInstance" type="edu.common.dynamicextensions.domaininterface.EntityInterface" />
					
			   		<tr>			   		   
						<td> <html:checkbox property="entityListCheckBox"/> </td>
			       		<td> <%= entityInstance.getAttribute("Entity", "name") %> </td>
			       		<td> <%= entityInstance.getAttribute("Entity", "createdDate") %> </td>
			       		<td> Robert Lloyd </td>
			       		<td> In Progress </td>
			       	</tr>
				</table>
			</tr>
			
			<tr>
				<td align='left'>
					<html:button>
						<bean:message key="buttons.delete" />
					</html:button>
				</td>
			</tr>
			
			<tr>
				<td>
					<h4><a align='center' href="/dynamicExtensions/LoadFormDefinitionAction.do">Create A Form</a>
					</h4>
				</td>
			</tr>			
		</table>
	</body>
</html>

