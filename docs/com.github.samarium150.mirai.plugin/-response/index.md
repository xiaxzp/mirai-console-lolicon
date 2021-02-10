---
title: Response
layout: article
---
//[mirai-console-lolicon](../../index.md)/[com.github.samarium150.mirai.plugin](../index.md)/[Response](index.md)






The response body returned by Lolicon API <br> Lolicon API 返回的响应

data class [Response](index.md)(**code**: [Int](https://kotlinlang.org/api/latest//stdlib/kotlin/-int/index.html), **msg**: [String](https://kotlinlang.org/api/latest//stdlib/kotlin/-string/index.html), **quota**: [Int](https://kotlinlang.org/api/latest//stdlib/kotlin/-int/index.html), **quota_min_ttl**: [Int](https://kotlinlang.org/api/latest//stdlib/kotlin/-int/index.html), **count**: [Int](https://kotlinlang.org/api/latest//stdlib/kotlin/-int/index.html), **data**: [ArrayList](https://docs.oracle.com/javase/8/docs/api/java/util/ArrayList.html)<[ImageData](../-image-data/index.md)>)   


## See also  



| Name                                 | Summary          |
| ------------------------------------ | ---------------- |
| [ImageData](../-image-data/index.md) | <br><br><br><br> |



## Constructors  

| Name                     | Summary                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                |
| ------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ |
| [Response](-response.md) | <br><br>Creates a Response instance <br> 实例化响应<br><br>fun [Response](-response.md)(code: [Int](https://kotlinlang.org/api/latest//stdlib/kotlin/-int/index.html), msg: [String](https://kotlinlang.org/api/latest//stdlib/kotlin/-string/index.html), quota: [Int](https://kotlinlang.org/api/latest//stdlib/kotlin/-int/index.html), quota_min_ttl: [Int](https://kotlinlang.org/api/latest//stdlib/kotlin/-int/index.html), count: [Int](https://kotlinlang.org/api/latest//stdlib/kotlin/-int/index.html), data: [ArrayList](https://docs.oracle.com/javase/8/docs/api/java/util/ArrayList.html)<[ImageData](../-image-data/index.md)>)   <br> |


## Functions  

| Name                                                                             | Summary                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             |
| -------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| [toReadable](to-readable.md)                                                     | <br><br>Return the readable information <br> 返回具有可读性的信息<br>  <br>fun [toReadable](to-readable.md)(): [String](https://kotlinlang.org/api/latest//stdlib/kotlin/-string/index.html)  <br><br><br>                                                                                                                                                                                                                                                                                                                                                                                                          |
| [toString](to-string.md)                                                         | <br><br>Return the string representation <br> 字符串化该类<br>  <br>open override fun [toString](to-string.md)(): [String](https://kotlinlang.org/api/latest//stdlib/kotlin/-string/index.html)  <br><br><br>                                                                                                                                                                                                                                                                                                                                                                                                       |


## Properties  

| Name                                                                                                          | Summary                                                                                                                                                                                                                                                                            |
| ------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| [code](index.md#com.github.samarium150.mirai.plugin/Response/code/#/PointingToDeclaration/)                   | <br><br>Status code <br> 状态码<br><br>val [code](index.md#com.github.samarium150.mirai.plugin/Response/code/#/PointingToDeclaration/): [Int](https://kotlinlang.org/api/latest//stdlib/kotlin/-int/index.html)   <br>                                                             |
| [count](index.md#com.github.samarium150.mirai.plugin/Response/count/#/PointingToDeclaration/)                 | <br><br>Number of results <br> 结果数量<br><br>val [count](index.md#com.github.samarium150.mirai.plugin/Response/count/#/PointingToDeclaration/): [Int](https://kotlinlang.org/api/latest//stdlib/kotlin/-int/index.html)   <br>                                                   |
| [data](index.md#com.github.samarium150.mirai.plugin/Response/data/#/PointingToDeclaration/)                   | <br><br>Array of results <br> 结果列表<br><br>val [data](index.md#com.github.samarium150.mirai.plugin/Response/data/#/PointingToDeclaration/): [ArrayList](https://docs.oracle.com/javase/8/docs/api/java/util/ArrayList.html)<[ImageData](../-image-data/index.md)>   <br>        |
| [msg](index.md#com.github.samarium150.mirai.plugin/Response/msg/#/PointingToDeclaration/)                     | <br><br>Error message <br> 错误信息<br><br>val [msg](index.md#com.github.samarium150.mirai.plugin/Response/msg/#/PointingToDeclaration/): [String](https://kotlinlang.org/api/latest//stdlib/kotlin/-string/index.html)   <br>                                                     |
| [quota](index.md#com.github.samarium150.mirai.plugin/Response/quota/#/PointingToDeclaration/)                 | <br><br>Quota remained <br> 剩余配额<br><br>val [quota](index.md#com.github.samarium150.mirai.plugin/Response/quota/#/PointingToDeclaration/): [Int](https://kotlinlang.org/api/latest//stdlib/kotlin/-int/index.html)   <br>                                                      |
| [quota_min_ttl](index.md#com.github.samarium150.mirai.plugin/Response/quota_min_ttl/#/PointingToDeclaration/) | <br><br>Minimal time for recovering all quota <br> 配额完全恢复需要的时间<br><br>val [quota_min_ttl](index.md#com.github.samarium150.mirai.plugin/Response/quota_min_ttl/#/PointingToDeclaration/): [Int](https://kotlinlang.org/api/latest//stdlib/kotlin/-int/index.html)   <br> |
