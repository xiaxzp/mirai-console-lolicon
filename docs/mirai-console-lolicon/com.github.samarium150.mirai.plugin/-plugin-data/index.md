---
title: PluginData
---
//[mirai-console-lolicon](../../../index.html)/[com.github.samarium150.mirai.plugin](../index.html)/[PluginData](index.html)



# PluginData



[jvm]\
object [PluginData](index.html) : AutoSavePluginData

Object for auto saving plugin related data <br> 插件数据



## See also


jvm

| | |
|---|---|
| net.mamoe.mirai.console.data.AutoSavePluginData |  |



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
| [_saveName](index.html#-903367827%2FProperties%2F863300109) | [jvm]<br>private lateinit var [_saveName](index.html#-903367827%2FProperties%2F863300109): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) |
| [autoSaveIntervalMillis_](index.html#-1593701268%2FProperties%2F863300109) | [jvm]<br>private val [autoSaveIntervalMillis_](index.html#-1593701268%2FProperties%2F863300109): [LongRange](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.ranges/-long-range/index.html) |
| [customCooldownGroups](custom-cooldown-groups.html) | [jvm]<br>val [customCooldownGroups](custom-cooldown-groups.html): [MutableMap](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-mutable-map/index.html)<[Long](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-long/index.html), [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)><br>Groups' id and their cooldown mappings <br> 自定义了冷却时间的群和对应的值 |
| [customCooldownUsers](custom-cooldown-users.html) | [jvm]<br>val [customCooldownUsers](custom-cooldown-users.html): [MutableMap](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-mutable-map/index.html)<[Long](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-long/index.html), [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)><br>Users' id and their cooldown mappings <br> 自定义了冷却时间的用户和对应的值 |
| [customR18Groups](custom-r18-groups.html) | [jvm]<br>val [customR18Groups](custom-r18-groups.html): [MutableMap](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-mutable-map/index.html)<[Long](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-long/index.html), [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)><br>Groups that enabled R18 option <br> 自定义了 R18 属性的群 |
| [customR18Users](custom-r18-users.html) | [jvm]<br>val [customR18Users](custom-r18-users.html): [MutableMap](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-mutable-map/index.html)<[Long](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-long/index.html), [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)><br>Users that enabled R18 option <br> 自定义了 R18 属性的用户 |
| [customRecallGroups](custom-recall-groups.html) | [jvm]<br>val [customRecallGroups](custom-recall-groups.html): [MutableMap](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-mutable-map/index.html)<[Long](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-long/index.html), [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)><br>Groups' id and their recall time mappings <br> 自定义了撤回时间的用户和对应的值 |
| [customRecallUsers](custom-recall-users.html) | [jvm]<br>val [customRecallUsers](custom-recall-users.html): [MutableMap](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-mutable-map/index.html)<[Long](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-long/index.html), [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)><br>Users' id and their recall time mappings <br> 自定义了撤回时间的用户和对应的值 |
| [groupSet](group-set.html) | [jvm]<br>val [groupSet](group-set.html): [MutableSet](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-mutable-set/index.html)<[Long](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-long/index.html)><br>Group set <br> 群组列表 |
| [owner_](index.html#1124689850%2FProperties%2F863300109) | [jvm]<br>private lateinit var [owner_](index.html#1124689850%2FProperties%2F863300109): AutoSavePluginDataHolder |
| [saveName](index.html#-590353570%2FProperties%2F863300109) | [jvm]<br>override val [saveName](index.html#-590353570%2FProperties%2F863300109): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) |
| [saverTask](index.html#-476436454%2FProperties%2F863300109) | [jvm]<br>private var [saverTask](index.html#-476436454%2FProperties%2F863300109): TimedTask? |
| [serializersModule](index.html#1853268807%2FProperties%2F863300109) | [jvm]<br>open override val [serializersModule](index.html#1853268807%2FProperties%2F863300109): SerializersModule |
| [storage_](index.html#1325371202%2FProperties%2F863300109) | [jvm]<br>private lateinit var [storage_](index.html#1325371202%2FProperties%2F863300109): PluginDataStorage |
| [trustedUsers](trusted-users.html) | [jvm]<br>val [trustedUsers](trusted-users.html): [MutableSet](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-mutable-set/index.html)<[Long](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-long/index.html)><br>Trusted Users <br> 受信任的用户 |
| [updaterSerializer](index.html#-285991239%2FProperties%2F863300109) | [jvm]<br>override val [updaterSerializer](index.html#-285991239%2FProperties%2F863300109): KSerializer<[Unit](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)> |
| [userSet](user-set.html) | [jvm]<br>val [userSet](user-set.html): [MutableSet](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-mutable-set/index.html)<[Long](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-long/index.html)><br>User set <br> 用户列表 |
| [valueNodes](index.html#1954636294%2FProperties%2F863300109) | [jvm]<br>val [valueNodes](index.html#1954636294%2FProperties%2F863300109): [MutableList](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-mutable-list/index.html)<AbstractPluginData.ValueNode<*>> |

