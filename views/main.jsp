<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html lang="zh-cn">
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>大连船舶有限公司</title>
    <link href="css/bootstrap.min.css" rel="stylesheet">

    <!--[if lt IE 9]>
    <script src="js/html5shiv.js"></script>
    <script src="js/respond.min.js"></script>
    <![endif]-->

    <style>

        body {
            padding-top: 50px;
            padding-bottom: 40px;
            color: #5a5a5a;
        }

        /* 轮播广告 */

        .carousel {
            height: 500px;
            margin-bottom: 60px;
        }

        .carousel .item {
            height: 500px;
            background-color: #000;
        }

        .carousel .item img {
            width: 100%;
        }

        .carousel-caption {
            z-index: 10;
        }

        .carousel-caption p {
            margin-bottom: 20px;
            font-size: 20px;
            line-height: 1.8;
        }

        /* 简介 */

        .summary {
            padding-right: 15px;
            padding-left: 15px;
        }

        .summary .col-md-4 {
            margin-bottom: 20px;
            text-align: center;
        }

        /* 特性 */

        .feature-divider {
            margin: 40px 0;
        }

        .feature {
            padding: 30px 0;
        }

        .feature-heading {
            font-size: 50px;
            color: #2a6496;
        }

        .feature-heading .text-muted {
            font-size: 28px;
        }

        /* 响应式布局 */

        @media (max-width: 768px) {

            .summary {
                padding-right: 3px;
                padding-left: 3px;
            }

            .carousel {
                height: 300px;
                margin-bottom: 30px;
            }

            .carousel .item {
                height: 300px;
            }

            .carousel img {
                min-height: 300px;
            }

            .carousel-caption p {
                font-size: 16px;
                line-height: 1.4;
            }

            .feature-heading {
                font-size: 34px;
            }

            .feature-heading .text-muted {
                font-size: 22px;
            }
        }

        @media (min-width: 992px) {
            .feature-heading {
                margin-top: 120px;
            }
        }
    </style>

</head>

<body>
<!-- 顶部导航 -->
<div class="navbar navbar-inverse navbar-fixed-top" role="navigation" id="menu-nav">
    <div class="container">
        <div class="navbar-header">
            <button type="button" class="navbar-toggle" data-toggle="collapse" data-target=".navbar-collapse">
                <span class="sr-only">切换导航</span>
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
            </button>
            <a class="navbar-brand" href="#">大连船舶有限公司</a>
        </div>
        <div class="navbar-collapse collapse">
            <ul class="nav navbar-nav">
                <li class="active"><a href="#ad-carousel">简介</a></li>
                <li><a href="#summary-container">公司详情</a></li>
                <li class="dropdown">
                    <a href="#" class="dropdown-toggle" data-toggle="dropdown">合作品牌<span class="caret"></span></a>
                    <ul class="dropdown-menu" role="menu">
                        <li><a href="#feature-tab" data-tab="tab-chrome">山东号</a></li>
                        <li><a href="#feature-tab" data-tab="tab-firefox">威海号</a></li>
                        <li><a href="#feature-tab" data-tab="tab-safari">南海号</a></li>
                        <li><a href="#feature-tab" data-tab="tab-opera">台湾号</a></li>
                        <li><a href="#feature-tab" data-tab="tab-ie">辽远号</a></li>
                    </ul>
                </li>
                <li><a href="#" data-toggle="modal" data-target="#about-modal">关于</a></li>
            </ul>
        </div>
    </div>
</div>

<!-- 广告轮播 -->
<div id="ad-carousel" class="carousel slide" data-ride="carousel">
    <ol class="carousel-indicators">
        <li data-target="#ad-carousel" data-slide-to="0" class="active"></li>
        <li data-target="#ad-carousel" data-slide-to="1"></li>
        <li data-target="#ad-carousel" data-slide-to="2"></li>
        <li data-target="#ad-carousel" data-slide-to="3"></li>
        <li data-target="#ad-carousel" data-slide-to="4"></li>
    </ol>
    <div class="carousel-inner">
        <div class="item active">
            <img src="images/1.jpg" alt="1 slide">

            <div class="container">
                <div class="carousel-caption">
                    <h1>Tom号</h1>

                    <p>Tom号   轻奢代表  运货快 安全性高</p>

                    <p><a class="btn btn-lg btn-primary" href="#"
                          role="button" target="_blank">点我送货</a></p>
                </div>
            </div>
        </div>
        <div class="item">
            <img src="images/2.jpg" alt="2 slide">

            <div class="container">
                <div class="carousel-caption">
                    <h1>STAR CRUISES</h1>

                    <p>STAR CRUISES 高端 运送货物多</p>

                    <p><a class="btn btn-lg btn-primary" href="#" target="_blank"
                          role="button">点我送货</a></p>
                </div>
            </div>
        </div>
        <div class="item">
            <img src="images/3.jpg" alt="3 slide">

            <div class="container">
                <div class="carousel-caption">
                    <h1>A962</h1>

                    <p>A962号 安全性能高 </p>

                    <p><a class="btn btn-lg btn-primary" href="#" target="_blank"
                          role="button">点我送货</a></p>
                </div>
            </div>
        </div>
        <div class="item">
            <img src="images/5.jpg" alt="4 slide">

            <div class="container">
                <div class="carousel-caption">
                    <h1>辽远号</h1>

                    <p>辽远号  便宜实惠 送的快还不贵</p>

                    <p><a class="btn btn-lg btn-primary" href="#" target="_blank"
                          role="button">点我送货</a></p>
                </div>
            </div>
        </div>
        <div class="item">
            <img src="images/6.jpg" alt="5 slide">

            <div class="container">
                <div class="carousel-caption">
                    <h1>威海号</h1>

                    <p>威海号 高端大气  货运量多</p>

                    <p><a class="btn btn-lg btn-primary" href="#" target="_blank"
                          role="button">点我送货</a></p>
                </div>
            </div>
        </div>
    </div>
    <a class="left carousel-control" href="#ad-carousel" data-slide="prev"><span
            class="glyphicon glyphicon-chevron-left"></span></a>
    <a class="right carousel-control" href="#ad-carousel" data-slide="next"><span
            class="glyphicon glyphicon-chevron-right"></span></a>
</div>


<!-- 主要内容 -->
<div class="container summary">

    <!-- 简介 -->
    <div class="row" id="summary-container">
        <div class="col-md-4">
            <img class="img-circle" src="images/77.jpg" alt="chrome">

            <h2>广东号</h2>

            <p>广东号 又称广州号 保密性能业界排名第一</p>

            <p><a class="btn btn-default" href="#" role="button">点我送货</a></p>
        </div>
        <div class="col-md-4">
            <img class="img-circle" src="images/88.jpg" alt="firefox">

            <h2>新疆号</h2>

            <p>新疆号 内陆行业发展的领头军</p>

            <p><a class="btn btn-default" href="#" role="button">点我送货</a></p>
        </div>
        <div class="col-md-4">
            <img class="img-circle" src="images/99.jpg" alt="safari">

            <h2>天津号</h2>

            <p>天津号 又称不是河北号 价格亲民  货运量大</p>

            <p><a class="btn btn-default" href="#" role="button">点我送货</a></p>
        </div>
    </div>

    <!-- 特性 -->

    <hr class="feature-divider">

    <ul class="nav nav-tabs" role="tablist" id="feature-tab">
        <li class="active"><a href="#tab-chrome" role="tab" data-toggle="tab">Chrome</a></li>
        <li><a href="#tab-firefox" role="tab" data-toggle="tab">Firefox</a></li>
        <li><a href="#tab-safari" role="tab" data-toggle="tab">Safari</a></li>
        <li><a href="#tab-opera" role="tab" data-toggle="tab">Opera</a></li>
        <li><a href="#tab-ie" role="tab" data-toggle="tab">IE</a></li>
    </ul>

    <div class="tab-content">
        <div class="tab-pane active" id="tab-chrome">
            <div class="row feature">
                <div class="col-md-7">

                    <h2 class="feature-heading">近洋航线<span
                            class="text-muted">港澳线--到香港、澳门地区</span></h2>

                    <p class="lead">风景欧美，环境舒怡，适合中短途假期</p>
                </div>
                <div class="col-md-5">
                    <img class="feature-image img-responsive" src="images/222.jpg"
                         alt="Chrome">
                </div>
            </div>
        </div>
        <div class="tab-pane" id="tab-firefox">
            <div class="row feature">
                <div class="col-md-5">
                    <img class="feature-image img-responsive" src="images/666.jpg"
                         alt="Firefox">
                </div>
                <div class="col-md-7">

                    <h2 class="feature-heading">新马线 <span class="text-muted">新加坡-马六甲</span>
                    </h2>

                    <p class="lead">新加坡、马来西亚的巴生港（PORTKELANG）、槟城（PENANG）和马六甲（MALACEA）</p>
                </div>
            </div>
        </div>
        <div class="tab-pane" id="tab-safari">
            <div class="row feature">
                <div class="col-md-7">

                    <h2 class="feature-heading">波斯湾线 <span class="text-muted">又称阿拉伯湾线</span></h2>

                    <p class="lead">巴基斯坦的卡拉奇、伊朗的阿巴斯、霍拉姆沙赫尔；伊拉克的巴士拉；科威特的科威特港；沙特阿拉伯的达曼</p>
                </div>
                <div class="col-md-5">
                    <img class="feature-image img-responsive" src="images/444.jpg"
                         alt="Safari">
                </div>
            </div>
        </div>
        <div class="tab-pane" id="tab-opera">
            <div class="row feature">
                <div class="col-md-5">
                    <img class="feature-image img-responsive" src="images/111.jpg"
                         alt="Opera">
                </div>
                <div class="col-md-7">

                    <h2 class="feature-heading">西北欧线 <span class="text-muted">欧美风旅</span>
                    </h2>

                    <p class="lead">到比利时的安特卫普；荷兰的鹿特丹；德国的汉堡、不来梅、法国的勒弗尔；英国的伦敦、利物浦；
                    丹麦的哥本哈根；挪威的奥斯陆；瑞典的斯德哥尔摩和哥德堡；芬兰的赫尔辛基等.</p>
                </div>
            </div>
        </div>
        <div class="tab-pane" id="tab-ie">
            <div class="row feature">
                <div class="col-md-7">

                    <h2 class="feature-heading">美国加拿大线<span class="text-muted">你懂的</span></h2>

                    <p class="lead">包括加拿大西海岸港口温哥华；美国西岸港口西雅图、波特兰、旧金山、洛杉矶；加拿大东岸港口蒙特利尔
                    、多伦多；美国东岸港口纽约、波士顿、费城、巴尔的摩、波特兰和美国墨西哥湾港口的莫比尔、
                    新奥尔良、休斯顿等港口。美国墨西哥湾各港也属美国东海岸航线</p>
                </div>
                <div class="col-md-5">
                    <img class="feature-image img-responsive" src="images/333.jpg"
                         alt="IE">
                </div>
            </div>
        </div>
    </div>

    <!-- 关于 -->
    <div class="modal fade" id="about-modal" tabindex="-1" role="dialog" aria-labelledby="modal-label"
         aria-hidden="true">
        <div class="modal-dialog">
            <div class="modal-content">
                <div class="modal-header">
                    <button type="button" class="close" data-dismiss="modal"><span
                            aria-hidden="true">&times;</span><span class="sr-only">关闭</span></button>
                    <h4 class="modal-title" id="modal-label">关于</h4>
                </div>
                <div class="modal-body">
                    <p>船舶网隶属于大连千锋教育中心(有限合伙)，秉承“开拓、创新、公平、分享”的精神，
                        将互联网特性全面的应用在教育领域，致力于为货运行业打造一站式配送服务品牌。</p>
                </div>
                <div class="modal-footer">
                    <button type="button" class="btn btn-default" data-dismiss="modal">了解了</button>
                </div>
            </div>
        </div>
    </div>


    <footer>
        <p class="pull-right"><a href="#top">回到顶部</a></p>

        <p>&copy; 2017 船舶网 </p>
    </footer>

</div>

<script src="js/jquery-1.11.1.min.js"></script>
<script src="js/bootstrap.min.js"></script>
<script>
    $(function () {
        $('#ad-carousel').carousel();
        $('#menu-nav .navbar-collapse a').click(function (e) {
            var href = $(this).attr('href');
            var tabId = $(this).attr('data-tab');
            if ('#' !== href) {
                e.preventDefault();
                $(document).scrollTop($(href).offset().top - 70);
                if (tabId) {
                    $('#feature-tab a[href=#' + tabId + ']').tab('show');
                }
            }
        });
    });
</script>
</body>
</html>
