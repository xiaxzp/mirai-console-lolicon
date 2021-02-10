---
title: PluginData
layout: article
---
//[mirai-console-lolicon](../../index.md)/[com.github.samarium150.mirai.plugin](../index.md)/[PluginData](index.md)






Object for auto saving plugin related data <br> 插件数据

object [PluginData](index.md) : AutoSavePluginData   


## See also  



| Name                                            | Summary          |
| ----------------------------------------------- | ---------------- |
| net.mamoe.mirai.console.data.AutoSavePluginData | <br><br><br><br> |


## Properties  

| Name                                                                                                                                | Summary                                                                                                                                                                                                                                                                                                                                                                                                                                                                                         |
| ----------------------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| [customAPIKeyGroups](index.md#com.github.samarium150.mirai.plugin/PluginData/customAPIKeyGroups/#/PointingToDeclaration/)           | <br><br>Groups' id and their apikey mappings <br> 自定义了 apikey 的群和对应的 apikey<br><br>val [customAPIKeyGroups](index.md#com.github.samarium150.mirai.plugin/PluginData/customAPIKeyGroups/#/PointingToDeclaration/): [MutableMap](https://kotlinlang.org/api/latest//stdlib/kotlin.collections/-mutable-map/index.html)<[Long](https://kotlinlang.org/api/latest//stdlib/kotlin/-long/index.html), [String](https://kotlinlang.org/api/latest//stdlib/kotlin/-string/index.html)>   <br> |
| [customAPIKeyUsers](index.md#com.github.samarium150.mirai.plugin/PluginData/customAPIKeyUsers/#/PointingToDeclaration/)             | <br><br>Users' id and their apikey mappings <br> 自定义了 apikey 的用户和对应的 apikey<br><br>val [customAPIKeyUsers](index.md#com.github.samarium150.mirai.plugin/PluginData/customAPIKeyUsers/#/PointingToDeclaration/): [MutableMap](https://kotlinlang.org/api/latest//stdlib/kotlin.collections/-mutable-map/index.html)<[Long](https://kotlinlang.org/api/latest//stdlib/kotlin/-long/index.html), [String](https://kotlinlang.org/api/latest//stdlib/kotlin/-string/index.html)>   <br>  |
| [customCooldownGroups](index.md#com.github.samarium150.mirai.plugin/PluginData/customCooldownGroups/#/PointingToDeclaration/)       | <br><br>Groups' id and their cooldown mappings <br> 自定义了冷却时间的群和对应的值<br><br>val [customCooldownGroups](index.md#com.github.samarium150.mirai.plugin/PluginData/customCooldownGroups/#/PointingToDeclaration/): [MutableMap](https://kotlinlang.org/api/latest//stdlib/kotlin.collections/-mutable-map/index.html)<[Long](https://kotlinlang.org/api/latest//stdlib/kotlin/-long/index.html), [Int](https://kotlinlang.org/api/latest//stdlib/kotlin/-int/index.html)>   <br>      |
| [customCooldownUsers](index.md#com.github.samarium150.mirai.plugin/PluginData/customCooldownUsers/#/PointingToDeclaration/)         | <br><br>Users' id and their cooldown mappings <br> 自定义了冷却时间的用户和对应的值<br><br>val [customCooldownUsers](index.md#com.github.samarium150.mirai.plugin/PluginData/customCooldownUsers/#/PointingToDeclaration/): [MutableMap](https://kotlinlang.org/api/latest//stdlib/kotlin.collections/-mutable-map/index.html)<[Long](https://kotlinlang.org/api/latest//stdlib/kotlin/-long/index.html), [Int](https://kotlinlang.org/api/latest//stdlib/kotlin/-int/index.html)>   <br>       |
| [customR18Groups](index.md#com.github.samarium150.mirai.plugin/PluginData/customR18Groups/#/PointingToDeclaration/)                 | <br><br>Groups that enabled R18 option <br> 自定义了 R18 属性的群<br><br>val [customR18Groups](index.md#com.github.samarium150.mirai.plugin/PluginData/customR18Groups/#/PointingToDeclaration/): [MutableMap](https://kotlinlang.org/api/latest//stdlib/kotlin.collections/-mutable-map/index.html)<[Long](https://kotlinlang.org/api/latest//stdlib/kotlin/-long/index.html), [Int](https://kotlinlang.org/api/latest//stdlib/kotlin/-int/index.html)>   <br>                                 |
| [customR18Users](index.md#com.github.samarium150.mirai.plugin/PluginData/customR18Users/#/PointingToDeclaration/)                   | <br><br>Users that enabled R18 option <br> 自定义了 R18 属性的用户<br><br>val [customR18Users](index.md#com.github.samarium150.mirai.plugin/PluginData/customR18Users/#/PointingToDeclaration/): [MutableMap](https://kotlinlang.org/api/latest//stdlib/kotlin.collections/-mutable-map/index.html)<[Long](https://kotlinlang.org/api/latest//stdlib/kotlin/-long/index.html), [Int](https://kotlinlang.org/api/latest//stdlib/kotlin/-int/index.html)>   <br>                                  |
| [customRecallGroups](index.md#com.github.samarium150.mirai.plugin/PluginData/customRecallGroups/#/PointingToDeclaration/)           | <br><br>Groups' id and their recall time mappings <br> 自定义了撤回时间的用户和对应的值<br><br>val [customRecallGroups](index.md#com.github.samarium150.mirai.plugin/PluginData/customRecallGroups/#/PointingToDeclaration/): [MutableMap](https://kotlinlang.org/api/latest//stdlib/kotlin.collections/-mutable-map/index.html)<[Long](https://kotlinlang.org/api/latest//stdlib/kotlin/-long/index.html), [Int](https://kotlinlang.org/api/latest//stdlib/kotlin/-int/index.html)>   <br>     |
| [customRecallUsers](index.md#com.github.samarium150.mirai.plugin/PluginData/customRecallUsers/#/PointingToDeclaration/)             | <br><br>Users' id and their recall time mappings <br> 自定义了撤回时间的用户和对应的值<br><br>val [customRecallUsers](index.md#com.github.samarium150.mirai.plugin/PluginData/customRecallUsers/#/PointingToDeclaration/): [MutableMap](https://kotlinlang.org/api/latest//stdlib/kotlin.collections/-mutable-map/index.html)<[Long](https://kotlinlang.org/api/latest//stdlib/kotlin/-long/index.html), [Int](https://kotlinlang.org/api/latest//stdlib/kotlin/-int/index.html)>   <br>        |
| [trustedUsers](index.md#com.github.samarium150.mirai.plugin/PluginData/trustedUsers/#/PointingToDeclaration/)                       | <br><br>Trusted Users <br> 受信任的用户<br><br>val [trustedUsers](index.md#com.github.samarium150.mirai.plugin/PluginData/trustedUsers/#/PointingToDeclaration/): [MutableSet](https://kotlinlang.org/api/latest//stdlib/kotlin.collections/-mutable-set/index.html)<[Long](https://kotlinlang.org/api/latest//stdlib/kotlin/-long/index.html)>   <br>                                                                                                                                          |
