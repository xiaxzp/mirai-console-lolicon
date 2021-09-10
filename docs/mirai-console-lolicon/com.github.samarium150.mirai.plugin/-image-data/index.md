---
title: ImageData
---
//[mirai-console-lolicon](../../../index.html)/[com.github.samarium150.mirai.plugin](../index.html)/[ImageData](index.html)



# ImageData



[jvm]\
data class [ImageData](index.html)(**pid**: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html), **p**: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html), **uid**: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html), **title**: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), **author**: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), **r18**: [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html), **width**: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html), **height**: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html), **tags**: [List](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)<[String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)>, **ext**: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), **uploadDate**: [Long](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-long/index.html), **urls**: [Map](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-map/index.html)<[String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)>)

The image information returned by Lolicon API <br> Lolicon API 返回的图片信息



## See also


jvm

| | |
|---|---|
| [com.github.samarium150.mirai.plugin.ResponseBody](../-response-body/index.html) |  |



## Constructors


| | |
|---|---|
| [ImageData](-image-data.html) | [jvm]<br>fun [ImageData](-image-data.html)(pid: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html), p: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html), uid: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html), title: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), author: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), r18: [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html), width: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html), height: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html), tags: [List](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)<[String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)>, ext: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), uploadDate: [Long](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-long/index.html), urls: [Map](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-map/index.html)<[String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)>)<br>Create an Image data instance <br> 实例化图片数据 |


## Functions


| Name | Summary |
|---|---|
| [toReadable](to-readable.html) | [jvm]<br>fun [toReadable](to-readable.html)(): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)<br>Return the readable information <br> 返回具有可读性的信息 |
| [toString](to-string.html) | [jvm]<br>open override fun [toString](to-string.html)(): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) |


## Properties


| Name | Summary |
|---|---|
| [author](author.html) | [jvm]<br>val [author](author.html): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)<br>Author's name <br> 作者名字 |
| [ext](ext.html) | [jvm]<br>val [ext](ext.html): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) |
| [height](height.html) | [jvm]<br>val [height](height.html): [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)<br>Height of the image <br> 高度 |
| [p](p.html) | [jvm]<br>val [p](p.html): [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)<br>the page of the image <br> 图片所在页数 |
| [pid](pid.html) | [jvm]<br>val [pid](pid.html): [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)<br>Image PID <br> 图片PID |
| [r18](r18.html) | [jvm]<br>val [r18](r18.html): [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)<br>R18 category <br> 是否为R18 |
| [tags](tags.html) | [jvm]<br>val [tags](tags.html): [List](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)<[String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)><br>Image tags <br> 标签 |
| [title](title.html) | [jvm]<br>val [title](title.html): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)<br>Image title <br> 图片标题 |
| [uid](uid.html) | [jvm]<br>val [uid](uid.html): [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)<br>Author UID <br> 作者UID |
| [uploadDate](upload-date.html) | [jvm]<br>val [uploadDate](upload-date.html): [Long](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-long/index.html) |
| [urls](urls.html) | [jvm]<br>val [urls](urls.html): [Map](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-map/index.html)<[String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)><br>Image urls <br> 链接 |
| [width](width.html) | [jvm]<br>val [width](width.html): [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)<br>Width of the image <br> 宽度 |

