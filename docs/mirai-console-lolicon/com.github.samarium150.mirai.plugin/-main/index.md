---
title: Main
---
//[mirai-console-lolicon](../../../index.html)/[com.github.samarium150.mirai.plugin](../index.html)/[Main](index.html)



# Main



[jvm]\
object [Main](index.html) : KotlinPlugin

Plugin instance <br> 插件实例



## See also


jvm

| | |
|---|---|
| net.mamoe.mirai.console.plugin.jvm.KotlinPlugin |  |



## Functions


| Name | Summary |
|---|---|
| [getResource](index.html#-1821390486%2FFunctions%2F863300109) | [jvm]<br>open fun [getResource](index.html#-1821390486%2FFunctions%2F863300109)(path: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)?<br>open fun [getResource](index.html#-1084259087%2FFunctions%2F863300109)(path: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), charset: [Charset](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/nio/charset/Charset.html)): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)? |
| [getResourceAsStream](index.html#-303108260%2FFunctions%2F863300109) | [jvm]<br>abstract fun [getResourceAsStream](index.html#-303108260%2FFunctions%2F863300109)(path: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)): [InputStream](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/io/InputStream.html)? |
| [internalOnDisable](index.html#-1242407503%2FFunctions%2F863300109) | [jvm]<br>internal fun [internalOnDisable](index.html#-1242407503%2FFunctions%2F863300109)() |
| [internalOnEnable](index.html#1709831230%2FFunctions%2F863300109) | [jvm]<br>internal fun [internalOnEnable](index.html#1709831230%2FFunctions%2F863300109)(): [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html) |
| [internalOnLoad](index.html#-1068813509%2FFunctions%2F863300109) | [jvm]<br>internal fun [internalOnLoad](index.html#-1068813509%2FFunctions%2F863300109)() |
| [onDisable](on-disable.html) | [jvm]<br>open override fun [onDisable](on-disable.html)()<br>Will be invoked when the plugin is disabled <br> 插件禁用时调用 |
| [onEnable](on-enable.html) | [jvm]<br>open override fun [onEnable](on-enable.html)()<br>Will be invoked when the plugin is enabled <br> 插件启用时将被调用 |
| [onLoad](index.html#-1699127998%2FFunctions%2F863300109) | [jvm]<br>open fun PluginComponentStorage.[onLoad](index.html#-1699127998%2FFunctions%2F863300109)() |
| [permissionId](index.html#344286616%2FFunctions%2F863300109) | [jvm]<br>abstract fun [permissionId](index.html#344286616%2FFunctions%2F863300109)(name: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)): PermissionId |
| [refreshCoroutineContext](index.html#2105898379%2FFunctions%2F863300109) | [jvm]<br>private fun [refreshCoroutineContext](index.html#2105898379%2FFunctions%2F863300109)(): [CoroutineContext](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.coroutines/-coroutine-context/index.html) |
| [reload](index.html#1647782733%2FFunctions%2F863300109) | [jvm]<br>fun <[T](index.html#1647782733%2FFunctions%2F863300109) : PluginConfig> [T](index.html#1647782733%2FFunctions%2F863300109).[reload](index.html#1647782733%2FFunctions%2F863300109)()<br>fun <[T](index.html#923457013%2FFunctions%2F863300109) : PluginData> [T](index.html#923457013%2FFunctions%2F863300109).[reload](index.html#923457013%2FFunctions%2F863300109)() |
| [resolveConfigFile](index.html#676551977%2FFunctions%2F863300109) | [jvm]<br>open fun [resolveConfigFile](index.html#676551977%2FFunctions%2F863300109)(relativePath: [Path](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/nio/file/Path.html)): [File](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/io/File.html)<br>open fun [resolveConfigFile](index.html#1609956202%2FFunctions%2F863300109)(relativePath: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)): [File](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/io/File.html) |
| [resolveConfigPath](index.html#287817440%2FFunctions%2F863300109) | [jvm]<br>open fun [resolveConfigPath](index.html#287817440%2FFunctions%2F863300109)(relativePath: [Path](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/nio/file/Path.html)): [Path](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/nio/file/Path.html)<br>open fun [resolveConfigPath](index.html#1490756435%2FFunctions%2F863300109)(relativePath: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)): [Path](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/nio/file/Path.html) |
| [resolveDataFile](index.html#830232193%2FFunctions%2F863300109) | [jvm]<br>open fun [resolveDataFile](index.html#830232193%2FFunctions%2F863300109)(relativePath: [Path](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/nio/file/Path.html)): [File](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/io/File.html)<br>open fun [resolveDataFile](index.html#1983679250%2FFunctions%2F863300109)(relativePath: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)): [File](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/io/File.html) |
| [resolveDataPath](index.html#441497656%2FFunctions%2F863300109) | [jvm]<br>open fun [resolveDataPath](index.html#441497656%2FFunctions%2F863300109)(relativePath: [Path](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/nio/file/Path.html)): [Path](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/nio/file/Path.html)<br>open fun [resolveDataPath](index.html#1864479483%2FFunctions%2F863300109)(relativePath: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)): [Path](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/nio/file/Path.html) |


## Properties


| Name | Summary |
|---|---|
| [_coroutineContext](index.html#-59452862%2FProperties%2F863300109) | [jvm]<br>private var [_coroutineContext](index.html#-59452862%2FProperties%2F863300109): [CoroutineContext](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.coroutines/-coroutine-context/index.html)? |
| [_intrinsicCoroutineContext](index.html#1507192197%2FProperties%2F863300109) | [jvm]<br>internal val [_intrinsicCoroutineContext](index.html#1507192197%2FProperties%2F863300109): [CoroutineContext](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.coroutines/-coroutine-context/index.html) |
| [autoSaveIntervalMillis](index.html#-767942069%2FProperties%2F863300109) | [jvm]<br>open override val [autoSaveIntervalMillis](index.html#-767942069%2FProperties%2F863300109): [LongRange](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.ranges/-long-range/index.html) |
| [client](client.html) | [jvm]<br>lateinit var [client](client.html): HttpClient |
| [configFolder](index.html#1606302386%2FProperties%2F863300109) | [jvm]<br>abstract val [configFolder](index.html#1606302386%2FProperties%2F863300109): [File](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/io/File.html) |
| [configFolderPath](index.html#758138765%2FProperties%2F863300109) | [jvm]<br>abstract val [configFolderPath](index.html#758138765%2FProperties%2F863300109): [Path](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/nio/file/Path.html) |
| [contextUpdateLock](index.html#-718570411%2FProperties%2F863300109) | [jvm]<br>private val [contextUpdateLock](index.html#-718570411%2FProperties%2F863300109): [ReentrantLock](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/concurrent/locks/ReentrantLock.html) |
| [coroutineContext](index.html#-1074983765%2FProperties%2F863300109) | [jvm]<br>abstract val [coroutineContext](index.html#-1074983765%2FProperties%2F863300109): [CoroutineContext](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.coroutines/-coroutine-context/index.html) |
| [coroutineContextInitializer](index.html#-874092147%2FProperties%2F863300109) | [jvm]<br>internal val [coroutineContextInitializer](index.html#-874092147%2FProperties%2F863300109): () -> [CoroutineContext](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.coroutines/-coroutine-context/index.html) |
| [dataFolder](index.html#-1282912630%2FProperties%2F863300109) | [jvm]<br>abstract val [dataFolder](index.html#-1282912630%2FProperties%2F863300109): [File](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/io/File.html) |
| [dataFolderPath](index.html#-1550012571%2FProperties%2F863300109) | [jvm]<br>abstract val [dataFolderPath](index.html#-1550012571%2FProperties%2F863300109): [Path](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/nio/file/Path.html) |
| [dataHolderName](index.html#-2014644415%2FProperties%2F863300109) | [jvm]<br>override val [dataHolderName](index.html#-2014644415%2FProperties%2F863300109): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) |
| [description](index.html#90761052%2FProperties%2F863300109) | [jvm]<br>override val [description](index.html#90761052%2FProperties%2F863300109): JvmPluginDescription |
| [firstRun](index.html#1948689447%2FProperties%2F863300109) | [jvm]<br>private var [firstRun](index.html#1948689447%2FProperties%2F863300109): [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html) |
| [isEnabled](index.html#-1475519551%2FProperties%2F863300109) | [jvm]<br>abstract val [isEnabled](index.html#-1475519551%2FProperties%2F863300109): [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html) |
| [loader](index.html#696165903%2FProperties%2F863300109) | [jvm]<br>open override val [loader](index.html#696165903%2FProperties%2F863300109): JvmPluginLoader |
| [logger](index.html#-204400846%2FProperties%2F863300109) | [jvm]<br>abstract val [logger](index.html#-204400846%2FProperties%2F863300109): MiraiLogger |
| [parentPermission](index.html#1696524425%2FProperties%2F863300109) | [jvm]<br>abstract val [parentPermission](index.html#1696524425%2FProperties%2F863300109): Permission |
| [resourceContainerDelegate](index.html#-1428941600%2FProperties%2F863300109) | [jvm]<br>private val [resourceContainerDelegate](index.html#-1428941600%2FProperties%2F863300109): ResourceContainer |

