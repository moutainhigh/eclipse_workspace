<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<title>主页面</title>
<style type="text/css">
	*{margin:0px;}
	.qrydiv{
		width:1000px;
		height:200px;
		margin:0 auto;
		border:1px solid red;
	}
	.qrydiv input{
		margin-top:4px;
	}
	.qrydiv .methodcode{
		width:400px;
		height:30px;
		margin:5px 0 0 10px;
		border:1px solid red;
	}
	
	.qrydiv .methodname{
		width:400px;
		height:30px;
		margin:5px 0 0 10px;
		border:1px solid red;
	}
	.qrydiv .methodenable{
		width:400px;
		height:30px;
		margin:5px 0 0 10px;
		border:1px solid red;
	}	
		.qrydiv .methoddescri{
		width:400px;
		height:30px;
		margin:5px 0 0 10px;
		border:1px solid red;
	}
	.qrydiv .outdatescape{
		width:900px;
		height:46px;
		margin:5px 0 0 10px;
		border:1px solid red;
	}
	.qrydiv .outdatescape .datescape{
		width:400px;
		height:30px;
		margin:5px 0 0 0;
		border:1px solid red;
	}
	.qrydiv .outdatescape .qrybtn{
		float:right;
		width:400px;
		height:30px;
		margin:-32px 60px 0 0;
		border:1px solid red;
	}
	.qrydiv .outdatescape .qrybtn a{
			background: #00BFFF;
			display: block;
			border-radius: 3px;
			width:60px;
			height:30px;
			margin-top:-6px;
			font-size: 16px;
			text-decoration:none;
			text-align:center;
			border:0px;
			cursor:pointer;
			padding:10px 0px 0px 0px;

	}
</style>
<style type="text/css">
	.cmdiv {
		width: 1000px;
		margin: 10px auto;
	}
	.cmdiv .cmtab{
	width: 1000px;
	}
	.cmdiv .cmtab thead{
		width:985px;
		height: 30px;
		float:left;
		margin:3px 0 0 1px;
		background:#A3D1D1;
	}
	.cmdiv .cmtab th{
		width: 160px;
		float:left;
		margin-top:4px;
	}
	.cmdiv .cmtab .cmbod{
		float:left;
		width:988px;
		margin:1px 1px 0px 0;
		line-height:25px;
	}
	.cmdiv .cmtab .cmbod td{
		width: 150px;
		float:left;
		font-size:14px;
		white-space: nowrap;
		overflow: hidden;
		text-overflow:ellipsis;
	}
</style>
	<script type="text/javascript" src="../js/jquery-2.1.1.min.js"></script>
	<script type="text/javascript">
	$(function(){
		$(".cmbod").each(function(){
			 $(this).find('tr:even').css("background","#fff");
			 $(this).find('tr:odd').css("background","#eee");
		});
	});
	
	$(function(){
		if(navigator.userAgent.indexOf("Chrome") >-1 || navigator.userAgent.indexOf("MSIE")>-1){
			$(".cmtab thead").css("width","944");
			$(".cmtab th").css("width","154");
		}else if(navigator.userAgent.indexOf("Firefox")>-1){
			$(".cmtab thead").css("width","985");
			$(".cmtab th").css("width","160");
		}
	});
	
	$(function(){
		$("#qryButton").click(function(){
	        $.ajax( { 
	            type : "post", 
	            url : "qryAjax.do",
	            data :{
	            	"methodCode":$("#qryCode").val(),
	            	"methodName":$("#qryName").val(),
	            	"isdelete":$("#qryEnable").val(),
	            	"description":$("#qryDes").val(),
	            	"random":new Date().getMilliseconds(),
	            }, 
	            dataType: "text", 
	            success : function(data) { 
	        		var jsonObj=eval(data);
	        		var html = "";
	        		var bgc = "#fff";
	        		$.each(jsonObj, function (i, item) {
	        			if(i % 2 == 0){
	        				bgc = "#fff";
	        			}else{
	        				bgc ="#eee";
	        			}
	        			html +="<tr style = 'background:" +bgc;
	        			html +=";'><td id='code'>"+item.methodCode;
	        			html+="</td><td id='methodName'>"+item.methodName;
	        			html+="</td><td style='width:222px;'>"+item.description;
	        			html+="</td><td>"+item.createtime;
	        			html+="</td><td>"+item.updatetime;
	        			html+="</td><td>"+item.isdelete;
	        			html+="</td></tr>";
	        		});
	        		
	        		$(".cmbod").html("");
	        		$(".cmbod").html(html);
	            } 
	        });
		});
	})
	
	
	
	</script>
</head>
<body>
	<div class="qrydiv">
		<form id="qryForm" action="qryAjax">
			<div class="methodcode">
				<label>编&nbsp;&nbsp;码:</label>
				<input id="qryCode" name="qryCode" type="text" maxlength="30"/>		
			</div>
			<div class="methodname">
				<label>名&nbsp;&nbsp;称:</label>
				<input id="qryName" name="qryName" type="text" maxlength="30"/>				
			</div>
			<div class="methodenable">
				<label>可用否:</label>
				<input id="qryEnable" name="qryEnable" type="text" maxlength="30"/>				
			</div>
			<div class="methoddescri">
				<label>描&nbsp;&nbsp;述:</label>
				<input id="qryDes" name="qryDes" type="text" maxlength="30"/>				
			</div>
			<div class="outdatescape">
				<div class="datescape">
				
				</div>	
				<div class="qrybtn">
					<a id="qryButton" href="#">查询</a>
				</div>		
			</div>
		</form>	

	</div>
	<div class="cmdiv">
		<table class="cmtab">
			<thead>
				<tr>
					<th>编号</th>
					<th>名称</th>
					<th>描述</th>
					<th>创建时间</th>
					<th>更新时间</th>
					<th>可用否</th>
				</tr>
			</thead>

			<tbody class="cmbod">
				<c:forEach items="${list}" var="entity">
				<tr style = "background:;">
					<td id="code">${entity.methodCode }</td>
					<td id="methodName">${entity.methodName }</td>
					<td style="width:222px;">${entity.description }</td>
					<td>${entity.createtime }</td>
					<td>${entity.updatetime }</td>
					<td>${entity.isdelete }</td>
				</tr>
				</c:forEach>
			</tbody>
		</table>
	</div>
</body>
</html>
