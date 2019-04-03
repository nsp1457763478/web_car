<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@include file="./foreground/info.jsp"%>
<html lang="en">
<head>

    <!-- SITE TITTLE -->
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>Calssimax</title>
</head>

<body class="body-wrapper">
<jsp:include page="foreground/commons/header.jsp"></jsp:include>
<section class="dashboard section">
    <!-- Container Start -->
    <div class="container">
        <!-- Row Start -->
        <div class="row">
            <div class="col-md-10 offset-md-1 col-lg-4 offset-lg-0">
                <div class="sidebar">
                    <!-- User Widget -->
                    <jsp:include page="foreground/myxinxi.jsp"></jsp:include>

                </div>
            </div>
            <div class="col-md-10 offset-md-1 col-lg-8 offset-lg-0">
                <div class="widget dashboard-container my-adslist">
                    <h3 class="widget-header">事故处理</h3>
                    <p>1. 如车辆不慎出险，请您注意人身安全，并立即致电神州租车24小时热线400-616-6666转3报案，车辆需由保险公司定损后再修理；<br>
                        2. 为避免处理不当给您带来损失，请您按以下指引处理事故：<br>
                        　(1)　双方交通事故：<br>
                        　　　a)	请您立即停车，记录相关事故车辆的车牌号码，索要对方电话号码；<br>
                        　　　b)	检查对方驾驶执照，如对方无有效驾照，请立即拨打122报警；<br>
                        　　　c)	依据《交通事故快速处理办法》所列的事故情形明确双方责任，如能达成一致：<br>
                        　　　　■ 拍摄第一现场照片：全景照片（现场位置、痕迹、事故损失全貌），物证及特写照片<br>　　　　　（车牌号、受损部位、受损程度等）；<br>
                        　　　　■ 驶离现场至不妨碍交通的地方；<br>
                        　　　　■ 填写《交通事故快速处理协议书》：当事各方各持一份；<br>
                        　　　　■ 拨打报案电话400 616 6666转3，获得报案号和报险建议；<br>
                        　　　　注：《交通事故快速处理协议书》填写项目要齐全，时间精确到分，事故地点具体到所在区域及道路具体名称，各方驾驶证、电话号码需进行<br>　　　　核对；保险“报案号”待报案后会获得。<br>
                        　　　d)	如果不能明确双方责任：<br>
                        　　　　■ 请立即报警（122）等待警察处理；<br>
                        　　　　■ 请于事故车后50米处安放随车附带的三角警示牌，同时将车辆双闪警示灯打开，以便使行驶车辆安全避让；<br>
                        　　　　■ 待警察出具事故责任判定后，立即致电400 616 6666转3报险。<br>
                        　　　e)	请根据报险处理建议，携带车辆行驶本和驾照，将车辆送到指定地点定损（定损时需要事故车辆同时到场以便勘察定损）。<br>
                        　　　f)	请按指导收集理赔所需材料，并将材料交与还车门店或指定维修人员。<br>
                        　(2)　如遇对方车辆肇事逃逸的、对方车辆无号牌的、对方驾驶员无驾驶证或饮酒后驾驶车辆的，请您记录相关信息（如：车牌号，车辆品牌，颜色以<br>　　　及肇事地点）并立即报警（122），等候交警处理，同时请您致电400 616 6666转3 以获得保险方面的咨询和建议。<br>
                        　(3)　如车辆与障碍物、建筑物发生碰撞，或车辆停放期间被碰撞而找不到肇事者，请您将车辆损坏部位以及碰撞物体进行比对拍照，并致电<br>　　　400 616 6666转3，以便车辆能够得到及时修复；<br>
                        　(4)　如遇重大交通事故且有人员伤亡的，请保护现场，并拨打122交通事故报警台求助，同时请立即致电400 616 6666转3以获得保险方面的咨询和<br>　　　建议。<br>
                        3. 事故损失的垫付：<br>
                        　(1)　在事故索赔所需材料不齐的情况下，您需垫付本车维修费用（即支付材料缺失保证金）；<br>
                        　(2)　如有第三方损失，相关费用需由您先行垫付；(在您全责或主责的情况下，如第三方同意在神州租车指定维修单位定损、维修，第三方损失将无<br>　　　需您垫付)<br>
                        4. 为避免保险公司拒赔或视您放弃理赔，请您务必在出险之日起15日内将保险理赔所需事故材料完整提供给我们（特大人伤事故，或费用超1万元，可相应延缓30日）；感谢您的配合！<br>
                        5. 保险公司理赔结束后，我们会将所得理赔款中由您垫付的部分返还给您（具体费用由保险公司核损，最终返还给您的费用额度将按保险公司实际到位理赔款确定）。<br>
                        注：发生事故后，请勿擅自维修事故车辆，否则您将承担赔偿损失等违约责任，超过保险公司赔偿范围或保险公司不足额理赔的部分，也将由您承担。</p>
                    <%--<table class="table table-responsive product-dashboard-table">
                        <thead>
                        <tr>
                            <th>图片</th>
                            <th>详细信息</th>
                            <th class="text-center">违章信息</th>
                        </tr>
                        </thead>
                        <tbody>
                        <tr>
                            <td class="product-thumb">
                                <img width="80px" height="auto" src="<%=request.getContextPath()%>/carImg/1.jpg" alt="image description"></td>
                            <td class="product-details">
                                <h3 class="title">宝马</h3>
                                <span class="add-id"><strong>订单编号:</strong> 2019032908452106</span>
                                <span><strong>下订单时间: </strong><time>2019-03-26 00:00:00</time> </span>
                            </td>
                            <td class="product-category">
                                <span class="categories">闯红灯</span>
                            </td>
                        </tr>
                        </tbody>
                    </table>--%>

                </div>
            </div>
        </div>
        <!-- Row End -->
    </div>
    <!-- Container End -->
</section>
<jsp:include page="foreground/commons/link.jsp"></jsp:include>
<jsp:include page="foreground/commons/foot.jsp"></jsp:include>
</body>

</html>
