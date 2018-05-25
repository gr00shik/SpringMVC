<%@ taglib prefix="sf" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core_rt" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: Sergey
  Date: 24.05.2018
  Time: 11:44
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <link rel="stylesheet" href="css/notes.css">
    <title>Title</title>
</head>
<body>
<div class="head">
Hello:  ${user.name}.
</div>
<br/>
<c:forEach var="tmp" items="${noteList}">
<fieldset>
    <legend>Запись ${tmp.id}</legend>
    ${tmp.note}
</fieldset>
</c:forEach>
<sf:form modelAttribute="newNote" action="addNewNote" method="post">
    <br/>
<sf:textarea class="textarea" path="note" placeholder="enter new note here"/>
    <br/>
    <sf:button class="submit">ADD</sf:button>
</sf:form>

</body>
</html>
