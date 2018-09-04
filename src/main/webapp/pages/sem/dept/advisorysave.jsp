<%--
  Created by IntelliJ IDEA.
  User: acer
  Date: 2018/8/17
  Time: 14:48
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<html>
<head>
    <title>修改渠道</title>
    <link rel="stylesheet" href="/plugins/layui/css/layui.css"  media="all">
</head>
<body>
<script src="/plugins/layui/layui.js" charset="utf-8"></script>
<!-- 注意：如果你直接复制所有代码到本地，上述js路径需要改成你本地的 -->
<div style="width: 300px; height: 200px;margin-left: 70px;margin-top: 50px">
    <form class="layui-form" action="<%=request.getContextPath()%>/sadvisory/save" method="post" onsubmit="return checkAll();" target="_parent">
        <div class="layui-form-item">
            <label class="layui-form-label">渠道：</label>
            <div class="layui-input-block">
                <input type="text" name="name" required  lay-verify="required" placeholder="请输入咨询类别" autocomplete="off" class="layui-input">
            </div>
        </div>
        <div class="layui-form-item">
            <label class="layui-form-label">状态：</label>
            <div class="layui-input-block">
                <input type="radio" name="state" value="0" title="冻结">
                <input type="radio" name="state" value="1" title="启用" checked>
            </div>
        </div>
        <div class="layui-form-item">
            <div class="layui-input-block">
                <button class="layui-btn" lay-submit lay-filter="formDemo">立即提交</button>
                <button type="reset" class="layui-btn layui-btn-primary">重置</button>
            </div>
        </div>
    </form>
</div>
<script>
    //Demo
    layui.use('form', function(){
        var form = layui.form;
        //监听提交
        form.on('submit(formDemo)', function(data){
            layer.msg(JSON.stringify(data.field));
            layer.closeAll();//关闭弹窗
            return true;
        });
    });
</script>
</body>
</html>
