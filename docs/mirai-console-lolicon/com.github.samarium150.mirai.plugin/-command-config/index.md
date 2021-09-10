---
title: CommandConfig
---
//[mirai-console-lolicon](../../../index.html)/[com.github.samarium150.mirai.plugin](../index.html)/[CommandConfig](index.html)



# CommandConfig



[jvm]\
object [CommandConfig](index.html) : AutoSavePluginConfig

Command config <br> 实验性质的自定义命令



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
| [_saveName](index.html#-2142358445%2FProperties%2F863300109) | [jvm]<br>private lateinit var [_saveName](index.html#-2142358445%2FProperties%2F863300109): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) |
| [autoSaveIntervalMillis_](index.html#216662738%2FProperties%2F863300109) | [jvm]<br>private val [autoSaveIntervalMillis_](index.html#216662738%2FProperties%2F863300109): [LongRange](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.ranges/-long-range/index.html) |
| [lolicon](lolicon.html) | [jvm]<br>val [lolicon](lolicon.html): [Array](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-array/index.html)<[String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)><br>Composite command secondary names <br> 复合命令的别名 |
| [owner_](index.html#-1975582572%2FProperties%2F863300109) | [jvm]<br>private lateinit var [owner_](index.html#-1975582572%2FProperties%2F863300109): AutoSavePluginDataHolder |
| [saveName](index.html#755152312%2FProperties%2F863300109) | [jvm]<br>override val [saveName](index.html#755152312%2FProperties%2F863300109): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) |
| [saverTask](index.html#-1715427072%2FProperties%2F863300109) | [jvm]<br>private var [saverTask](index.html#-1715427072%2FProperties%2F863300109): TimedTask? |
| [serializersModule](index.html#194567725%2FProperties%2F863300109) | [jvm]<br>open override val [serializersModule](index.html#194567725%2FProperties%2F863300109): SerializersModule |
| [storage_](index.html#-1624090212%2FProperties%2F863300109) | [jvm]<br>private lateinit var [storage_](index.html#-1624090212%2FProperties%2F863300109): PluginDataStorage |
| [updaterSerializer](index.html#-1944692321%2FProperties%2F863300109) | [jvm]<br>override val [updaterSerializer](index.html#-1944692321%2FProperties%2F863300109): KSerializer<[Unit](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)> |
| [valueNodes](index.html#-2094334496%2FProperties%2F863300109) | [jvm]<br>val [valueNodes](index.html#-2094334496%2FProperties%2F863300109): [MutableList](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-mutable-list/index.html)<AbstractPluginData.ValueNode<*>> |

