---
title: ImageData -
---
//[mirai-console-lolicon](../../../index.md)/[com.github.samarium150.mirai.plugin](../index.md)/[ImageData](index.md)



# ImageData  
 [jvm] data class [ImageData](index.md)(**pid**: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html), **p**: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html), **uid**: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html), **title**: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), **author**: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), **url**: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), **r18**: [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html), **width**: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html), **height**: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html), **tags**: [ArrayList](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-array-list/index.html)<[String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)>)

The image information returned by Lolicon API <br> Lolicon API 返回的图片信息

   


## See also  
  
jvm  
  
| | |
|---|---|
| <a name="com.github.samarium150.mirai.plugin/ImageData///PointingToDeclaration/"></a>[com.github.samarium150.mirai.plugin.Response](../-response/index.md)| <a name="com.github.samarium150.mirai.plugin/ImageData///PointingToDeclaration/"></a>|
  


## Constructors  
  
| | |
|---|---|
| <a name="com.github.samarium150.mirai.plugin/ImageData/ImageData/#kotlin.Int#kotlin.Int#kotlin.Int#kotlin.String#kotlin.String#kotlin.String#kotlin.Boolean#kotlin.Int#kotlin.Int#java.util.ArrayList[kotlin.String]/PointingToDeclaration/"></a>[ImageData](-image-data.md)| <a name="com.github.samarium150.mirai.plugin/ImageData/ImageData/#kotlin.Int#kotlin.Int#kotlin.Int#kotlin.String#kotlin.String#kotlin.String#kotlin.Boolean#kotlin.Int#kotlin.Int#java.util.ArrayList[kotlin.String]/PointingToDeclaration/"></a> [jvm] fun [ImageData](-image-data.md)(pid: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html), p: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html), uid: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html), title: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), author: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), url: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), r18: [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html), width: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html), height: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html), tags: [ArrayList](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-array-list/index.html)<[String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)>)Create an Image data instance <br> 实例化图片数据   <br>|


## Functions  
  
|  Name |  Summary | 
|---|---|
| <a name="com.github.samarium150.mirai.plugin/ImageData/toReadable/#/PointingToDeclaration/"></a>[toReadable](to-readable.md)| <a name="com.github.samarium150.mirai.plugin/ImageData/toReadable/#/PointingToDeclaration/"></a>[jvm]  <br>Content  <br>fun [toReadable](to-readable.md)(): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)  <br>More info  <br>Return the readable information <br> 返回具有可读性的信息  <br><br><br>|
| <a name="com.github.samarium150.mirai.plugin/ImageData/toString/#/PointingToDeclaration/"></a>[toString](to-string.md)| <a name="com.github.samarium150.mirai.plugin/ImageData/toString/#/PointingToDeclaration/"></a>[jvm]  <br>Content  <br>open override fun [toString](to-string.md)(): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)  <br>More info  <br>Return the string representation <br> 字符串化该类  <br><br><br>|


## Properties  
  
|  Name |  Summary | 
|---|---|
| <a name="com.github.samarium150.mirai.plugin/ImageData/author/#/PointingToDeclaration/"></a>[author](author.md)| <a name="com.github.samarium150.mirai.plugin/ImageData/author/#/PointingToDeclaration/"></a> [jvm] val [author](author.md): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)Author's name <br> 作者名字   <br>|
| <a name="com.github.samarium150.mirai.plugin/ImageData/height/#/PointingToDeclaration/"></a>[height](height.md)| <a name="com.github.samarium150.mirai.plugin/ImageData/height/#/PointingToDeclaration/"></a> [jvm] val [height](height.md): [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)Height of the image <br> 高度   <br>|
| <a name="com.github.samarium150.mirai.plugin/ImageData/p/#/PointingToDeclaration/"></a>[p](p.md)| <a name="com.github.samarium150.mirai.plugin/ImageData/p/#/PointingToDeclaration/"></a> [jvm] val [p](p.md): [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)the page of the image <br> 图片所在页数   <br>|
| <a name="com.github.samarium150.mirai.plugin/ImageData/pid/#/PointingToDeclaration/"></a>[pid](pid.md)| <a name="com.github.samarium150.mirai.plugin/ImageData/pid/#/PointingToDeclaration/"></a> [jvm] val [pid](pid.md): [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)Image PID <br> 图片PID   <br>|
| <a name="com.github.samarium150.mirai.plugin/ImageData/r18/#/PointingToDeclaration/"></a>[r18](r18.md)| <a name="com.github.samarium150.mirai.plugin/ImageData/r18/#/PointingToDeclaration/"></a> [jvm] val [r18](r18.md): [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)R18 category <br> 是否为R18   <br>|
| <a name="com.github.samarium150.mirai.plugin/ImageData/tags/#/PointingToDeclaration/"></a>[tags](tags.md)| <a name="com.github.samarium150.mirai.plugin/ImageData/tags/#/PointingToDeclaration/"></a> [jvm] val [tags](tags.md): [ArrayList](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-array-list/index.html)<[String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)>Image tags <br> 标签   <br>|
| <a name="com.github.samarium150.mirai.plugin/ImageData/title/#/PointingToDeclaration/"></a>[title](title.md)| <a name="com.github.samarium150.mirai.plugin/ImageData/title/#/PointingToDeclaration/"></a> [jvm] val [title](title.md): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)Image title <br> 图片标题   <br>|
| <a name="com.github.samarium150.mirai.plugin/ImageData/uid/#/PointingToDeclaration/"></a>[uid](uid.md)| <a name="com.github.samarium150.mirai.plugin/ImageData/uid/#/PointingToDeclaration/"></a> [jvm] val [uid](uid.md): [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)Author UID <br> 作者UID   <br>|
| <a name="com.github.samarium150.mirai.plugin/ImageData/url/#/PointingToDeclaration/"></a>[url](url.md)| <a name="com.github.samarium150.mirai.plugin/ImageData/url/#/PointingToDeclaration/"></a> [jvm] val [url](url.md): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)Link to the image <br> 图片链接   <br>|
| <a name="com.github.samarium150.mirai.plugin/ImageData/width/#/PointingToDeclaration/"></a>[width](width.md)| <a name="com.github.samarium150.mirai.plugin/ImageData/width/#/PointingToDeclaration/"></a> [jvm] val [width](width.md): [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)Width of the image <br> 宽度   <br>|

