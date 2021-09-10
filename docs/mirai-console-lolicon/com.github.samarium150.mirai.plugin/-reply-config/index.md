---
title: ReplyConfig
---
//[mirai-console-lolicon](../../../index.html)/[com.github.samarium150.mirai.plugin](../index.html)/[ReplyConfig](index.html)



# ReplyConfig



[jvm]\
object [ReplyConfig](index.html) : AutoSavePluginConfig

Reply config <br> 自定义回复语句



## See also


jvm

| | |
|---|---|
| net.mamoe.mirai.console.data.AutoSavePluginConfig |  |



## Functions


| Name | Summary |
|---|---|
| [doSave](index.html#-1838414339%2FFunctions%2F863300109) | [jvm]<br>private fun [doSave](index.html#-1838414339%2FFunctions%2F863300109)() |
| [findNodeInstance](index.html#-1300372738%2FFunctions%2F863300109) | [jvm]<br>private fun [findNodeInstance](index.html#-1300372738%2FFunctions%2F863300109)(name: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)): AbstractPluginData.ValueNode<*>? |
| [logException](index.html#-973621049%2FFunctions%2F863300109) | [jvm]<br>private fun [logException](index.html#-973621049%2FFunctions%2F863300109)(e: [Throwable](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-throwable/index.html)) |
| [onInit](index.html#1381327192%2FFunctions%2F863300109) | [jvm]<br>open override fun [onInit](index.html#1381327192%2FFunctions%2F863300109)(owner: PluginDataHolder, storage: PluginDataStorage) |
| [onValueChanged](index.html#238717877%2FFunctions%2F863300109) | [jvm]<br>override fun [onValueChanged](index.html#238717877%2FFunctions%2F863300109)(value: Value<*>) |
| [provideDelegate](index.html#960925360%2FFunctions%2F863300109) | [jvm]<br>operator fun <[T](index.html#960925360%2FFunctions%2F863300109) : SerializerAwareValue<*>> [T](index.html#960925360%2FFunctions%2F863300109).[provideDelegate](index.html#960925360%2FFunctions%2F863300109)(thisRef: [Any](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)?, property: [KProperty](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.reflect/-k-property/index.html)<*>): [T](index.html#960925360%2FFunctions%2F863300109) |
| [save](index.html#-411480888%2FFunctions%2F863300109) | [jvm]<br>private fun [save](index.html#-411480888%2FFunctions%2F863300109)() |
| [shouldPerformAutoSaveWheneverChanged](index.html#816398627%2FFunctions%2F863300109) | [jvm]<br>protected open fun [shouldPerformAutoSaveWheneverChanged](index.html#816398627%2FFunctions%2F863300109)(): [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html) |
| [track](index.html#-997757058%2FFunctions%2F863300109) | [jvm]<br>open fun <[T](index.html#-997757058%2FFunctions%2F863300109) : SerializerAwareValue<*>> [track](index.html#-997757058%2FFunctions%2F863300109)(value: [T](index.html#-997757058%2FFunctions%2F863300109), valueName: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), annotations: [List](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)<[Annotation](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-annotation/index.html)>): [T](index.html#-997757058%2FFunctions%2F863300109) |


## Properties


| Name | Summary |
|---|---|
| [_saveName](index.html#-1973003692%2FProperties%2F863300109) | [jvm]<br>private lateinit var [_saveName](index.html#-1973003692%2FProperties%2F863300109): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) |
| [alreadyExists](already-exists.html) | [jvm]<br>val [alreadyExists](already-exists.html): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)<br>Already exists <br> 用户已在信任列表中 |
| [autoSaveIntervalMillis_](index.html#2023953171%2FProperties%2F863300109) | [jvm]<br>private val [autoSaveIntervalMillis_](index.html#2023953171%2FProperties%2F863300109): [LongRange](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.ranges/-long-range/index.html) |
| [distrustSucceeded](distrust-succeeded.html) | [jvm]<br>val [distrustSucceeded](distrust-succeeded.html): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)<br>Distrust succeeded <br> 从信任列表中移除成功 |
| [doesNotExists](does-not-exists.html) | [jvm]<br>val [doesNotExists](does-not-exists.html): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)<br>Does not exists <br> 用户不在信任列表中 |
| [emptyImageData](empty-image-data.html) | [jvm]<br>val [emptyImageData](empty-image-data.html): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)<br>API returns empty list <br> API 返回了空列表 |
| [illegalProperty](illegal-property.html) | [jvm]<br>val [illegalProperty](illegal-property.html): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)<br>Illegal property <br> 非法属性 |
| [illegalValue](illegal-value.html) | [jvm]<br>val [illegalValue](illegal-value.html): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)<br>Illegal value <br> 非法值 |
| [inCooldown](in-cooldown.html) | [jvm]<br>val [inCooldown](in-cooldown.html): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)<br>In cooldown <br> 指令未冷却 |
| [invalidJson](invalid-json.html) | [jvm]<br>val [invalidJson](invalid-json.html): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)<br>Invalid json <br> JSON格式错误 |
| [invokeException](invoke-exception.html) | [jvm]<br>val [invokeException](invoke-exception.html): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)<br>API returns errors <br> API 返回了错误 |
| [networkError](network-error.html) | [jvm]<br>val [networkError](network-error.html): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)<br>Network error <br> 获取图片失败 |
| [noMasterID](no-master-i-d.html) | [jvm]<br>val [noMasterID](no-master-i-d.html): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)<br>No master id <br> 没有填写master qq号 |
| [nonAdminPermissionDenied](non-admin-permission-denied.html) | [jvm]<br>val [nonAdminPermissionDenied](non-admin-permission-denied.html): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)<br>Non admin permission denied <br> 没有群主和管理员权限 |
| [nonMasterPermissionDenied](non-master-permission-denied.html) | [jvm]<br>val [nonMasterPermissionDenied](non-master-permission-denied.html): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)<br>Non master permission denied <br> 不是Bot master |
| [owner_](index.html#-359431629%2FProperties%2F863300109) | [jvm]<br>private lateinit var [owner_](index.html#-359431629%2FProperties%2F863300109): AutoSavePluginDataHolder |
| [reloaded](reloaded.html) | [jvm]<br>val [reloaded](reloaded.html): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)<br>Reloaded <br> 配置已重载 |
| [saveName](index.html#-901952617%2FProperties%2F863300109) | [jvm]<br>override val [saveName](index.html#-901952617%2FProperties%2F863300109): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) |
| [saverTask](index.html#-1546072319%2FProperties%2F863300109) | [jvm]<br>private var [saverTask](index.html#-1546072319%2FProperties%2F863300109): TimedTask? |
| [serializersModule](index.html#980382510%2FProperties%2F863300109) | [jvm]<br>open override val [serializersModule](index.html#980382510%2FProperties%2F863300109): SerializersModule |
| [setSucceeded](set-succeeded.html) | [jvm]<br>val [setSucceeded](set-succeeded.html): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)<br>Set succeeded <br> set命令执行成功 |
| [storage_](index.html#1013772155%2FProperties%2F863300109) | [jvm]<br>private lateinit var [storage_](index.html#1013772155%2FProperties%2F863300109): PluginDataStorage |
| [trustSucceeded](trust-succeeded.html) | [jvm]<br>val [trustSucceeded](trust-succeeded.html): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)<br>Trust succeeded <br> 添加到信任列表成功 |
| [untrusted](untrusted.html) | [jvm]<br>val [untrusted](untrusted.html): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)<br>Untrusted <br> 非受信任的用户 |
| [updaterSerializer](index.html#-1158877536%2FProperties%2F863300109) | [jvm]<br>override val [updaterSerializer](index.html#-1158877536%2FProperties%2F863300109): KSerializer<[Unit](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)> |
| [valueNodes](index.html#-1139304449%2FProperties%2F863300109) | [jvm]<br>val [valueNodes](index.html#-1139304449%2FProperties%2F863300109): [MutableList](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-mutable-list/index.html)<AbstractPluginData.ValueNode<*>> |

