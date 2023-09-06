<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>Your Details ${id.cust_id}</h1>
<input type="button" value="Done" id="b1"/>
<script type="text/javascript">
document.getElementById("b1").addEventListener("click", function() {
	var cust_phone=${id.cust_mobile};
    console.log(cust_phone);
    if(cust_phone==1)
   {
    window.location.href="finalpage?status=true";
   }else
	   {
	   window.location.href="finalpage?status=flase";
	   }
});


</script>
</body>
</html>