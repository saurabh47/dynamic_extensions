<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/c.tld" prefix="c" %>
<html>
<head>
<title>Dynamic Extensions</title>
<link rel="stylesheet" type="text/css" href="css/styleSheet.css" />
<script src="jss/dynamicExtensions.js" type="text/javascript"></script>
</head>
 <c:set var="existingFormsList" value="${formDefinitionForm.existingFormsList}"/>
 <jsp:useBean id="existingFormsList" type="java.util.List"/>

 <c:set var="createAs" value="${formDefinitionForm.createAs}"/>
 <jsp:useBean id="createAs" type="java.lang.String"/>

   <html:form styleId = "formDefinitionForm" action="/ApplyFormDefinitionAction" >
	  <body>
	 
	  	<html:errors />
         <table align = 'center' width='100%'>
	          <tr height = 40>
			     <td >
			     </td>
		      </tr>
		      <tr>
		     	  <td>
				  	 <table summary="" align = 'center' cellpadding="3" cellspacing="0" border="2">
					     <tr>
						  	 <td class="formMessage" colspan="3">* indicates a required field</td>
					     </tr>
					     <tr>
					           <td class="formTitle" height="20" colspan="3">
									<bean:message key="eav.new.form"/>
						   		</td>
					     </tr>
					     <tr>
							<td class="formRequiredNotice" width="5">*</td>
							
							<td class="formRequiredLabel">
								<bean:message key="eav.form.name"/> 
							</td>
							
							<td class="formField">
								<html:text styleClass="formDateSized"  maxlength="100" size="60"  property="formName" />
							</td>
						</tr>
					     <tr>
						 		<td class="formRequiredNotice" width="5">&nbsp;</td>
								<td class="formRequiredLabel">
									<bean:message key="eav.form.description"/> 
						 		</td>
								<td class="formField">
									<html:textarea styleClass="formDateSized"  rows = "5" cols="40"  property="description" />
								</td>
					      </tr>
					      <tr>
						  <td class="formRequiredNotice" width="5">*</td>
							
							<td class="formRequiredLabel">
								<bean:message key="eav.form.createAs"/> 
							</td>
					      	<td class="formField">
								<table>
									<tr class="formMessage">
									 <td >
										<html:radio value="NewForm" property="createAs" onclick="formCreateAsChanged()">New</html:radio>
										</td>
									</tr>
									<tr class="formMessage">
							<td >
										<html:radio value="ExistingForm" property="createAs" onclick="formCreateAsChanged()">Existing</html:radio>
										</td>
										 <td class="formField" width="5">

									<% if(createAs.equals("NewForm")) { %>
								<html:select property="selectForm" onchange="formSelectedAction()" styleClass="formDateSized"  size="1"  styleId="selectForm" disabled="true">
									<html:options collection="existingFormsList" labelProperty="name" property="value"/>
								</html:select>
								<% } else { %>
<html:select property="selectForm" onchange="formSelectedAction()" styleClass="formDateSized"  size="1"  styleId="selectForm" disabled="false">
									<html:options collection="existingFormsList" labelProperty="name" property="value"/>
								</html:select>
<% } %>
							
							</td>
									</tr>
								  </table>
								  </td>
					</table>
			 	</td>
			 </tr>
			 <tr height = 10>
			 	<td>
			 	</td>
			 </tr>
	 	</table>
		 <table summary="" align = 'left' cellpadding="5" cellspacing="0" border="0">
		    <tr height="5">
			  <td width="165">
				</td>
				<td>
					<html:submit styleClass="actionButton">
							<bean:message  key="buttons.save" />
					</html:submit>
				</td>
	
				<td>
					<html:button styleClass="actionButton" property="cancelButton" onclick="/LoadFormDefinitionAction.do">
							<bean:message  key="buttons.cancel" />
					</html:button>
				</td>	  <td width="275">
				</td>
				<td>
					<html:button styleClass="actionButton" property="nextButton" onclick="nextClicked()" >
							<bean:message  key="buttons.next" />
					</html:button>
				</td>
			
		</table>
		<html:hidden property="operation" value=""/>
		<html:hidden property="createAsTypeChanged" value=""/>
		<html:hidden property="entityIdentifier" value=""/>
	  </body>
   </html:form> 
