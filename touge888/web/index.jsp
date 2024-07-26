<%--
  Created by IntelliJ IDEA.
  User: 16252
  Date: 2024/3/20
  Time: 22:27
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>$Title$</title>
  </head>
  <body>
  <table width="800" cellpadding="0"  border = 1>
    <tr><td>i</td><td>i的平方</td></tr>

  <%
    for(int i=0;i<6;i++){
      String str2="<tr><td>"+i+"</td>"+"<td>"+i*i+"</td></tr>";
      out.println(str2);
    }
  %>
  </table>
  </body>
</html>
