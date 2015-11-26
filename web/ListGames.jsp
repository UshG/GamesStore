<%@taglib prefix="sql" uri="http://java.sun.com/jsp/jstl/sql"%>
<%-- 
    Document   : ListGames
    Author     : Ush-Work
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%> 
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>All Games</title>
    </head>
    <body>
        <h1>Listing all Games in the store database</h1>
        
    <sql:query var="allGames" dataSource="GamesStorePUDS">
        SELECT * FROM Game
    </sql:query>
        
    <table border="1">
        <!-- column headers -->
        <tr>
            <c:forEach var="columnName" items="${allGames.columnNames}">
                <th><c:out value="${columnName}"/></th>
                </c:forEach>
        </tr>
        <!-- column data -->
        <c:forEach var="row" items="${allGames.rowsByIndex}">
            <tr>
                <c:forEach var="column" items="${row}">
                    <td><c:out value="${column}"/></td>
                </c:forEach>
            </tr>
        </c:forEach>
    </table>
        
    </body>
</html>
