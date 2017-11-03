<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Welcome!</title>
</head>
<body>
<#--注释部分-->
<#--下面使用插值-->
<p>Registry BetWeen 2001-01-01 And 2017-10-31:</p>
<ul>
<#--使用ＦＴＬ指令-->
<#list lists?reverse as being>
   <li>${being.name} ${being.balance} 元</li>
</#list>
</ul>
</body>
</html>
