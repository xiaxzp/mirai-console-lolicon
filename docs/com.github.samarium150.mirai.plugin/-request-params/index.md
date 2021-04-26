---
title: RequestParams -
---
//[mirai-console-lolicon](../../../index.md)/[com.github.samarium150.mirai.plugin](../index.md)/[RequestParams](index.md)



# RequestParams  
 [jvm] data class [RequestParams](index.md)(**apikey**: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), **keyword**: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), **r18**: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html), **num**: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html), **proxy**: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), **size1200**: [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html))

The information for making a GET request <br> 进行GET请求所需的信息

   


## Constructors  
  
| | |
|---|---|
| <a name="com.github.samarium150.mirai.plugin/RequestParams/RequestParams/#kotlin.String#kotlin.String#kotlin.Int#kotlin.Int#kotlin.String#kotlin.Boolean/PointingToDeclaration/"></a>[RequestParams](-request-params.md)| <a name="com.github.samarium150.mirai.plugin/RequestParams/RequestParams/#kotlin.String#kotlin.String#kotlin.Int#kotlin.Int#kotlin.String#kotlin.Boolean/PointingToDeclaration/"></a> [jvm] fun [RequestParams](-request-params.md)(apikey: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), keyword: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), r18: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html) = 0, num: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html) = 1, proxy: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) = "i.pixiv.cat", size1200: [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html) = true)Create a Request parameters instance <br> 实例化请求参数   <br>|


## Functions  
  
|  Name |  Summary | 
|---|---|
| <a name="com.github.samarium150.mirai.plugin/RequestParams/toReadable/#/PointingToDeclaration/"></a>[toReadable](to-readable.md)| <a name="com.github.samarium150.mirai.plugin/RequestParams/toReadable/#/PointingToDeclaration/"></a>[jvm]  <br>Content  <br>fun [toReadable](to-readable.md)(): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)  <br>More info  <br>Return the readable information <br> 返回具有可读性的信息  <br><br><br>|
| <a name="com.github.samarium150.mirai.plugin/RequestParams/toString/#/PointingToDeclaration/"></a>[toString](to-string.md)| <a name="com.github.samarium150.mirai.plugin/RequestParams/toString/#/PointingToDeclaration/"></a>[jvm]  <br>Content  <br>open override fun [toString](to-string.md)(): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)  <br>More info  <br>Return the string representation of parameters for GET request <br> 返回用字符串表示的GET请求参数  <br><br><br>|


## Properties  
  
|  Name |  Summary | 
|---|---|
| <a name="com.github.samarium150.mirai.plugin/RequestParams/apikey/#/PointingToDeclaration/"></a>[apikey](apikey.md)| <a name="com.github.samarium150.mirai.plugin/RequestParams/apikey/#/PointingToDeclaration/"></a> [jvm] val [apikey](apikey.md): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)Legal apikey <br> 合法的apikey   <br>|
| <a name="com.github.samarium150.mirai.plugin/RequestParams/keyword/#/PointingToDeclaration/"></a>[keyword](keyword.md)| <a name="com.github.samarium150.mirai.plugin/RequestParams/keyword/#/PointingToDeclaration/"></a> [jvm] val [keyword](keyword.md): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)Keyword for fuzzy searching <br> 模糊搜索的关键词   <br>|
| <a name="com.github.samarium150.mirai.plugin/RequestParams/num/#/PointingToDeclaration/"></a>[num](num.md)| <a name="com.github.samarium150.mirai.plugin/RequestParams/num/#/PointingToDeclaration/"></a> [jvm] val [num](num.md): [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html) = 1Number of results <br> 结果数量   <br>|
| <a name="com.github.samarium150.mirai.plugin/RequestParams/proxy/#/PointingToDeclaration/"></a>[proxy](proxy.md)| <a name="com.github.samarium150.mirai.plugin/RequestParams/proxy/#/PointingToDeclaration/"></a> [jvm] val [proxy](proxy.md): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)Domain of [ImageData.url](../-image-data/url.md)<br> 代理链接   <br>|
| <a name="com.github.samarium150.mirai.plugin/RequestParams/r18/#/PointingToDeclaration/"></a>[r18](r18.md)| <a name="com.github.samarium150.mirai.plugin/RequestParams/r18/#/PointingToDeclaration/"></a> [jvm] val [r18](r18.md): [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html) = 0R18 category <br> R18 类别   <br>|
| <a name="com.github.samarium150.mirai.plugin/RequestParams/size1200/#/PointingToDeclaration/"></a>[size1200](size1200.md)| <a name="com.github.samarium150.mirai.plugin/RequestParams/size1200/#/PointingToDeclaration/"></a> [jvm] val [size1200](size1200.md): [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html) = trueEnable master_1200 thumbnail <br> 启用 master_1200 压缩   <br>|

