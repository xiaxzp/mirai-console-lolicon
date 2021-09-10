---
title: ProxyConfig
---
//[mirai-console-lolicon](../../../index.html)/[com.github.samarium150.mirai.plugin](../index.html)/[ProxyConfig](index.html)



# ProxyConfig



[jvm]\
object [ProxyConfig](index.html) : AutoSavePluginConfig

Proxy config <br> 自定义代理



## See also


jvm

| | |
|---|---|
| net.mamoe.mirai.console.data.AutoSavePluginConfig |  |



## Functions


| Name | Summary |
|---|---|
| [doSave](../-reply-config/index.html#-1838414339%2FFunctions%2F863300109) | [jvm]<br>private fun [doSave](../-reply-config/index.html#-1838414339%2FFunctions%2F863300109)() |
| [findNodeInstance](../-reply-config/index.html#-1300372738%2FFunctions%2F863300109) | [jvm]<br>private fun [findNodeInstance](../-reply-config/index.html#-1300372738%2FFunctions%2F863300109)(name: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)): AbstractPluginData.ValueNode<*>? |
| [logException](../-reply-config/index.html#-973621049%2FFunctions%2F863300109) | [jvm]<br>private fun [logException](../-reply-config/index.html#-973621049%2FFunctions%2F863300109)(e: [Throwable](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-throwable/index.html)) |
| [onInit](../-reply-config/index.html#1381327192%2FFunctions%2F863300109) | [jvm]<br>open override fun [onInit](../-reply-config/index.html#1381327192%2FFunctions%2F863300109)(owner: PluginDataHolder, storage: PluginDataStorage) |
| [onValueChanged](../-reply-config/index.html#238717877%2FFunctions%2F863300109) | [jvm]<br>override fun [onValueChanged](../-reply-config/index.html#238717877%2FFunctions%2F863300109)(value: Value<*>) |
| [provideDelegate](../-reply-config/index.html#960925360%2FFunctions%2F863300109) | [jvm]<br>operator fun <[T](../-reply-config/index.html#960925360%2FFunctions%2F863300109) : SerializerAwareValue<*>> [T](../-reply-config/index.html#960925360%2FFunctions%2F863300109).[provideDelegate](../-reply-config/index.html#960925360%2FFunctions%2F863300109)(thisRef: [Any](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)?, property: [KProperty](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.reflect/-k-property/index.html)<*>): [T](../-reply-config/index.html#960925360%2FFunctions%2F863300109) |
| [save](../-reply-config/index.html#-411480888%2FFunctions%2F863300109) | [jvm]<br>private fun [save](../-reply-config/index.html#-411480888%2FFunctions%2F863300109)() |
| [shouldPerformAutoSaveWheneverChanged](../-reply-config/index.html#816398627%2FFunctions%2F863300109) | [jvm]<br>protected open fun [shouldPerformAutoSaveWheneverChanged](../-reply-config/index.html#816398627%2FFunctions%2F863300109)(): [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html) |
| [track](../-reply-config/index.html#-997757058%2FFunctions%2F863300109) | [jvm]<br>open fun <[T](../-reply-config/index.html#-997757058%2FFunctions%2F863300109) : SerializerAwareValue<*>> [track](../-reply-config/index.html#-997757058%2FFunctions%2F863300109)(value: [T](../-reply-config/index.html#-997757058%2FFunctions%2F863300109), valueName: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), annotations: [List](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)<[Annotation](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-annotation/index.html)>): [T](../-reply-config/index.html#-997757058%2FFunctions%2F863300109) |


## Properties


| Name | Summary |
|---|---|
| [_saveName](index.html#-305797296%2FProperties%2F863300109) | [jvm]<br>private lateinit var [_saveName](index.html#-305797296%2FProperties%2F863300109): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) |
| [autoSaveIntervalMillis_](index.html#2077898511%2FProperties%2F863300109) | [jvm]<br>private val [autoSaveIntervalMillis_](index.html#2077898511%2FProperties%2F863300109): [LongRange](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.ranges/-long-range/index.html) |
| [hostname](hostname.html) | [jvm]<br>val [hostname](hostname.html): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)<br>Hostname <br> IP地址 |
| [owner_](index.html#150697655%2FProperties%2F863300109) | [jvm]<br>private lateinit var [owner_](index.html#150697655%2FProperties%2F863300109): AutoSavePluginDataHolder |
| [port](port.html) | [jvm]<br>val [port](port.html): [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)<br>Port <br> 端口 |
| [saveName](index.html#-293982437%2FProperties%2F863300109) | [jvm]<br>override val [saveName](index.html#-293982437%2FProperties%2F863300109): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) |
| [saverTask](index.html#121134077%2FProperties%2F863300109) | [jvm]<br>private var [saverTask](index.html#121134077%2FProperties%2F863300109): TimedTask? |
| [serializersModule](index.html#786449450%2FProperties%2F863300109) | [jvm]<br>open override val [serializersModule](index.html#786449450%2FProperties%2F863300109): SerializersModule |
| [storage_](index.html#1621742335%2FProperties%2F863300109) | [jvm]<br>private lateinit var [storage_](index.html#1621742335%2FProperties%2F863300109): PluginDataStorage |
| [type](type.html) | [jvm]<br>val [type](type.html): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)<br>Type <br> 代理类型 |
| [updaterSerializer](index.html#-1352810596%2FProperties%2F863300109) | [jvm]<br>override val [updaterSerializer](index.html#-1352810596%2FProperties%2F863300109): KSerializer<[Unit](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)> |
| [valueNodes](index.html#-995513725%2FProperties%2F863300109) | [jvm]<br>val [valueNodes](index.html#-995513725%2FProperties%2F863300109): [MutableList](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-mutable-list/index.html)<AbstractPluginData.ValueNode<*>> |

