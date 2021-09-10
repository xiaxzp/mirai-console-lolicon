---
title: Utils
---
//[mirai-console-lolicon](../../../index.html)/[com.github.samarium150.mirai.plugin](../index.html)/[Utils](index.html)



# Utils



[jvm]\
object [Utils](index.html)

Object for utility functions <br> 实用函数



## Functions


| Name | Summary |
|---|---|
| [checkMaster](check-master.html) | [jvm]<br>fun [checkMaster](check-master.html)(@Nullable()user: User?): [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)<br>Check whether [user](check-master.html) is the bot owner <br> 检查用户是否是Bot所有者 |
| [checkMemberPerm](check-member-perm.html) | [jvm]<br>fun [checkMemberPerm](check-member-perm.html)(@Nullable()user: User?): [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)<br>Check whether [user](check-member-perm.html) is a group owner or administrator <br> 检查用户在群里的权限 |
| [checkUserPerm](check-user-perm.html) | [jvm]<br>fun [checkUserPerm](check-user-perm.html)(@Nullable()user: User?): [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)<br>Check whether [user](check-user-perm.html) is trusted <br> 检查用户是否受信任 |
| [convertValue](convert-value.html) | [jvm]<br>fun [convertValue](convert-value.html)(value: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), type: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)): [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)<br>Convert [value](convert-value.html) into a valid number for setting the corresponding property <br> 将字符串转为整数值 |
| [getProxyType](get-proxy-type.html) | [jvm]<br>fun [getProxyType](get-proxy-type.html)(value: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)): [Proxy.Type](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/net/Proxy.Type.html)<br>Get proxy type from the given string <br> 根据输入值返回代理类型 |
| [getUrl](get-url.html) | [jvm]<br>fun [getUrl](get-url.html)(urls: [Map](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-map/index.html)<[String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)>): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)? |
| [isPermitted](is-permitted.html) | [jvm]<br>fun [isPermitted](is-permitted.html)(subject: Contact?): [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)<br>Is the subject permitted to use the bot <br> 是否能执行命令 |
| [processTags](process-tags.html) | [jvm]<br>fun [processTags](process-tags.html)(str: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)): [List](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)<[List](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)<[String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)>><br>Process tags |


## Properties


| Name | Summary |
|---|---|
| [sizeMap](size-map.html) | [jvm]<br>private val [sizeMap](size-map.html): [Map](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-map/index.html)<[String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)> |

