<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<script type="text/javascript" src="js/jquery-1.9.1.js"></script>
</head>
<body>
	<input type="button" onclick="copyText()" value="test" />
	<a href="findAll.action">点击查看数据</a>
</body>
<script type="text/javascript">
function copyText(){
	$.ajax({
		url:"findAll.action",
		type:"POST",
		dataType:"text",
		success:function(data){
			alert(data);
		}	
	});
	
}


	
	
</script>
</html>