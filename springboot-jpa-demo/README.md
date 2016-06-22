# springboot-demo-jpa
该demo是spring-data-jpa使用例子

项目打包执行
mvn clean install
java -jar target/springboot.demo1-0.0.1-SNAPSHOT.jar


例子写了3个接口

1.http://127.0.0.1:8080/users/add?name=hello&age=98
添加用户信息，返回添加后的数据
{"result":{"name":"hello","age":"98","id":2}}

2.http://127.0.0.1:8080/users/test
返回Hello World!

3.http://127.0.0.1:8080/users/getById?id=1
返回id=1的用户信息