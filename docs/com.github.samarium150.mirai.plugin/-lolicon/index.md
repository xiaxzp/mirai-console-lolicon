---
title: Lolicon
layout: article
---
//[mirai-console-lolicon](../../index.md)/[com.github.samarium150.mirai.plugin](../index.md)/[Lolicon](index.md)






Command instance <br> 命令实例

object [Lolicon](index.md) : CompositeCommand   


## See also  



| Name                                             | Summary          |
| ------------------------------------------------ | ---------------- |
| net.mamoe.mirai.console.command.CompositeCommand | <br><br><br><br> |



## Functions  

| Name                                                                             | Summary                                                                                                                                                                                                                                                                                                                             |
| -------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| [distrust](distrust.md)                                                          | <br><br>Subcommand distrust, remove user from trusted set <br> 子命令distrust，将用户从受信任名单中移除<br>  <br>suspend fun CommandSender.[distrust](distrust.md)(id: [Long](https://kotlinlang.org/api/latest//stdlib/kotlin/-long/index.html))  <br><br><br>                                                                     |
| [get](get.md)                                                                    | <br><br>Subcommand get, get the image according to keyword <br> 子命令get，根据 keyword 从API获取图片<br>  <br>suspend fun CommandSender.[get](get.md)(keyword: [String](https://kotlinlang.org/api/latest//stdlib/kotlin/-string/index.html))  <br><br><br>                                                                        |
| [help](help.md)                                                                  | <br><br>SubCommand help, send help information <br> 子命令help，获取帮助信息<br>  <br>suspend fun CommandSender.[help](help.md)()  <br><br><br>                                                                                                                                                                                     |
| [reload](reload.md)                                                              | <br><br>Subcommand reload, reload plugin configuration and data <br> 子命令reload，重新载入插件配置和数据<br>  <br>suspend fun CommandSender.[reload](reload.md)()  <br><br><br>                                                                                                                                                    |
| [set](set.md)                                                                    | <br><br>Subcommand set, set property and its value <br> 子命令set，设置属性和对应的值<br>  <br>suspend fun CommandSender.[set](set.md)(property: [String](https://kotlinlang.org/api/latest//stdlib/kotlin/-string/index.html), value: [String](https://kotlinlang.org/api/latest//stdlib/kotlin/-string/index.html))  <br><br><br> |
| [trust](trust.md)                                                                | <br><br>Subcommand trust, add user to trusted set <br> 子命令trust，将用户添加到受信任名单<br>  <br>suspend fun CommandSender.[trust](trust.md)(id: [Long](https://kotlinlang.org/api/latest//stdlib/kotlin/-long/index.html))  <br><br><br>                                                                                        |


## Properties  

| Name                                                                                                           | Summary                                                                                                                                                                                                                                                                                              |
| -------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| [help](index.md#com.github.samarium150.mirai.plugin/Lolicon/help/#/PointingToDeclaration/)                     | <br><br>Help information <br> 帮助信息<br><br>private val [help](index.md#com.github.samarium150.mirai.plugin/Lolicon/help/#/PointingToDeclaration/): [String](https://kotlinlang.org/api/latest//stdlib/kotlin/-string/index.html)   <br>                                                           |
