<%@ page language="java" contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>

<html>
<head>
<title>Confirm page</title>
</head>
<body>
<h1>Resultat</h1>
 <table>
 
 <c:forEach items="${ingredients}" var="ings">
      
        <tr>
        <td>
            <c:out value="${ings.nom_ingredient}" />
        </td>
        <td><c:out value="${ings.prix_ingredient}" /></td>
        </tr>
    </c:forEach>
    </table>
</body>
</html>