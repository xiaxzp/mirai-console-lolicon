---
title: PluginConfig
---
//[mirai-console-lolicon](../../../index.html)/[com.github.samarium150.mirai.plugin](../index.html)/[PluginConfig](index.html)



# PluginConfig



[jvm]\
object [PluginConfig](index.html) : AutoSavePluginConfig

Object for auto saving plugin configuration <br> 插件配置



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
| [_saveName](index.html#-1287328683%2FProperties%2F863300109) | [jvm]<br>private lateinit var [_saveName](index.html#-1287328683%2FProperties%2F863300109): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) |
| [autoSaveIntervalMillis_](index.html#1098223444%2FProperties%2F863300109) | [jvm]<br>private val [autoSaveIntervalMillis_](index.html#1098223444%2FProperties%2F863300109): [LongRange](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.ranges/-long-range/index.html) |
| [cache](cache.html) | [jvm]<br>val [cache](cache.html): [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)<br>Enable caching <br> 是否使用已保存的图片作为缓存 |
| [cooldown](cooldown.html) | [jvm]<br>var [cooldown](cooldown.html): [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)<br>Default cooldown time <br> 默认的冷却时间(单位: s) |
| [flash](flash.html) | [jvm]<br>val [flash](flash.html): [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)<br>Enable flash image <br> 是否启用闪照模式 |
| [master](master.html) | [jvm]<br>val [master](master.html): [Long](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-long/index.html)<br>Bot owner's id <br> Bot 所有者账号 |
| [mode](mode.html) | [jvm]<br>val [mode](mode.html): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)<br>mode for Get and adv command <br> Get命令和Adv命令的模式 |
| [owner_](index.html#-1416030254%2FProperties%2F863300109) | [jvm]<br>private lateinit var [owner_](index.html#-1416030254%2FProperties%2F863300109): AutoSavePluginDataHolder |
| [proxy](proxy.html) | [jvm]<br>val [proxy](proxy.html): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)<br>Custom proxy <br> 自定义代理 |
| [recall](recall.html) | [jvm]<br>var [recall](recall.html): [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)<br>Default recall time <br> 默认的撤回时间(单位: s) |
| [recallImg](recall-img.html) | [jvm]<br>var [recallImg](recall-img.html): [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)<br>Enable recalling image <br> 是否撤回图片 |
| [recallImgInfo](recall-img-info.html) | [jvm]<br>var [recallImgInfo](recall-img-info.html): [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)<br>Enable recalling image information <br> 是否撤回图片信息 |
| [save](save.html) | [jvm]<br>val [save](save.html): [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)<br>Enable image saving <br> 是否保存图片 |
| [saveName](index.html#1614017910%2FProperties%2F863300109) | [jvm]<br>override val [saveName](index.html#1614017910%2FProperties%2F863300109): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) |
| [saverTask](index.html#-860397310%2FProperties%2F863300109) | [jvm]<br>private var [saverTask](index.html#-860397310%2FProperties%2F863300109): TimedTask? |
| [serializersModule](index.html#1088451631%2FProperties%2F863300109) | [jvm]<br>open override val [serializersModule](index.html#1088451631%2FProperties%2F863300109): SerializersModule |
| [size](size.html) | [jvm]<br>val [size](size.html): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)<br>Size of the picture <br> 图片大小 |
| [storage_](index.html#-765224614%2FProperties%2F863300109) | [jvm]<br>private lateinit var [storage_](index.html#-765224614%2FProperties%2F863300109): PluginDataStorage |
| [updaterSerializer](index.html#-1050808415%2FProperties%2F863300109) | [jvm]<br>override val [updaterSerializer](index.html#-1050808415%2FProperties%2F863300109): KSerializer<[Unit](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)> |
| [valueNodes](index.html#-1358215650%2FProperties%2F863300109) | [jvm]<br>val [valueNodes](index.html#-1358215650%2FProperties%2F863300109): [MutableList](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-mutable-list/index.html)<AbstractPluginData.ValueNode<*>> |
| [verbose](verbose.html) | [jvm]<br>val [verbose](verbose.html): [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)<br>Sending image info <br> 是否发送图片信息 |

