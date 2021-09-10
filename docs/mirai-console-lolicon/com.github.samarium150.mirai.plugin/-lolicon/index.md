---
title: Lolicon
---
//[mirai-console-lolicon](../../../index.html)/[com.github.samarium150.mirai.plugin](../index.html)/[Lolicon](index.html)



# Lolicon



[jvm]\
object [Lolicon](index.html) : CompositeCommand

Command instance <br> 命令实例



## See also


jvm

| | |
|---|---|
| net.mamoe.mirai.console.command.CompositeCommand |  |



## Functions


| Name | Summary |
|---|---|
| [add](add.html) | [jvm]<br>suspend fun CommandSender.[add](add.html)(type: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), id: [Long](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-long/index.html))<br>Add user id or group id to corresponding set <br> 添加用户id或群组id到对应的集合，用于黑白名单 |
| [advanced](advanced.html) | [jvm]<br>suspend fun CommandSender.[advanced](advanced.html)(json: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html))<br>Advanced get <br> 子命令adv，根据[json](advanced.html)获取图片 |
| [distrust](distrust.html) | [jvm]<br>suspend fun CommandSender.[distrust](distrust.html)(id: [Long](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-long/index.html))<br>Subcommand distrust, remove user from trusted set <br> 子命令distrust，将用户从受信任名单中移除 |
| [get](get.html) | [jvm]<br>suspend fun CommandSender.[get](get.html)(tags: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) = "")<br>Subcommand get, get the image according to [tags](get.html)<br> 子命令get，根据 [tags](get.html) 从API获取图片 |
| [help](help.html) | [jvm]<br>suspend fun CommandSender.[help](help.html)()<br>SubCommand help, send help information <br> 子命令help，获取帮助信息 |
| [reload](reload.html) | [jvm]<br>suspend fun CommandSender.[reload](reload.html)()<br>Subcommand reload, reload plugin configuration and data <br> 子命令reload，重新载入插件配置和数据 |
| [set](set.html) | [jvm]<br>suspend fun CommandSender.[set](set.html)(property: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), value: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html))<br>Subcommand set, set [property](set.html) and its [value](set.html)<br> 子命令set，设置属性和对应的值 |
| [trust](trust.html) | [jvm]<br>suspend fun CommandSender.[trust](trust.html)(id: [Long](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-long/index.html))<br>Subcommand trust, add user to trusted set <br> 子命令trust，将用户添加到受信任名单 |


## Properties


| Name | Summary |
|---|---|
| [context](index.html#1019906038%2FProperties%2F863300109) | [jvm]<br>override val [context](index.html#1019906038%2FProperties%2F863300109): CommandArgumentContext |
| [description](index.html#461583945%2FProperties%2F863300109) | [jvm]<br>abstract val [description](index.html#461583945%2FProperties%2F863300109): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) |
| [help](help.html) | [jvm]<br>private val [help](help.html): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)<br>Help information <br> 帮助信息 |
| [overloads](index.html#-1875713300%2FProperties%2F863300109) | [jvm]<br>override val [overloads](index.html#-1875713300%2FProperties%2F863300109): [List](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)<CommandSignatureFromKFunction> |
| [owner](index.html#-905979534%2FProperties%2F863300109) | [jvm]<br>abstract val [owner](index.html#-905979534%2FProperties%2F863300109): CommandOwner |
| [permission](index.html#1466781894%2FProperties%2F863300109) | [jvm]<br>abstract val [permission](index.html#1466781894%2FProperties%2F863300109): Permission |
| [prefixOptional](prefix-optional.html) | [jvm]<br>@ExperimentalCommandDescriptors()<br>@ConsoleExperimentalApi()<br>open override val [prefixOptional](prefix-optional.html): [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html) = true<br>set prefix to be optional <br> 忽略前缀 |
| [primaryName](index.html#-636622920%2FProperties%2F863300109) | [jvm]<br>abstract val [primaryName](index.html#-636622920%2FProperties%2F863300109): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) |
| [reflector](index.html#1453902693%2FProperties%2F863300109) | [jvm]<br>private val [reflector](index.html#1453902693%2FProperties%2F863300109): CommandReflector |
| [secondaryNames](index.html#-482088959%2FProperties%2F863300109) | [jvm]<br>abstract val [secondaryNames](index.html#-482088959%2FProperties%2F863300109): [Array](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-array/index.html)<out [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)> |
| [usage](index.html#1221056068%2FProperties%2F863300109) | [jvm]<br>open override val [usage](index.html#1221056068%2FProperties%2F863300109): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) |

