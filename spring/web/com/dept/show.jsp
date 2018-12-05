<%--
  Created by IntelliJ IDEA.
  User: Strry
  Date: 2018/11/28
  Time: 15:10
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<div id="search">
    <table>
        <form action="/mybaties/biz/showdept">
            <input type="hidden" name="type" value="serach">
            <tr>
                <td align="right">deptno:</td>
                <td><input type="text" id="deptno" name="deptno"></td>
            </tr>
            <tr>
                <td align="right">dname:</td>
                <td><input type="text" id="dname" name="dname"></td>
            </tr>
            <tr>
                <td align="right">loc:</td>
                <td><input type="text" id="loc" name="loc"></td>
            </tr>
            <tr colspan="2" align="center">
                <td><input type="submit" value="查询"></td>
                <td><input type="reset" value="清空"></td>
            </tr>
        </form>
    </table>
</div>
<div id="showdata">
    <table border="1">
        <tr>
            <th>DEPTNO</th>
            <th>DNAME</th>
            <th>LOC</th>
        </tr>
        <c:forEach items="${list}" var="dto">
            <tr>
                <td>${dto.deptNo}</td>
                <td>${dto.dName}</td>
                <td>${dto.loc}</td>
            </tr>
        </c:forEach>
    </table>
</div>
<div id="pagetoolbar"></div>


</body>
</html>
