---
title: Lolicon -
---
//[mirai-console-lolicon](../../../index.md)/[com.github.samarium150.mirai.plugin](../index.md)/[Lolicon](index.md)



# Lolicon  
 [jvm] @ConsoleExperimentalApi()  
  
object [Lolicon](index.md) : CompositeCommand

Command instance <br> 命令实例

   


## See also  
  
jvm  
  
| | |
|---|---|
| <a name="com.github.samarium150.mirai.plugin/Lolicon///PointingToDeclaration/"></a>net.mamoe.mirai.console.command.CompositeCommand| <a name="com.github.samarium150.mirai.plugin/Lolicon///PointingToDeclaration/"></a>|
  


## Functions  
  
|  Name |  Summary | 
|---|---|
| <a name="com.github.samarium150.mirai.plugin/Lolicon/distrust/net.mamoe.mirai.console.command.CommandSender#kotlin.Long/PointingToDeclaration/"></a>[distrust](distrust.md)| <a name="com.github.samarium150.mirai.plugin/Lolicon/distrust/net.mamoe.mirai.console.command.CommandSender#kotlin.Long/PointingToDeclaration/"></a>[jvm]  <br>Content  <br>suspend fun CommandSender.[distrust](distrust.md)(id: [Long](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-long/index.html))  <br>More info  <br>Subcommand distrust, remove user from trusted set <br> 子命令distrust，将用户从受信任名单中移除  <br><br><br>|
| <a name="com.github.samarium150.mirai.plugin/Lolicon/get/net.mamoe.mirai.console.command.CommandSender#kotlin.String/PointingToDeclaration/"></a>[get](get.md)| <a name="com.github.samarium150.mirai.plugin/Lolicon/get/net.mamoe.mirai.console.command.CommandSender#kotlin.String/PointingToDeclaration/"></a>[jvm]  <br>Content  <br>suspend fun CommandSender.[get](get.md)(keyword: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) = "")  <br>More info  <br>Subcommand get, get the image according to [keyword](get.md)<br> 子命令get，根据 [keyword](get.md) 从API获取图片  <br><br><br>|
| <a name="com.github.samarium150.mirai.plugin/Lolicon/help/net.mamoe.mirai.console.command.CommandSender#/PointingToDeclaration/"></a>[help](help.md)| <a name="com.github.samarium150.mirai.plugin/Lolicon/help/net.mamoe.mirai.console.command.CommandSender#/PointingToDeclaration/"></a>[jvm]  <br>Content  <br>suspend fun CommandSender.[help](help.md)()  <br>More info  <br>SubCommand help, send help information <br> 子命令help，获取帮助信息  <br><br><br>|
| <a name="com.github.samarium150.mirai.plugin/Lolicon/reload/net.mamoe.mirai.console.command.CommandSender#/PointingToDeclaration/"></a>[reload](reload.md)| <a name="com.github.samarium150.mirai.plugin/Lolicon/reload/net.mamoe.mirai.console.command.CommandSender#/PointingToDeclaration/"></a>[jvm]  <br>Content  <br>suspend fun CommandSender.[reload](reload.md)()  <br>More info  <br>Subcommand reload, reload plugin configuration and data <br> 子命令reload，重新载入插件配置和数据  <br><br><br>|
| <a name="com.github.samarium150.mirai.plugin/Lolicon/set/net.mamoe.mirai.console.command.CommandSender#kotlin.String#kotlin.String/PointingToDeclaration/"></a>[set](set.md)| <a name="com.github.samarium150.mirai.plugin/Lolicon/set/net.mamoe.mirai.console.command.CommandSender#kotlin.String#kotlin.String/PointingToDeclaration/"></a>[jvm]  <br>Content  <br>suspend fun CommandSender.[set](set.md)(property: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), value: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html))  <br>More info  <br>Subcommand set, set [property](set.md) and its [value](set.md)<br> 子命令set，设置属性和对应的值  <br><br><br>|
| <a name="com.github.samarium150.mirai.plugin/Lolicon/trust/net.mamoe.mirai.console.command.CommandSender#kotlin.Long/PointingToDeclaration/"></a>[trust](trust.md)| <a name="com.github.samarium150.mirai.plugin/Lolicon/trust/net.mamoe.mirai.console.command.CommandSender#kotlin.Long/PointingToDeclaration/"></a>[jvm]  <br>Content  <br>suspend fun CommandSender.[trust](trust.md)(id: [Long](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-long/index.html))  <br>More info  <br>Subcommand trust, add user to trusted set <br> 子命令trust，将用户添加到受信任名单  <br><br><br>|


## Properties  
  
|  Name |  Summary | 
|---|---|
| <a name="com.github.samarium150.mirai.plugin/Lolicon/context/#/PointingToDeclaration/"></a>[context](index.md#1019906038%2FProperties%2F863300109)| <a name="com.github.samarium150.mirai.plugin/Lolicon/context/#/PointingToDeclaration/"></a> [jvm] override val [context](index.md#1019906038%2FProperties%2F863300109): CommandArgumentContext   <br>|
| <a name="com.github.samarium150.mirai.plugin/Lolicon/description/#/PointingToDeclaration/"></a>[description](index.md#461583945%2FProperties%2F863300109)| <a name="com.github.samarium150.mirai.plugin/Lolicon/description/#/PointingToDeclaration/"></a> [jvm] abstract val [description](index.md#461583945%2FProperties%2F863300109): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)   <br>|
| <a name="com.github.samarium150.mirai.plugin/Lolicon/help/#/PointingToDeclaration/"></a>[help](help.md)| <a name="com.github.samarium150.mirai.plugin/Lolicon/help/#/PointingToDeclaration/"></a> [jvm] private val [help](help.md): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)Help information <br> 帮助信息   <br>|
| <a name="com.github.samarium150.mirai.plugin/Lolicon/overloads/#/PointingToDeclaration/"></a>[overloads](index.md#-1875713300%2FProperties%2F863300109)| <a name="com.github.samarium150.mirai.plugin/Lolicon/overloads/#/PointingToDeclaration/"></a> [jvm] override val [overloads](index.md#-1875713300%2FProperties%2F863300109): [List](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)<CommandSignatureFromKFunction>   <br>|
| <a name="com.github.samarium150.mirai.plugin/Lolicon/owner/#/PointingToDeclaration/"></a>[owner](index.md#-905979534%2FProperties%2F863300109)| <a name="com.github.samarium150.mirai.plugin/Lolicon/owner/#/PointingToDeclaration/"></a> [jvm] abstract val [owner](index.md#-905979534%2FProperties%2F863300109): CommandOwner   <br>|
| <a name="com.github.samarium150.mirai.plugin/Lolicon/permission/#/PointingToDeclaration/"></a>[permission](index.md#1466781894%2FProperties%2F863300109)| <a name="com.github.samarium150.mirai.plugin/Lolicon/permission/#/PointingToDeclaration/"></a> [jvm] abstract val [permission](index.md#1466781894%2FProperties%2F863300109): Permission   <br>|
| <a name="com.github.samarium150.mirai.plugin/Lolicon/prefixOptional/#/PointingToDeclaration/"></a>[prefixOptional](prefix-optional.md)| <a name="com.github.samarium150.mirai.plugin/Lolicon/prefixOptional/#/PointingToDeclaration/"></a> [jvm] @ExperimentalCommandDescriptors()  <br>@ConsoleExperimentalApi()  <br>  <br>open override val [prefixOptional](prefix-optional.md): [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html) = trueset prefix to be optional <br> 忽略前缀   <br>|
| <a name="com.github.samarium150.mirai.plugin/Lolicon/primaryName/#/PointingToDeclaration/"></a>[primaryName](index.md#-636622920%2FProperties%2F863300109)| <a name="com.github.samarium150.mirai.plugin/Lolicon/primaryName/#/PointingToDeclaration/"></a> [jvm] abstract val [primaryName](index.md#-636622920%2FProperties%2F863300109): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)   <br>|
| <a name="com.github.samarium150.mirai.plugin/Lolicon/reflector/#/PointingToDeclaration/"></a>[reflector](index.md#1453902693%2FProperties%2F863300109)| <a name="com.github.samarium150.mirai.plugin/Lolicon/reflector/#/PointingToDeclaration/"></a> [jvm] private val [reflector](index.md#1453902693%2FProperties%2F863300109): CommandReflector   <br>|
| <a name="com.github.samarium150.mirai.plugin/Lolicon/secondaryNames/#/PointingToDeclaration/"></a>[secondaryNames](index.md#-482088959%2FProperties%2F863300109)| <a name="com.github.samarium150.mirai.plugin/Lolicon/secondaryNames/#/PointingToDeclaration/"></a> [jvm] abstract val [secondaryNames](index.md#-482088959%2FProperties%2F863300109): [Array](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-array/index.html)<out [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)>   <br>|
| <a name="com.github.samarium150.mirai.plugin/Lolicon/usage/#/PointingToDeclaration/"></a>[usage](index.md#1221056068%2FProperties%2F863300109)| <a name="com.github.samarium150.mirai.plugin/Lolicon/usage/#/PointingToDeclaration/"></a> [jvm] open override val [usage](index.md#1221056068%2FProperties%2F863300109): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)   <br>|

