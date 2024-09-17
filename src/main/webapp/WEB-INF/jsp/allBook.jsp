<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>book list</title>
</head>
<body>
<div class="row clearfix">
    <div class="col-md-12 column">
        <table class="table table-hover table-striped">
            <thead>
            <tr>
                <th>book id</th>
                <th>book name</th>
                <th>stock number</th>
                <th>detail</th>
            </tr>
            </thead>

            <tbody>
            <c:forEach var="book" items="${requestScope.get('list')}">
                <tr>
                    <td>${book.getBookID()}</td>
                    <td>${book.getBookName()}</td>
                    <td>${book.getBookCounts()}</td>
                    <td>${book.getDetail()}</td>
                </tr>
            </c:forEach>
            </tbody>
        </table>
    </div>
</div>
