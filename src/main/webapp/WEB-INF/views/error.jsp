<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<!DOCTYPE html>
<html>
<head>
<!-- Standard Meta -->
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
<meta name="viewport" content="width=device-width, initial-scale=1.0, maximum-scale=1.0">
<link type="text/css" rel="stylesheet" href="${pageContext.request.contextPath}/resources/lib/semantic/semantic.min.css">
<link type="text/css" rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/custom.css">

</head>
<body>
	<div class="ui two column centered grid">
	  <div class="row">
	    <div class="column"></div>
	    <div class="column"></div>
	  </div>
	  <div class="row">
	    <div class="middle aligned  left aligned column">
		    <label class="deg">Something went wrong.</label><br>
		    <label class="currency">Please contact your administrator.</label>
	    </div>
	  </div>
	  <div class="row">
	    <div class="column"></div>
	    <div class="column"></div>
	  </div>
	</div>
</body>
<script type="text/javascript" src='${pageContext.request.contextPath}/resources/lib/jquery-3.2.0.min.js'></script>
<script type="text/javascript" src='${pageContext.request.contextPath}/resources/lib/semantic/semantic.min.js'></script>
<script type="text/javascript" src='${pageContext.request.contextPath}/resources/js/home.js'></script>
</html>