<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>

	<head>
		<title>Insert title here</title>
		<meta charset="utf-8" />
		<link href="css/bootstrap.min.css" rel="stylesheet">
		<link href="https://cdn.bootcss.com/bootstrap/4.0.0-beta/css/bootstrap.css" rel="stylesheet">
		<link href="https://cdn.bootcss.com/bootstrap-table/1.11.1/bootstrap-table.css" rel="stylesheet">
	</head>

	<body>
		<div class="container">
			<div class="row clearfix">
				<div class="col-md-12 column">
					<table class="table">
						<thead>
							<tr>
								<form action="" method="post">
									<th>出发地：</th>
									<th><input type="text" name="" id="" value="" /></th>
									<th>目的地：</th>
									<th><input type="text" name="" id="" value="" /></th>
									<th><input type="submit" value="查询"/></th>
								</form>
							</tr>
							<tr>
								<th>
									编号
								</th>
								<th>
									始发地
								</th>
								<th>
									目的地
								</th>
								<th>
									价格
								</th>
							</tr>
						</thead>
						<tbody>
						<c:if test="${ !empty laneList }">
						<c:forEach items="${laneList }" var="lane">
							<tr class="info">
								<td>
									${lane.laneId }
								</td>
								<td>
									${lane.strartLocation }
								</td>
								<td>
									${lane.endLoaction }
								</td>
								<td>
									${lane.lanePrice }
								</td>
								<td>
									<a href="${pageContext.request.contextPath }/boat_find_findByLaneId.action?laneId=${lane.laneId }"><button type="button" class="btn active btn-default btn-success">查看</button></a>
								</td>
							</tr>
						</c:forEach>
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