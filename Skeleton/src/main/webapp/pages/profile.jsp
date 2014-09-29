<%@ page language="java" pageEncoding="UTF-8" contentType="text/html;charset=utf-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>



<c:import url="template/header.jsp" />


<h1>User profile of user ${user.firstName} ${user.lastName}</h1>


	<table border="1px" cellpadding="8px">
		<tr>
			<td>Id</td>
			<td>First Name</td>
			<td>Last Name</td>
			<td>E-Mail</td>
			<td>Team Name</td>
		</tr>

                <tr>
                        <td><c:out value="${user.userId}" /></td>
                        <td><c:out value="${user.firstName}" /></td>
                        <td><c:out value="${user.lastName}" /></td>
                        <td><c:out value="${user.email}" /></td>
                        <td><c:out value="${user.teamName.teamName}" /></td>
                </tr>
		
	</table>



<c:import url="template/footer.jsp" />
