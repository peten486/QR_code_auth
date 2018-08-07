<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>

<!DOCTYPE html>
<html lang="ko">
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

<sec:authorize access="isAnonymous()">
<p><a href="<c:url value="/login/loginForm.do" />">로그인</a></p>
</sec:authorize>

<sec:authorize access="isAuthenticated()">
<form:form action="${pageContext.request.contextPath}/logout" method="POST">
    <input type="submit" value="로그아웃" />
</form:form>
</sec:authorize>

<h3>
    [<a href="<c:url value="/intro/introduction.do" />">소개 페이지</a>]
    [<a href="<c:url value="/admin/adminHome.do" />">관리자 홈</a>]
</h3>

</body>
</html>
