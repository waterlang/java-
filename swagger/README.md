# Swagger

Swagger 是一个规范和完整的框架，用于生成、描述、调用和可视化 RESTful 风格的 Web 服务。他摆脱了传统的使用word,pdf来生成文档给调用方看，swagger让
api文档一切变得简单。
<p>

该demo使用profiles来起到热拔插作用，比如只在开发的环境下能从swagger-ui界面里找到接口描述及地址，通过命令： java -Dspring.profiles.active=dev  -jar xx.jar 来启动，
而在生产环境里使用 java -Dspring.profiles.active=product  -jar xx.jar 启动时，在swagger-ui界面里是看不到任何接口信息的。
<p>

注:里面所有的annotations都可以从github里面找到：https://github.com/swagger-api/swagger-core/wiki/Annotations


