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
<body >

<div class="demoTable">
    搜索ID：
    <div class="layui-inline">
        <input name="id" class="layui-input" id="id" autocomplete="off">
    </div>

    搜索渠道：
    <div class="layui-inline">
        <input name="name" class="layui-input" id="name" autocomplete="off">
    </div>
    <button class="layui-btn" data-type="reload">搜索</button>
    <button data-method="notice" class="layui-btn" id="add">添加</button>
</div>
<table class="layui-hide" id="LAY_table_user" lay-filter="user"></table>

<script type="text/html" id="barDemo">
    <a class="layui-btn layui-btn-danger layui-btn-xs" lay-event="del">删除</a>
        <!-- 这里的 checked 的状态只是演示 -->
</script>
<script type="text/html" id="switchTpl">
<input type="checkbox" userId="{{d.id}}" username="{{d.name}}" name="state" value="{{d.state}}" lay-skin="switch" lay-text="启动|冻结" lay-filter="sexDemo" {{ d.state == 1 ? 'checked' : '' }}>
</script>
<script src="/plugins/layui/layui.js" charset="utf-8"></script>
<!-- 注意：如果你直接复制所有代码到本地，上述js路径需要改成你本地的 -->
<script>
    layui.use(['table','layer'], function(){
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
            ,url: '/sway/list'
            ,cols: [[
                {checkbox: true, fixed: true}
                ,{field:'id', title: 'ID', width:80, sort: true, fixed: true}
                ,{field:'name', title: '渠道', width:80,edit: 'text'}
                ,{field:'state', title: '渠道状态', width:100 , templet:"#switchTpl"}
                ,{fixed: 'right', width:178, align:'center', toolbar: '#barDemo'}
            ]]
            ,id: 'testReload'
            ,page: true
            ,height: 315
            ,limits:[2,3,4,5]
            ,done:function () {
                //分类显示中文名称
                $("[data-field='state']").children().each(function(){
                    if($(this).text()=='1'){
                        $(this).text("冻结")
                    }else if($(this).text()=='2'){
                        $(this).text("启用")
                    }
                })
            }
        });

        //监听性别操作
        form.on('switch(sexDemo)', function(obj){
            var state = 1;
            if(!obj.elem.checked){
                state = 0;

            }
            var id = obj.elem.getAttribute('userId');
            var name = obj.elem.getAttribute('username');
            console.log(state+"//////"+id +name);
            $.ajax({
                type:"post",
                url:"/sway/update",
                data:{name:name,id:id,state:state},
                dataType:"json",
                success:function (result) {
                    if (result.code == 0){
                        obj.del();
                    }
                    layer.msg(result.msg);
                    table.reload("testReload");
                }
            })
            if(state==0){
                layer.msg('['+ "冻结"+'] ' );
            }else if (state==1){
                layer.msg('['+ "启动"+'] ' );
            }
        });

        //监听单元格编辑
        table.on('edit(user)', function(obj){
            var value = obj.value //得到修改后的值
                ,data = obj.data //得到所在行所有键值
                ,field = obj.field; //得到字段
            $.ajax({
                type:"post",
                url:"/sway/update",
                data:{name:data.name,id:data.id,state:data.state},
                dataType:"json",
                success:function (result) {
                    if (result.code == 0){
                        obj.del();
                    }
                    layer.msg(result.msg);
                    table.reload("testReload");
                }
            })
            layer.msg('[ID: '+ data.id +'] ' + field + ' 字段更改为：'+ value);

        });



        //监听工具条
        table.on('tool(user)', function(obj){
            var data = obj.data;
            if(obj.event === 'del'){
                layer.confirm('真的删除行么', function(index){
                    $.ajax({
                        type:"get",
                        url:"/sway/delete?id="+data.id,
                        data:{},
                        success:function (result) {
                            if (result.code == 0){
                                //从表格删除
                                obj.del();
                                setTimeout(function () {
                                    location=window.location;

                                },500);
                            }
                            layer.msg(result.msg);

                        }
                    })
                    layer.close(index);
                });
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
        $("#add").click(function () {
            layer.open({
                type: 2
                ,title: false //不显示标题栏
                ,closeBtn: true
                ,area: ['500px','300px']
                ,shade: 0.8
                ,id: 'LAY_layuipro' //设定一个id，防止重复弹出
                ,btnAlign: 'c'
                ,moveType: 1 //拖拽模式，0或者1
                ,shadeClose:true
                ,content: "/pages/sem/dept/swaysave.jsp"
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