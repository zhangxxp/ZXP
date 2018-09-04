<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <title>layui</title>
    <meta name="renderer" content="webkit">
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
    <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
    <link rel="stylesheet" href="/plugins/layui/css/layui.css"  media="all">
    <!-- 注意：如果你直接复制所有代码到本地，上述css路径需要改成你本地的 -->
</head>
<body>

<div class="demoTable">
    搜索ID：
    <div class="layui-inline">
        <input name="id" class="layui-input" id="id" autocomplete="off">
    </div>
    搜索用户：
    <div class="layui-inline">
        <input name="name" class="layui-input" id="name" autocomplete="off">
    </div>
    <button class="layui-btn" data-type="reload">搜索</button>
    <button data-method="notice" class="layui-btn" id="add">添加</button>
</div>
<table class="layui-hide" id="LAY_table_user" lay-filter="user"></table>

<script type="text/html" id="barDemo">
    <a id="del" class="layui-btn layui-btn-danger layui-btn-xs" lay-event="del">修改</a>
    <a id="fw" class="layui-btn layui-btn-danger layui-btn-xs" lay-event="fw">访问记录</a>
</script>
<script type="text/html" id="wname">
    <span>{{d.sWay.name}}</span>
</script>
<script type="text/html" id="susers">
    <span>{{d.susers.name}}</span>
</script>
<script src="/plugins/layui/layui.js" charset="utf-8"></script>
<!-- 注意：如果你直接复制所有代码到本地，上述js路径需要改成你本地的 -->
<script>
    layui.use(['form','table','layer'], function(){
        //var table = layui.table;
        //var layer = layui.layer;
        var table = layui.table;
        var $ = layui.jquery, layer = layui.layer;
        var form = layui.form;
        //获取layui里面的jqeury对象
        var $ = layui.$;

        //方法级渲染
        table.render({
            elem: '#LAY_table_user'
            ,url: '/client/list'
            ,cols: [[
                {checkbox: true, fixed: true}
                ,{field:'id', title: 'ID', width:80, sort: true, fixed: true}
                ,{field:'name', title: '姓名', width:80,edit: 'text'}
                ,{field:'phone', title: '电话', width:100 ,edit: 'text'}
                ,{field:'schools', title: '院校', width:100 ,edit: 'text'}
                ,{field:'susers', title: '咨询师', width:100 , templet:'#susers'}
                ,{field:'city', title: '城市', width:100 ,edit: 'text'}
                ,{field:'sWay', title: '渠道', width:100 , templet:'#wname'}
                ,{field:'state', title: '状态', width:100 ,}
                ,{field:'idea', title: '意向', width:100 ,}
                ,{fixed: 'right', width:178, align:'center', toolbar: '#barDemo'}
            ]]
            ,id: 'testReload'
            ,page: true
            ,height: 315
            ,limits:[2,3,4,5]
            ,done:function () {
                //分类显示中文名称
                $("[data-field='idea']").children().each(function(){
                    if($(this).text()=='1'){
                        $(this).text("犹豫")
                    }else if($(this).text()=='2'){
                        $(this).text("积极")
                    }
                })
                $("[data-field='state']").children().each(function(){
                    if($(this).text()=='1'){
                        $(this).text("未报名")
                    }else if($(this).text()=='2'){
                        $(this).text("已报名")
                    }
                })
            }
        });
        //获取layui里面的jqeury对象
        $('.demoTable .layui-btn').on('click', function(){
            //执行重载
            table.reload('testReload', {
                page: {
                    curr: 1 //重新从第 1 页开始
                }
                ,where: {
                    params:{
                        "id":$("#id").val(),
                        "name":$("#name").val(),
                        "state":$("#state").val()
                    }
                }
            });
        });
        //插入
        $("#add").click(function () {
            layer.open({
                type: 2
                ,title: false //不显示标题栏
                ,closeBtn: true
                ,area: ['800px','500px']
                ,shade: 0.8
                ,id: 'LAY_layuipro' //设定一个id，防止重复弹出
                ,btnAlign: 'c'
                ,moveType: 1 //拖拽模式，0或者1
                ,shadeClose:true
                ,content: "/pages/sem/dept/clientinsert.jsp"
                ,yes:function (index) {
                    layer.close(index);
                }
                ,end:function(){//关闭后调用的事件
                    location=window.location;
                }

            });

        })
        //修改
        table.on('tool(user)', function(obj){
            var data = obj.data;
            if (obj.event==='del'){
                $.get(
                    "/way/list",
                    {},
                    function (result) {
                        var html="";
                        var way = result.way;
                        if(result!=null){
                            for(var i=0;i<way.length;i++){
                                html+="<option value='"+way[i].id+"'>"+way[i].name+"</option>"
                            }
                            $("#way_select").append(html);
                            form.render('#way_select');
                        }
                    }
                );
                layer.open({
                    type: 2
                    ,title: false //不显示标题栏
                    ,closeBtn: true
                    ,area: ['800px','500px']
                    ,shade: 0.8
                    ,Boolean:true
                    ,id: 'LAY_layuipro' //设定一个id，防止重复弹出
                    ,btnAlign: 'c'
                    ,moveType: 1 //拖拽模式，0或者1
                    ,shadeClose:true
                    ,content: "/client/liss?id="+data.id
                    ,yes:function (index) {
                        layer.close(index);
                    }
                    ,end:function(){//关闭后调用的事件
                        location=window.location;
                    }
                });
            }else if(obj.event === 'fw'){
                layer.open({
                    type:2
                    ,title: false //不显示标题栏
                    ,closeBtn: true
                    ,area: ['900px','500px']
                    ,shade: 0.8
                    ,Boolean:true
                    ,id: 'LAY_layuipro' //设定一个id，防止重复弹出
                    ,btnAlign: 'c'
                    ,moveType: 1 //拖拽模式，0或者1
                    ,shadeClose:true
                    ,content: "/pages/sem/dept/callback1.jsp?id="+data.id
                    ,yes:function (index) {
                        layer.close(index);
                    }
                    ,end:function(){//关闭后调用的事件
                        location=window.location;
                    }
                })
            }
        })


    });

</script>
</body>
</html>