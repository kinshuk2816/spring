<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<p><b>Welcome to Spring MVC Tutorial</b></p> 
<a href="hello">hello </a>  


<h1><b>Log In</b></h1> 
<form onsubmit="return validate()" action=submit>
<input type="text" placeholder="name" name="name" id="n1">
<input type="password" placeholder="password" name="password" id="p1">

<input type="submit"><br>

<span id="s1">${message}</span><br>
<span id="s2">${password}</span>
</form>
<script>

function validate()
{
	var name1=document.getElementById("n1").value;
	 var pswd1=document.getElementById("p1").value;
	
   var patternName="^[A-Z a-z]+$";
   var patternPswd="^[A-Za-z0-9@#]+$";




if (name1.match(patternName) && pswd1.match(patternPswd)) {
	document.getElementById("s1").innerHTML="  "  ;
	document.getElementById("s2").innerHTML="  " ;
	return true;
}
else if(name1.match(patternName)==null && pswd1.match(patternPswd)==null){
	console.log("name and password are empty");
	document.getElementById("s1").innerHTML=" Name cant be empty " ;
	document.getElementById("s1").style.color=('blue');
	document.getElementById("s2").innerHTML="Password cant be empty";
	document.getElementById("s2").style.color=('blue');
return false;
}

else  if (pswd1.match(patternPswd)==null) {
	console.log(" password is empty");
	document.getElementById("s2").innerHTML="Password cant be empty";
	document.getElementById("s2").style.color=('blue');
	document.getElementById("s1").innerHTML=" ";
	return false;
}

	    else if(name1.match(patternName)==null) {
	    	console.log(" name is empty");
	    	document.getElementById("s1").innerHTML=" Name cant be empty" ;
	    	document.getElementById("s1").style.color=('blue');
		document.getElementById("s2").innerHTML=" " ;
		
		return false;
	    }
	  

	  
	    









}






</script>




</body>
</html>