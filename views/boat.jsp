<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>

<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>货船详情</title>
<meta charset="utf-8" />
<link href="css/bootstrap.min.css" rel="stylesheet">
<link
	href="https://cdn.bootcss.com/bootstrap/4.0.0-beta/css/bootstrap.css"
	rel="stylesheet">
<link
	href="https://cdn.bootcss.com/bootstrap-table/1.11.1/bootstrap-table.css"
	rel="stylesheet">
</head>

<body>
	<div class="container">
		<div class="row clearfix">
			<div class="col-md-12 column">
				<table class="table">
					<thead>
						<tr>
							<th>编号</th>
							<th>船名</th>
							<th>出发时间</th>
							<th>到达时间</th>
							<th>船票价格</th>
							<th>公司编号</th>
						</tr>
					</thead>
					<tbody>
						<c:if test="${!empty boatList }">
							<c:forEach items="${boatList }" var="boat">
								<tr class="info">
									<td>${boat.boatId }</td>
									<td><a href="${pageContext.request.contextPath }/bb_find_findByBoatId.action?boatId=${boat.boatId }">${boat.boatName }</a></td>
									<td>${boat.startTime }</td>
									<td>${boat.endTiem }</td>
									<td>${boat.boatPrice }</td>
									<td><a href="">${boat.company.companyName }</a></td>
								</tr>
							</c:forEach>
						</c:if>
						<c:if test="${empty boatList }">
							<tr><td colspan="6"><h1>航班结束，明天清早！</h1></td></tr>
						</c:if>
					</tbody>
				</table>
			</div>
		</div>
	</div>
	<script src="js/jquery-1.11.1.min.js"></script>
	<script src="js/bootstrap.min.js"></script>
</body>

</html>