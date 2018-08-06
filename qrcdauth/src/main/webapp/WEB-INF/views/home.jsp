<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<html>
<head>
	<title>peten test project</title>
</head>
<script type="text/javascript">
	setInterval("dpTime()", 1000);
	function dpTime(){
		var now = new Date();
		hours = now.getHours();
		minutes = now.getMinutes();
		seconds = now.getSeconds();
		
		if(hours > 12){
			hours -= 12;
			ampm = "오후 ";
		} else {
			ampm = "오전 ";
		}
		
		if(hours < 10){
			hours = "0" + hours;
		}
		
		if(minutes < 10){
			minutes = "0" + minutes;
		}
		
		if(seconds < 10){
			seconds = "0" + seconds;
		}
		
		document.getElementById("dpTime").innerHTML = ampm + hours + ":" + minutes + ":" + seconds;
	}
</script>
<body>
<h1>
	Project #001
</h1>


<P>  The time is <span id="dpTime">오전 00:00:00</span></P>

</body>
</html>
