<%@page contentType="text/html"%>
<%@page pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>

	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<title>用户注册</title>
		<script src="https://cdn.bootcss.com/jquery/3.2.1/jquery.min.js"></script>
		<script src="https://cdn.bootcss.com/bootstrap/4.0.0-beta/js/bootstrap.js"></script>

		<link href="https://cdn.bootcss.com/bootstrap/4.0.0-beta/css/bootstrap.css" rel="stylesheet">
	</head>

	<body>
		<div class="container">
			<div class="row clearfix">
				<div class="col-md-12 column">
					<div class="row clearfix">
						<div class="col-md-2 column">
						</div>
						<div class="col-md-6 column">
							<form  action="user_registry.action">
								<div class="form-group">
									<label for="exampleInputEmail1">Username</label><input class="form-control" id="exampleInputEmail1" type="text" name="login.username" id="username" />
								</div>
								<div class="form-group">
									<label for="exampleInputPassword1">Password</label><input class="form-control" id="exampleInputPassword1" type="password" name="login.password" id="password" />
								</div>
								<div class="form-group">
									<label for="exampleInputPassword1">Confirm</label><input class="form-control" id="exampleInputPassword1" type="password" name="confirm" id="confirm" />
								</div>
								<div class="form-group">
									<label for="exampleInputPassword1">Prority</label>
								</div>
								<select class="custom-select" name="login.prority">
									<option value="1" selected="selected">1</option>
									<option value="2">2</option>
								</select>
								<div class="form-group">
									<label for="exampleInputPassword1">Realname</label><input class="form-control" id="exampleInputPassword1" type="text" name="detail.realname" />
									<label for="exampleInputPassword1">Realname</label><input class="form-control" id="exampleInputPassword1" type="password" name="detail.realname"/>
								</div>
								&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
								&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
								
								<button type="submit" class="btn active btn-default btn-success" id="sub">注册</button>
								<button type="reset" class="btn active btn-default btn-success">重置</button>
							</form>
						</div>
						<div class="col-md-4 column">
						</div>
					</div>
				</div>
			</div>
		</div>

	</body>
</html>