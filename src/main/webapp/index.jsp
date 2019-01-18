<%@ page language="java" pageEncoding="UTF-8"%>
<html>

<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
    <title>CS服务器排行查询</title>

    <script src="https://cdn.bootcss.com/jquery/3.3.1/jquery.min.js"></script>
    <link rel="stylesheet" href="layui/css/layui.css" media="all">
    <link rel="stylesheet" href="layui/css/global.css" media="all">
    <script src="layui/layui.all.js"></script>
    <script type="text/javascript" src="https://cdn.bootcss.com/canvas-nest.js/1.0.1/canvas-nest.min.js"></script>　
    <script src="layui/mouse.js"></script>
    <style type="text/css">
        .layui-table {
            width: 100%;
            background-color:transparent;
            color: #666;
        }
        .layui-table tbody tr:hover,.layui-table thead tr,.layui-table-click,.layui-table-header,.layui-table-hover,.layui-table-mend,.layui-table-patch,.layui-table-tool,.layui-table-total,.layui-table-total tr,.layui-table[lay-even] tr:nth-child(even) {
            background-color: transparent
        }
        .layui-table td,.layui-table th,.layui-table-col-set,.layui-table-fixed-r,.layui-table-grid-down,.layui-table-header,.layui-table-page,.layui-table-tips-main,.layui-table-tool,.layui-table-total,.layui-table-view,.layui-table[lay-skin=line],.layui-table[lay-skin=row] {
             border-width: 1px;
              border-style:none;
             border-color: #e6e6e6;
         }
        .am-badge-1 {
            background-color: #5eb95e;
        }
        .am-badge-2 {
            background-color: #5eb95e;
        }
        .am-badge-3 {
            background-color: #5eb95e;
        }
        .am-badge-4 {
            background-color: #5eb95e;
        }
        .am-badge {
            display: inline-block;
            min-width: 10px;
            padding: 0.25em 0.625em;
            font-size: 1.2rem;
            font-weight: bold;
            color: #fff;
            line-height: 1;
            vertical-align: baseline;
            white-space: nowrap;
            text-align: center;
            background-color: #999999;
            border-radius: 0;
        }
    </style>
</head>
<body>

<div class="site-banner">
    <img src="layui/images/icon.png" style="width:100px;left: 39px;position: absolute;"/>
    <div class="site-banner-main">
        <div class="layui-anim site-desc site-desc-anim" style="margin-top: 0px;">
            <p class="web-font-desc">【PVP】CS对战排行榜</p>
        </div>
    </div>
</div>
<div class="layui-fluid">

    <form class="layui-form" action="" lay-filter="form">
        <div class="layui-form-inline">
            <div class="layui-input-inline">
                <select name="type" lay-verify="required">
                    <option value="">请选择查询类型</option>
                    <option value="steamid">STEAMID(精确查询)</option>
                    <option value="name">玩家姓名(模糊查询)</option>
                </select>
            </div>
            <label class="layui-form-label"></label>
            <div class="layui-input-inline">
                <input type="text" name="content" required  lay-verify="required" placeholder="请输入查询内容" autocomplete="off" class="layui-input">
            </div>

            <div class="layui-input-inline">
                <button class="layui-btn" lay-submit lay-filter="form">立即提交</button>
                <button id="resetBtn" type="reset" class="layui-btn layui-btn-primary">重置</button>
            </div>
        </div>
    </form>
</div>
<div class="layui-fluid" style="background-color:transparent">
    <div class="layui-card" style="background-color:transparent">
        <div class="layui-card-body" style="background-color:transparent">
            <table class="layui-hide" id="playerTable"  lay-filter="playerTable" lay-data="{id: 'playerTable'}" lay-skin="nob" style="background-color:transparent"></table>
            <div id="page"></div>
        </div>
    </div>
</div>
</body>
<script>
    var table = layui.table;
    var laypage = layui.laypage;
    var form = layui.form;
    var url="player/";
    //查询
    form.render();
    form.on('submit(form)', function(data){
        //console.log(data.field.type);
        if(data.field.type=="name")
        {
            url="/player/name/"+data.field.content;
            renderTable(url,"allpoints","desc",1,10,true);
        }
        if(data.field.type=="steamid")
        {
            layer.load();
            $.get('player/steamid/'+data.field.content,function (res)
            {
                layer.closeAll('loading');
                if(!res.success)
                {
                    layer.msg(res.msg, {icon: 5});
                    return;
                }
                data=res.jsonObject;
                if(typeof(data.steamId)=="undefined")
                {
                    layer.msg("没有查询到相关记录！！！", {icon: 5});
                    return;
                }
                con='玩家名称:' +data.playerId+
                    '    STEAMID:' +data.steamId+
                    '<br>称号:' +data.chenghaoname+
                    '<br>总分:' +data.allpoints+
                    '击杀:' +data.killplayer+
                    '死亡:' +data.assistplayer+
                    '助攻:' +data.deadplayer+
                    '场次:'+data.number;
                layer.msg(con, {
                    time: 20000, //20s后自动关闭
                    btn: ['关闭']
                });
            }, "json");
        }

        return false ;
    });
    form.verify({
        type: function(value, item){ //value：表单的值、item：表单的DOM对象
            if(value==""){
                return '查询类型不允许为空';
            }
        }
    });
    //重置
    $("#resetBtn").click(function(){
        if(url!="player/")
        {
            url="player/";
            renderTable(url,"allpoints","desc",1,10,true);
        }
    });
    //初始化
    layer.load();
    $.get('player/?order=allpoints&&desc=desc&&page=1&&limit=10',function (res)
    {
        layer.closeAll('loading');
        if(!res.success)
        {
            layer.msg(res.msg, {icon: 5});
            return;
        }
        table.render({
            elem: '#playerTable'
            ,cols: [[
                {field:'uid',title: 'UID',width:70},
                {field:'steamId',title: 'STEAMID',width:182},
                {field:'playerId',title: '玩家名称'},
                {field:'chenghaoname',title: '称号',width:140},
                {field:'allpoints',title: '总分', sort: true,templet: function(d){
                        return '<span  style="color: #1E9FFF;font-weight:bold">'+d.allpoints+'</span>';
                    }},
                {field:'killplayer',title: '击杀', sort: true,templet: function(d){
                        return '<span style="color: #e113ff;font-weight:bold">'+d.killplayer+'</span>';
                    }},
                {field:'deadplayer',title: '死亡', sort: true,templet: function(d){
                        return '<span style="20px; color: #ff2523;font-weight:bold">'+d.deadplayer+'</span>';
                    }},
                {field:'assistplayer',title: '助攻', sort: true,templet: function(d){
                        return '<span style="color: #0cff18;font-weight:bold">'+d.assistplayer+'</span>';
                    }},
                {field:'number',title: '场次', sort: true},
                {field:'vip',title: 'VIP'}
            ]]
            ,  initSort: {
                field: 'allpoints' //排序字段，对应 cols 设定的各字段名
                ,type: 'desc' //排序方式  asc: 升序、desc: 降序、null: 默认排序
            }
            ,height:420
            ,skin:"nob"
            ,data:res.jsonArray
        });
        table.on('sort(playerTable)', function(obj){
            renderTable(url,obj.field,obj.type==null?"desc":obj.type,1,10,true);
        });
        laypage.render({
            elem: 'page' //注意，这里的 test1 是 ID，不用加 # 号
            ,count: res.rows //数据总数，从服务端得到
            ,layout: ['count', 'prev', 'page', 'next', 'limit', 'refresh', 'skip']
            ,jump: function(obj, first){
                //首次不执行
                if(!first){
                    //do something
                    renderTable(url,"allpoints","desc",obj.curr,obj.limit);
                }
            }
        });
    }, "json");

    function  renderTable(url,order="allpoints",desc="desc",page=1,limit=10,isRender=false)
    {
        layer.load();
        $.get(url,{"order":order,"desc":desc,"page":page,"limit":limit},function (res)
        {

            layer.closeAll('loading');
            if(!res.success)
            {
                layer.msg(res.msg, {icon: 5});
                return;
            }
            table.reload('playerTable', {
                initSort: {
                    field: order //排序字段，对应 cols 设定的各字段名
                    ,type: desc //排序方式  asc: 升序、desc: 降序、null: 默认排序
                }
                ,limit:limit
                ,data:res.jsonArray
            });
            if(isRender){
                laypage.render({
                    elem: 'page' //注意，这里的 test1 是 ID，不用加 # 号
                    ,count: res.rows //数据总数，从服务端得到
                    ,layout: ['count', 'prev', 'page', 'next', 'limit', 'refresh', 'skip']
                    ,jump: function(obj, first){
                        //首次不执行
                        if(!first){
                            //do something
                            renderTable(url,order,desc,obj.curr,obj.limit);
                        }
                    }
                });
            }

        }, "json");
    }
</script>
</html>
