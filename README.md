# LoginSystem

## 这是一个java 动态网站项目
### 用到的技术有：Solon（国产web框架），mybatis，html，css
## 网页截图
### 登录界面
![image](https://github.com/Frish2021-open/LoginSystem/blob/main/README_Image/login.png)
### 注册界面
![image](https://github.com/Frish2021-open/LoginSystem/blob/main/README_Image/register.png)
## 如果代码出现问题怎么办
### 自己解决，这是我学习动态网站编写写的一个Demo
## 如何编译
### Windows
``` bash
.\gradlew build
```
### MacOSX
``` bash
./gradlew build
```
### Linux
``` bash
./gradlew build
```
## 如何配置自己的数据库
### 源码内的src/resources/app.yml
### 中的sql.db_1 中的数据自己改，username改成自己的，password改成自己的，url改成自己的
### 切记：别改driverClassName，这是SQL驱动，还有数据库类型为MySQL
## 如何启动网站
### 在github Project 页面中的Release页面下载jar包，然后输入一下命令启动
``` bash
java -jar server.jar
```
