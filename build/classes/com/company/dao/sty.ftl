<!DOCTYPE html>
<html>
<head>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://cdn.bootcss.com/bootstrap/4.0.0-beta/css/bootstrap.min.css">
  <script src="https://cdn.bootcss.com/jquery/3.2.1/jquery.min.js"></script>
  <script src="https://cdn.bootcss.com/popper.js/1.12.5/umd/popper.min.js"></script>
  <script src="https://cdn.bootcss.com/bootstrap/4.0.0-beta/js/bootstrap.min.js"></script>
</head>
<body>

<div class="container">
  <p>.Registry betWeen 2001-01-01 01:01:01' AND '2017-10-31 23:59:59':</p>            
  <table class="table">
    <thead>
      <tr>
        <th>realName</th>
        <th>balance</th>
 	<th>realName</th>
        <th>balance</th>
      </tr>
    </thead>
    <tbody>

      <tr>
	<#list lists?reverse as being>
   	<td>${being.realName} </td>
	<td>${being.balance} RMB</td>
	</#list>
	 </tr>
    </tbody>
  </table>
</div>

</body>
</html>