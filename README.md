<h3>FrameWork(spring + springMVC + myBatis + springSecurity)  </h3>                  <br>
<p>
自动构建代码使用说明：                                                            <br>
1.配置/src/main/java/util/generatorConfig.xml数据源， jdbcConnetcion            <br>
2.修改/src/main/java/util/autoCreate中的tables，生成该table对应的代码              <br>
                                                                              <br>
项目启动说明：                                                                  <br>
1.配置/src/main/resources/db.properties数据库信息                                <br>
2.修改spring-security.xml中所对应的login，logout页面请求（不修改使用默认）            <br>
3.修改spring-security.xml对应的登录MyUserDetailService类，实现登录及控制权限功能。    <br>
4.项目部署时删除/src/main/java/util文件夹（自己用就行）                              <br>
5.后台对应的基本api                                                               <br>
/tableName/insert 	POST                                                   <br>
/tableName/delete?id= 	GET                                                <br>
/tableName/update 	POST                                                    <br>
/tableName/find?id= 	GET                                                   <br>
/tableName/list 	GET (所对应的mapper，xml未添加)                              <br>
</p>

