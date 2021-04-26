---
title: Response -
---
//[mirai-console-lolicon](../../../index.md)/[com.github.samarium150.mirai.plugin](../index.md)/[Response](index.md)



# Response  
 [jvm] data class [Response](index.md)(**code**: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html), **msg**: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), **quota**: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html), **quota_min_ttl**: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html), **count**: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html), **data**: [ArrayList](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-array-list/index.html)<[ImageData](../-image-data/index.md)>)

The response body returned by Lolicon API <br> Lolicon API 返回的响应

   


## See also  
  
jvm  
  
| | |
|---|---|
| <a name="com.github.samarium150.mirai.plugin/Response///PointingToDeclaration/"></a>[com.github.samarium150.mirai.plugin.ImageData](../-image-data/index.md)| <a name="com.github.samarium150.mirai.plugin/Response///PointingToDeclaration/"></a>|
  


## Constructors  
  
| | |
|---|---|
| <a name="com.github.samarium150.mirai.plugin/Response/Response/#kotlin.Int#kotlin.String#kotlin.Int#kotlin.Int#kotlin.Int#java.util.ArrayList[com.github.samarium150.mirai.plugin.ImageData]/PointingToDeclaration/"></a>[Response](-response.md)| <a name="com.github.samarium150.mirai.plugin/Response/Response/#kotlin.Int#kotlin.String#kotlin.Int#kotlin.Int#kotlin.Int#java.util.ArrayList[com.github.samarium150.mirai.plugin.ImageData]/PointingToDeclaration/"></a> [jvm] fun [Response](-response.md)(code: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html), msg: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), quota: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html), quota_min_ttl: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html), count: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html), data: [ArrayList](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-array-list/index.html)<[ImageData](../-image-data/index.md)>)Creates a Response instance <br> 实例化响应   <br>|


## Functions  
  
|  Name |  Summary | 
|---|---|
| <a name="com.github.samarium150.mirai.plugin/Response/toReadable/#/PointingToDeclaration/"></a>[toReadable](to-readable.md)| <a name="com.github.samarium150.mirai.plugin/Response/toReadable/#/PointingToDeclaration/"></a>[jvm]  <br>Content  <br>fun [toReadable](to-readable.md)(): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)  <br>More info  <br>Return the readable information <br> 返回具有可读性的信息  <br><br><br>|
| <a name="com.github.samarium150.mirai.plugin/Response/toString/#/PointingToDeclaration/"></a>[toString](to-string.md)| <a name="com.github.samarium150.mirai.plugin/Response/toString/#/PointingToDeclaration/"></a>[jvm]  <br>Content  <br>open override fun [toString](to-string.md)(): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)  <br>More info  <br>Return the string representation <br> 字符串化该类  <br><br><br>|


## Properties  
  
|  Name |  Summary | 
|---|---|
| <a name="com.github.samarium150.mirai.plugin/Response/code/#/PointingToDeclaration/"></a>[code](code.md)| <a name="com.github.samarium150.mirai.plugin/Response/code/#/PointingToDeclaration/"></a> [jvm] val [code](code.md): [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)Status code <br> 状态码   <br>|
| <a name="com.github.samarium150.mirai.plugin/Response/count/#/PointingToDeclaration/"></a>[count](count.md)| <a name="com.github.samarium150.mirai.plugin/Response/count/#/PointingToDeclaration/"></a> [jvm] val [count](count.md): [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)Number of results <br> 结果数量   <br>|
| <a name="com.github.samarium150.mirai.plugin/Response/data/#/PointingToDeclaration/"></a>[data](data.md)| <a name="com.github.samarium150.mirai.plugin/Response/data/#/PointingToDeclaration/"></a> [jvm] val [data](data.md): [ArrayList](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-array-list/index.html)<[ImageData](../-image-data/index.md)>Array of results <br> 结果列表   <br>|
| <a name="com.github.samarium150.mirai.plugin/Response/msg/#/PointingToDeclaration/"></a>[msg](msg.md)| <a name="com.github.samarium150.mirai.plugin/Response/msg/#/PointingToDeclaration/"></a> [jvm] val [msg](msg.md): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)Error message <br> 错误信息   <br>|
| <a name="com.github.samarium150.mirai.plugin/Response/quota/#/PointingToDeclaration/"></a>[quota](quota.md)| <a name="com.github.samarium150.mirai.plugin/Response/quota/#/PointingToDeclaration/"></a> [jvm] val [quota](quota.md): [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)Quota remained <br> 剩余配额   <br>|
| <a name="com.github.samarium150.mirai.plugin/Response/quota_min_ttl/#/PointingToDeclaration/"></a>[quota_min_ttl](quota_min_ttl.md)| <a name="com.github.samarium150.mirai.plugin/Response/quota_min_ttl/#/PointingToDeclaration/"></a> [jvm] val [quota_min_ttl](quota_min_ttl.md): [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)Minimal time for recovering all quota <br> 配额完全恢复需要的时间   <br>|

