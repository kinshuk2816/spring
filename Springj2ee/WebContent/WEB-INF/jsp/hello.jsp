<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<%@ page import="first.HibernateUtil" %>
 <%@ page import="first.add,java.util.*"%>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<p><b>AA GYAAAAA!!!!!</b></p>
 <form action="register">
<input type="text" placeholder="name" value="${name} "name="name">
<input type="text" placeholder="password" value="${password}" name="passsword">

 
 <input type=submit name=registration value=register>
 </form>
 <form>
 <input type=submit name=display  formaction=display    value=display>
 </form>
                               
   <table border=2>
<tr>  <th>ID </th> <th>Name</th>  <th>Password</th></tr>

	<% 
	List users=(List)request.getAttribute("users");
	if(users!=null){
		Iterator itr = users.iterator();
		while(itr.hasNext()){
			add user =(add) itr.next();
		
%>
<tr>
<td><%=user.getUserid()%></td>
<td><%=user.getName()%></td>
<td><%=user.getPasssword()%></td>
</tr>
<%}} else{%>
	

<%} %>
</table>

</body>
</html>