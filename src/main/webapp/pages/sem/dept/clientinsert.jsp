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
    <form class="layui-form" action="<%=request.getContextPath()%>/client/save" method="post" onsubmit="return checkAll();" target="_parent">
        <div class="layui-form-item">
            <label class="layui-form-label">客户名称：</label>
            <div class="layui-input-block">
                <input type="text" name="name" required  lay-verify="required" placeholder="请输入姓名" autocomplete="off" class="layui-input">
            </div>
        </div>
        <div class="layui-form-item">
            <label class="layui-form-label">性别：</label>
            <div class="layui-input-block">
                <input type="radio" name="sex" value="1" title="男">
                <input type="radio" name="sex" value="2" title="女" checked>
            </div>
        </div>
        <div class="layui-form-item">
            <label class="layui-form-label">咨询类别：</label>
            <div class="layui-input-block">
                <select  name="sadvisory.id" id="advisory_select">
                </select>
            </div>
        </div>
        <div class="layui-form-item">
            <label class="layui-form-label">咨询师：</label>
            <div class="layui-input-block">
                <select name="susers.id" lay-filter="aihao">
                    <option value="1" selected>咨询师-张</option>
                </select>
            </div>
        </div>
        <div class="layui-form-item">
            <label class="layui-form-label">咨询内容：</label>
            <div class="layui-input-block">
                <textarea name="cocontent" value="" title="男" ></textarea>
            </div>
        </div>
        <div class="layui-form-item">
            <label class="layui-form-label">身份证号：</label>
            <div class="layui-input-block">
                <input type="text" name="idcard" required  lay-verify="required" placeholder="请输入身份证" autocomplete="off" class="layui-input">
            </div>
        </div>
        <div class="layui-form-item">
            <label class="layui-form-label">手机号码：</label>
            <div class="layui-input-block">
                <input type="text" name="phone" required  lay-verify="required" placeholder="请输入手机" autocomplete="off" class="layui-input">
            </div>
        </div>
        <div class="layui-form-item">
            <label class="layui-form-label">QQ：</label>
            <div class="layui-input-block">
                <input type="text" name="qq" required  lay-verify="required" placeholder="请输入QQ" autocomplete="off" class="layui-input" >
            </div>
        </div>
        <div class="layui-form-item">
            <label class="layui-form-label">客户类型：</label>
            <div class="layui-input-block">
                <input type="radio" name="clienttype" value="1" title="个人">
                <input type="radio" name="clienttype" value="2" title="企业" checked>
            </div>
        </div>
        <div class="layui-form-item">
            <label class="layui-form-label">毕业院校：</label>
            <div class="layui-input-block">
                <input type="text" name="schools" required  lay-verify="required" placeholder="请输入毕业院校" autocomplete="off" class="layui-input">
            </div>
        </div>
        <div class="layui-form-item">
            <label class="layui-form-label">专业：</label>
            <div class="layui-input-block">
                <input type="text" name="major" required  lay-verify="required" placeholder="请输入专业" autocomplete="off" class="layui-input" >
            </div>
        </div>
        <div class="layui-form-item">
            <label class="layui-form-label">学历：</label>
            <div class="layui-input-block">
                <input type="radio" name="consult" value="1" title="专科">
                <input type="radio" name="consult" value="2" title="本科" checked>
            </div>
        </div>
        <div class="layui-form-item">
            <label class="layui-form-label">城市：</label>
            <div class="layui-input-block">
                <input type="text" name="city" required  lay-verify="required" placeholder="何处来" autocomplete="off" class="layui-input">
            </div>
        </div>
        <div class="layui-form-item">
            <label class="layui-form-label">籍贯：</label>
            <div class="layui-input-block">
                <input type="text" name="Ntplace" required  lay-verify="required" placeholder="生于此" autocomplete="off" class="layui-input">
            </div>
        </div>
        <div class="layui-form-item">
            <label class="layui-form-label">渠道：</label>
            <div class="layui-input-block">
                <select     name="sWay.id" id="way_select">
                </select>
            </div>
        </div>
        <div class="layui-form-item">
            <label class="layui-form-label">状态：</label>
            <div class="layui-input-block">
                <input type="radio" name="state" value="1" title="未报名">
                <input type="radio" name="state" value="2" title="已报名" checked>
            </div>
        </div>
        <div class="layui-form-item">
            <label class="layui-form-label">意向：</label>
            <div class="layui-input-block">
                <input type="radio" name="idea" value="1" title="犹豫">
                <input type="radio" name="idea" value="2" title="积极" checked>
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
        var table = layui.table;
        var $=layui.jquery;

        //监听提交
        $.get(
            "/sway/xlk",
            {},
            function (result) {
                var html="";
                var way = result.ways;
                if(result!=null){

                    for(var i=0;i<way.length;i++){
                        html+="<option value='"+way[i].id+"'>"+way[i].name+"</option>"
                    }
                    $("#way_select").append(html);
                    form.render();
                }
            }
        );
        //监听提交
        $.get(
            "/sadvisory/xlk",
            {},
            function (result) {
                var html="";
                var way = result.advisorys;
                if(result!=null){

                    for(var i=0;i<way.length;i++){
                        html+="<option value='"+way[i].id+"'>"+way[i].name+"</option>"
                    }
                    $("#advisory_select").append(html);
                    form.render();
                }
            }
        );

        form.on('submit(formDemo)', function(data){
            layer.msg(JSON.stringify(data.field));
            layer.closeAll();//关闭弹窗
            return true;
        });
    });
</script>
</body>
</html>
