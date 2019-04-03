<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019/3/28 0028
  Time: 下午 3:33
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<div class="widget user-dashboard-profile">
    <!-- User Image -->
    <div class="profile-thumb">
        <img src="<%= request.getContextPath()%>/static/img/user-thumb.jpg" alt="" class="rounded-circle">
    </div>
    <!-- User Name -->
    <h5 class="text-center"></h5>
    <a href="<%= request.getContextPath()%>/addmy.jsp" class="btn btn-main-sm">编辑个人资料</a>
</div>
<div class="widget user-dashboard-menu">
    <ul>
        <li <%--class="active"--%>><a href="<%= request.getContextPath()%>/my.jsp">个人信息</a></li>
        <li><a href="<%= request.getContextPath()%>/updatemy.jsp">修改个人信息</a></li>
        <li><a href="<%= request.getContextPath()%>/updatepassword.jsp">修改密码</a></li>
        <li><a href="<%= request.getContextPath()%>/OrderListServlet?action=findOrder">我的订单</a></li>
        <li><a href="<%= request.getContextPath()%>/MyIllegal.jsp">事故处理</a></li>
        <li><a href="<%= request.getContextPath()%>/OrderListServlet?action=findAll">我的历史订单</a></li>
       <%--.. <li><a href="">我的积分<span></span></a></li>--%>
    </ul>
</div>
<script>
    layui.use('upload', function(){
        var $ = layui.jquery
            ,upload = layui.upload;

        //普通图片上传
        var uploadInst = upload.render({
            elem: '#demo1'
            ,url: 'UploadSerlvet'
            ,before: function(obj){
                //预读本地文件示例，不支持ie8
                obj.preview(function(index, file, result){
                    $('#demo1').attr('src', result); //图片链接（base64）
                });
            }
            ,done: function(res){
                //如果上传失败
                if(res.code > 0){
                    return layer.msg('上传失败');
                }
                //上传成功
                layer.msg('上传成功')
                $('#demo1').attr('src', res.url);
            }
            ,error: function(){
                //演示失败状态，并实现重传
                var demoText = $('#demoText');
                demoText.html('<span style="color: #FF5722;">上传失败</span> <a class="layui-btn layui-btn-xs demo-reload">重试</a>');
                demoText.find('.demo-reload').on('click', function(){
                    uploadInst.upload();
                });
            }
        });
    });

</script>