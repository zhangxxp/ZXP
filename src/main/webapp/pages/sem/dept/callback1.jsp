<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
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
<div class="demoTable" style=" margin-left: 70px;margin-top: 50px">
    回访记录：<button data-method="notice" class="layui-btn" id="add">添加</button>
    <table class="layui-hide" id="LAY_table_user" lay-filter="user"></table>
</div>
<script type="text/html" id="susers">
    <span>{{d.susers.name}}</span>
</script>
<script>
    //Demo
    layui.use(['form','table'], function(){
        var form = layui.form;
        var $ = layui.jquery;
        var table = layui.table;
        var id = $("#id").val();
        var layer = layui.layer;
        //监听提交
        form.on('submit(formDemo)', function(data){
            layer.msg(JSON.stringify(data.field));
            layer.closeAll();//关闭弹窗
            return true;
        });

                table.render({
                    elem: '#LAY_table_user'
                    ,url: '/callback/list'
                    ,cols: [[
                        {checkbox: true, fixed: true}
                        ,{field:'id', title: 'ID', width:80, sort: true, fixed: true  }
                        ,{field:'susers', title: '咨询师', width:100, templet:'#susers' }
                        ,{field:'otime', title: '本次回访时间', width:100 }
                        ,{field:'ctime', title: '下次回访时间', width:100 }
                        ,{field:'name', title: '回访主题', width:100 }
                        ,{field:'content', title: '回访内容', width:100 }
                        ,{fixed: 'right', width:178, align:'center', toolbar: '#barDemo'}
                    ]]
                    ,id: 'testReload'
                    ,page: true
                    ,height: 315
                    ,limits:[2,3,4,5]
                    ,where:{
                        params:{
                            "id":<%=request.getParameter("id")%>
                        }
                    }
                });


        $("#add").click(function () {
            layer.open({
                type: 2
                ,title: false //不显示标题栏
                ,closeBtn: true
                ,area: ['600px','500px']
                ,shade: 0.8
                ,id: 'LAY_layuipro' //设定一个id，防止重复弹出
                ,btnAlign: 'c'
                ,Boolean:false
                ,moveType: 1 //拖拽模式，0或者1
                ,offset: 't'
                ,shadeClose:true
                ,content: "/pages/sem/dept/callback.jsp?clid="+<%=request.getParameter("id")%>
                ,yes:function (index) {
                    layer.close(index);
                }
                ,end:function(){//关闭后调用的事件
                    location=window.location;
                }
            });

        })
    });
</script>
</body>
</html>
