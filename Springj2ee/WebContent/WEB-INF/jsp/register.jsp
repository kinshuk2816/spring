<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form onsubmit="return validate()" action="done">

   <div class="imgcontainer">
    <img src="https://i.pinimg.com/originals/5c/42/68/5c42682a9dc41431e420448ec7a4ed2a.png" alt="LOL" class="avatar">
  </div>
  

  <div class="container">
  
  
                     <div class="row">
 <div class="col-lg-4" >
 <div class="form-group input-group">
            <span class="input-group-addon"><i class="glyphicon glyphicon-user"></i></span>
            <input class="form-control" type="text" name='Name' placeholder="Name" id="n1" required="required"/><span id="s1" ></span>
</div></div></div>

             <div class="row">
 <div class="col-lg-4">
     <div class="form-group input-group">
            <span class="input-group-addon"><i class="glyphicon glyphicon-envelope"></i></span>
            <input class="form-control" type="e-mail" name='Email' placeholder="E-mail" required="required"/>    <span id="s2"></span>
</div></div></div>
        
        
        
        <div class="row">
 <div class="col-lg-4">
     <div class="form-group input-group">
            <span class="input-group-addon"><i class="glyphicon glyphicon-phone"></i></span>
            <input class="form-control" type="text" name='Mobile' placeholder="Mobile No." id="m1" required="required"/>    <span id="s3"></span>
</div></div></div>
        
      
    
        
        
                   <div class="row">
 <div class="col-lg-4">
     <div class="form-group input-group">
            <span class="input-group-addon"><i class="glyphicon glyphicon-map-marker"></i></span>
            <input class="form-control" type="text" name='Place' placeholder="Place" id="p1"  required="required"/>    <span id="s4"></span>
</div></div></div>
        
        
 
        
        
        
        
   
        
        <div class="row">
         <div class="col-lg-4">
    <button type="submit" class="form-control"  value=done>Submit</button>
    </div></div>
   
  </div> </form>
 


</body>

</html>






