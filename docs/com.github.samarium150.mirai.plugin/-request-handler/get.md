---
title: get -
---
//[mirai-console-lolicon](../../../index.md)/[com.github.samarium150.mirai.plugin](../index.md)/[RequestHandler](index.md)/[get](get.md)



# get  
[jvm]  
Content  
fun [get](get.md)(parameters: [RequestParams](../-request-params/index.md)): [Response](../-response/index.md)  
More info  


Makes a GET request to Lolicon API with the given [parameters](get.md)<br> 根据参数发送HTTP请求



#### Return  


[Response](../-response/index.md)



## See also  
  
jvm  
  
| | |
|---|---|
| <a name="com.github.samarium150.mirai.plugin/RequestHandler/get/#com.github.samarium150.mirai.plugin.RequestParams/PointingToDeclaration/"></a>[com.github.samarium150.mirai.plugin.RequestParams](../-request-params/index.md)| <a name="com.github.samarium150.mirai.plugin/RequestHandler/get/#com.github.samarium150.mirai.plugin.RequestParams/PointingToDeclaration/"></a>|
| <a name="com.github.samarium150.mirai.plugin/RequestHandler/get/#com.github.samarium150.mirai.plugin.RequestParams/PointingToDeclaration/"></a>[com.github.samarium150.mirai.plugin.Response](../-response/index.md)| <a name="com.github.samarium150.mirai.plugin/RequestHandler/get/#com.github.samarium150.mirai.plugin.RequestParams/PointingToDeclaration/"></a>|
| <a name="com.github.samarium150.mirai.plugin/RequestHandler/get/#com.github.samarium150.mirai.plugin.RequestParams/PointingToDeclaration/"></a>[com.github.samarium150.mirai.plugin.APIException](../-a-p-i-exception/index.md)| <a name="com.github.samarium150.mirai.plugin/RequestHandler/get/#com.github.samarium150.mirai.plugin.RequestParams/PointingToDeclaration/"></a>|
  


## Parameters  
  
jvm  
  
| | |
|---|---|
| <a name="com.github.samarium150.mirai.plugin/RequestHandler/get/#com.github.samarium150.mirai.plugin.RequestParams/PointingToDeclaration/"></a>parameters| <a name="com.github.samarium150.mirai.plugin/RequestHandler/get/#com.github.samarium150.mirai.plugin.RequestParams/PointingToDeclaration/"></a><br><br>[RequestParams](../-request-params/index.md)<br><br>|
  


#### Throws  
  
| | |
|---|---|
| <a name="com.github.samarium150.mirai.plugin/RequestHandler/get/#com.github.samarium150.mirai.plugin.RequestParams/PointingToDeclaration/"></a>com.github.kittinunf.fuel.core.FuelError| <a name="com.github.samarium150.mirai.plugin/RequestHandler/get/#com.github.samarium150.mirai.plugin.RequestParams/PointingToDeclaration/"></a><br><br>if GET request is failed <br> GET请求失败时抛出<br><br>|
| <a name="com.github.samarium150.mirai.plugin/RequestHandler/get/#com.github.samarium150.mirai.plugin.RequestParams/PointingToDeclaration/"></a>com.google.gson.JsonSyntaxException| <a name="com.github.samarium150.mirai.plugin/RequestHandler/get/#com.github.samarium150.mirai.plugin.RequestParams/PointingToDeclaration/"></a><br><br>if returned JSON is invalid <br> 返回的JSON无效时抛出<br><br>|
| <a name="com.github.samarium150.mirai.plugin/RequestHandler/get/#com.github.samarium150.mirai.plugin.RequestParams/PointingToDeclaration/"></a>[com.github.samarium150.mirai.plugin.APIException](../-a-p-i-exception/index.md)| <a name="com.github.samarium150.mirai.plugin/RequestHandler/get/#com.github.samarium150.mirai.plugin.RequestParams/PointingToDeclaration/"></a><br><br>if Lolicon API didn't return status 0 <br> API调用错误时抛出<br><br>|
  



