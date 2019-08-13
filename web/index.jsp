<%@ page import="java.util.ArrayList" %>
<%@ page import="Bean.Student" %>
<%@ page import="java.util.List" %>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: liyus
  Date: 2019/8/13
  Time: 12:46
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>学生信息</title>
  </head>
  <body>
  <form action="login" method="post">
  <div>
  <table>
    <tr>
      <th>学号</th>
      <th>姓名</th>
      <th>性别</th>
      <th>年级</th>
      <th>学院</th>
      <th>成绩</th>
    </tr>
    <%--<%--%>
      <%--List<Student> stu = (ArrayList<Student>) request.getAttribute("list");--%>
      <%--if(stu == null || stu.size()<1){--%>
          <%--out.print("没有学生信息");--%>
      <%--}--%>
      <%--else{--%>
        <%--for (Student student : stu) {--%>
          <%--%>--%>
    <%--<tr align="center">--%>
      <%--<td><%=student.getSno()%>--%>
      <%--<td><%=student.getSname()%>--%>
      <%--<td><%=student.getSsex()%>--%>
      <%--<td><%=student.getSgrade()%>--%>
      <%--<td><%=student.getSmajor()%>--%>
      <%--<td><%=student.getSscore()%>--%>
    <%--<%--%>
        <%--}--%>
      <%--}--%>
    <%--%>--%>

    <c:forEach var = "stu" items = "${requestScope.list}" varStatus="vs">
    <tr align="center">
      <td>${stu.sno}</td>
      <td>${stu.sname}</td>
      <td>${stu.ssex}</td>
      <td>${stu.sgrade}</td>
      <td>${stu.smajor}</td>
      <td>${stu.sscore}</td>
    </tr>
  </c:forEach>
    <tr>
      <td><input type="submit" value="刷新"></td>
    </tr>
  </table>
  </div>
  </form>
  </body>
</html>
