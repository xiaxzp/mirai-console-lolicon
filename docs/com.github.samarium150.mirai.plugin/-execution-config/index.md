---
title: ExecutionConfig
layout: article
---
//[mirai-console-lolicon](../../index.md)/[com.github.samarium150.mirai.plugin](../index.md)/[ExecutionConfig](index.md)






The configuration used during get-command <br> 执行get命令时的配置

data class [ExecutionConfig](index.md)(**apikey**: [String](https://kotlinlang.org/api/latest//stdlib/kotlin/-string/index.html), **r18**: [Int](https://kotlinlang.org/api/latest//stdlib/kotlin/-int/index.html), **recall**: [Int](https://kotlinlang.org/api/latest//stdlib/kotlin/-int/index.html), **cooldown**: [Int](https://kotlinlang.org/api/latest//stdlib/kotlin/-int/index.html))   


## See also  



| Name                                       | Summary          |
| ------------------------------------------ | ---------------- |
| [PluginConfig](../-plugin-config/index.md) | <br><br><br><br> |
| [PluginData](../-plugin-data/index.md)     | <br><br><br><br> |



## Constructors  

| Name                                    | Summary                                                                                                                                                                                                                                                                                                                                                                                                                                                    |
| --------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| [ExecutionConfig](-execution-config.md) | <br><br>Create a configuration instance <br> 实例化配置<br><br>fun [ExecutionConfig](-execution-config.md)(apikey: [String](https://kotlinlang.org/api/latest//stdlib/kotlin/-string/index.html), r18: [Int](https://kotlinlang.org/api/latest//stdlib/kotlin/-int/index.html), recall: [Int](https://kotlinlang.org/api/latest//stdlib/kotlin/-int/index.html), cooldown: [Int](https://kotlinlang.org/api/latest//stdlib/kotlin/-int/index.html))   <br> |


## Types  

| Name                             | Summary                                                   |
| -------------------------------- | --------------------------------------------------------- |
| [Companion](-companion/index.md) | <br>object [Companion](-companion/index.md)  <br><br><br> |


## Functions  

| Name                                                                             | Summary                                                                                                                                                                                                                                                                                                                                                                                                                        |
| -------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ |
|                                                                                                                                                                                                                             |
| [setAPIKey](set-a-p-i-key.md)                                                    | <br><br>Set [apikey](index.md#com.github.samarium150.mirai.plugin/ExecutionConfig/apikey/#/PointingToDeclaration/) to value <br> 将 [apikey](index.md#com.github.samarium150.mirai.plugin/ExecutionConfig/apikey/#/PointingToDeclaration/) 的值设置为 value<br>  <br>private fun [setAPIKey](set-a-p-i-key.md)(@Nullable()value: [String](https://kotlinlang.org/api/latest//stdlib/kotlin/-string/index.html)?)  <br><br><br> |
| [setCooldown](set-cooldown.md)                                                   | <br><br>Set [cooldown](index.md#com.github.samarium150.mirai.plugin/ExecutionConfig/cooldown/#/PointingToDeclaration/) to value <br> 将 [cooldown](index.md#com.github.samarium150.mirai.plugin/ExecutionConfig/cooldown/#/PointingToDeclaration/) 设置为 value<br>  <br>private fun [setCooldown](set-cooldown.md)(@Nullable()value: [Int](https://kotlinlang.org/api/latest//stdlib/kotlin/-int/index.html)?)  <br><br><br>  |
| [setR18](set-r18.md)                                                             | <br><br>Set [r18](index.md#com.github.samarium150.mirai.plugin/ExecutionConfig/r18/#/PointingToDeclaration/) to value <br> 将 [r18](index.md#com.github.samarium150.mirai.plugin/ExecutionConfig/r18/#/PointingToDeclaration/) 的值设置为 value<br>  <br>private fun [setR18](set-r18.md)(@Nullable()value: [Int](https://kotlinlang.org/api/latest//stdlib/kotlin/-int/index.html)?)  <br><br><br>                            |
| [setRecall](set-recall.md)                                                       | <br><br>Set [recall](index.md#com.github.samarium150.mirai.plugin/ExecutionConfig/recall/#/PointingToDeclaration/) to value <br> 将 [recall](index.md#com.github.samarium150.mirai.plugin/ExecutionConfig/recall/#/PointingToDeclaration/) 的值设置为 value<br>  <br>private fun [setRecall](set-recall.md)(@Nullable()value: [Int](https://kotlinlang.org/api/latest//stdlib/kotlin/-int/index.html)?)  <br><br><br>          |


## Properties  

| Name                                                                                                       | Summary                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             |
| ---------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| [apikey](index.md#com.github.samarium150.mirai.plugin/ExecutionConfig/apikey/#/PointingToDeclaration/)     | <br><br>[PluginConfig.apikey](../-plugin-config/index.md#com.github.samarium150.mirai.plugin/PluginConfig/apikey/#/PointingToDeclaration/)<br><br>var [apikey](index.md#com.github.samarium150.mirai.plugin/ExecutionConfig/apikey/#/PointingToDeclaration/): [String](https://kotlinlang.org/api/latest//stdlib/kotlin/-string/index.html)   <br>                                                                                                                                                  |
| [cooldown](index.md#com.github.samarium150.mirai.plugin/ExecutionConfig/cooldown/#/PointingToDeclaration/) | <br><br>[PluginConfig.cooldown](../-plugin-config/index.md#com.github.samarium150.mirai.plugin/PluginConfig/cooldown/#/PointingToDeclaration/)<br><br>var [cooldown](index.md#com.github.samarium150.mirai.plugin/ExecutionConfig/cooldown/#/PointingToDeclaration/): [Int](https://kotlinlang.org/api/latest//stdlib/kotlin/-int/index.html)   <br>                                                                                                                                                |
| [r18](index.md#com.github.samarium150.mirai.plugin/ExecutionConfig/r18/#/PointingToDeclaration/)           | <br><br>[PluginData.customR18Users](../-plugin-data/index.md#com.github.samarium150.mirai.plugin/PluginData/customR18Users/#/PointingToDeclaration/) and [PluginData.customR18Groups](../-plugin-data/index.md#com.github.samarium150.mirai.plugin/PluginData/customR18Groups/#/PointingToDeclaration/)<br><br>var [r18](index.md#com.github.samarium150.mirai.plugin/ExecutionConfig/r18/#/PointingToDeclaration/): [Int](https://kotlinlang.org/api/latest//stdlib/kotlin/-int/index.html)   <br> |
| [recall](index.md#com.github.samarium150.mirai.plugin/ExecutionConfig/recall/#/PointingToDeclaration/)     | <br><br>[PluginConfig.recall](../-plugin-config/index.md#com.github.samarium150.mirai.plugin/PluginConfig/recall/#/PointingToDeclaration/)<br><br>var [recall](index.md#com.github.samarium150.mirai.plugin/ExecutionConfig/recall/#/PointingToDeclaration/): [Int](https://kotlinlang.org/api/latest//stdlib/kotlin/-int/index.html)   <br>                                                                                                                                                        |

