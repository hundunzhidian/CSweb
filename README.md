# CSweb

基于SSM架构的求生之路CS服务器排行查询

## 项目简介
- 项目整体采用Html+JSON前后端分离方式，后端基于JAVA的SSM(Spring、Spring MVC、Mybatis)框架，前端采用Layui前端框架
- 实现了分页查询、通过STEAMID的精确查询、分页模糊查询、以及多字段排序功能


## 使用方法
- 更改src/main/resources/spring-mybatis中的jdbc:mysql://localhost:3306/l4d2 username password为你问的数据地址以及用户密码
- 项目是标准Maven项目，可以直接使用**maven**进行项目打包
- 若需要定制后台数据，请更改**cn.qaq.csweb.pojo**类，该类是数据表的实体映射对象，同时还需要更改**cn.qaq.csweb.mapper.\*.xml**里面的映射以及实现方法