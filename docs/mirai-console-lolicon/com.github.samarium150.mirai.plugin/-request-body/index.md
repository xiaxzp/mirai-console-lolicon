---
title: RequestBody
---
//[mirai-console-lolicon](../../../index.html)/[com.github.samarium150.mirai.plugin](../index.html)/[RequestBody](index.html)



# RequestBody



[jvm]\
data class [RequestBody](index.html)(**r18**: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html), **num**: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html), **uid**: [List](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)<[Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)>?, **keyword**: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)?, **tag**: [List](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)<[List](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)<[String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)>>?, **size**: [List](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)<[String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)>?, **proxy**: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), **dataAfter**: [Long](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-long/index.html)?, **dataBefore**: [Long](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-long/index.html)?, **dsc**: [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)?)

The information for making a GET request <br> 进行GET请求所需的信息



## Constructors


| | |
|---|---|
| [RequestBody](-request-body.html) | [jvm]<br>fun [RequestBody](-request-body.html)(r18: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html) = 0, num: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html) = 1, uid: [List](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)<[Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)>? = null, keyword: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)? = "", tag: [List](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)<[List](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)<[String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)>>? = null, size: [List](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)<[String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)>? = null, proxy: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) = "i.pixiv.cat", dataAfter: [Long](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-long/index.html)? = null, dataBefore: [Long](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-long/index.html)? = null, dsc: [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)? = null)<br>Create a RequestBody instance <br> 实例化请求参数 |


## Functions


| Name | Summary |
|---|---|
| [toString](to-string.html) | [jvm]<br>open override fun [toString](to-string.html)(): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) |


## Properties


| Name | Summary |
|---|---|
| [dataAfter](data-after.html) | [jvm]<br>val [dataAfter](data-after.html): [Long](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-long/index.html)? = null |
| [dataBefore](data-before.html) | [jvm]<br>val [dataBefore](data-before.html): [Long](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-long/index.html)? = null |
| [dsc](dsc.html) | [jvm]<br>val [dsc](dsc.html): [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)? = null |
| [keyword](keyword.html) | [jvm]<br>val [keyword](keyword.html): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)? |
| [num](num.html) | [jvm]<br>val [num](num.html): [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html) = 1 |
| [proxy](proxy.html) | [jvm]<br>val [proxy](proxy.html): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) |
| [r18](r18.html) | [jvm]<br>val [r18](r18.html): [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html) = 0 |
| [size](size.html) | [jvm]<br>val [size](size.html): [List](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)<[String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)>? = null |
| [tag](tag.html) | [jvm]<br>val [tag](tag.html): [List](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)<[List](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)<[String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)>>? = null |
| [uid](uid.html) | [jvm]<br>val [uid](uid.html): [List](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)<[Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)>? = null |

