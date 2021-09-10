---
title: ExecutionConfig
---
//[mirai-console-lolicon](../../../index.html)/[com.github.samarium150.mirai.plugin](../index.html)/[ExecutionConfig](index.html)



# ExecutionConfig



[jvm]\
data class [ExecutionConfig](index.html)(**r18**: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html), **recall**: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html), **cooldown**: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html))

The configuration used during get-command <br> 执行get命令时的配置



## See also


jvm

| | |
|---|---|
| [com.github.samarium150.mirai.plugin.PluginConfig](../-plugin-config/index.html) |  |
| [com.github.samarium150.mirai.plugin.PluginData](../-plugin-data/index.html) |  |



## Constructors


| | |
|---|---|
| [ExecutionConfig](-execution-config.html) | [jvm]<br>fun [ExecutionConfig](-execution-config.html)(r18: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html) = 0, recall: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html) = PluginConfig.recall, cooldown: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html) = PluginConfig.cooldown)<br>Create a configuration instance <br> 实例化配置 |


## Types


| Name | Summary |
|---|---|
| [Companion](-companion/index.html) | [jvm]<br>object [Companion](-companion/index.html) |


## Functions


| Name | Summary |
|---|---|
| [setCooldown](set-cooldown.html) | [jvm]<br>private fun [setCooldown](set-cooldown.html)(@Nullable()value: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)?)<br>Set [cooldown](cooldown.html) to [value](set-cooldown.html)<br> 将 [cooldown](cooldown.html) 设置为 [value](set-cooldown.html) |
| [setR18](set-r18.html) | [jvm]<br>private fun [setR18](set-r18.html)(@Nullable()value: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)?)<br>Set [r18](r18.html) to [value](set-r18.html)<br> 将 [r18](r18.html) 的值设置为 [value](set-r18.html) |
| [setRecall](set-recall.html) | [jvm]<br>private fun [setRecall](set-recall.html)(@Nullable()value: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)?)<br>Set [recall](recall.html) to [value](set-recall.html)<br> 将 [recall](recall.html) 的值设置为 [value](set-recall.html) |


## Properties


| Name | Summary |
|---|---|
| [cooldown](cooldown.html) | [jvm]<br>var [cooldown](cooldown.html): [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)<br>[PluginConfig.cooldown](../-plugin-config/cooldown.html) |
| [r18](r18.html) | [jvm]<br>var [r18](r18.html): [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html) = 0<br>[PluginData.customR18Users](../-plugin-data/custom-r18-users.html) and [PluginData.customR18Groups](../-plugin-data/custom-r18-groups.html) |
| [recall](recall.html) | [jvm]<br>var [recall](recall.html): [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)<br>[PluginConfig.recall](../-plugin-config/recall.html) |

