<%@page import="java.util.ArrayList"%>
<%@page import="demo.po.*"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>

	<table border="1">
		<tr>
			<th>学号</th>
			<th>姓名</th>
		</tr>
		<%
		ArrayList<Person> personList =
		(ArrayList<Person>) request.getAttribute("personList");
			for (Person p : personList) {
		%>
		<tr>
			<td><%=p.getId()%></td>
			<td><%=p.getName()%></td>

		</tr>
		<%
	}
		%>
	</table>

</body>
</html>