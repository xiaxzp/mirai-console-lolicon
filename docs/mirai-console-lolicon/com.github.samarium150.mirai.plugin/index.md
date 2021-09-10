---
title: com.github.samarium150.mirai.plugin
---
//[mirai-console-lolicon](../../index.html)/[com.github.samarium150.mirai.plugin](index.html)



# Package com.github.samarium150.mirai.plugin



[jvm]\
插件主包



## Types


| Name | Summary |
|---|---|
| [CommandConfig](-command-config/index.html) | [jvm]<br>object [CommandConfig](-command-config/index.html) : AutoSavePluginConfig<br>Command config <br> 实验性质的自定义命令 |
| [ExecutionConfig](-execution-config/index.html) | [jvm]<br>data class [ExecutionConfig](-execution-config/index.html)(**r18**: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html), **recall**: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html), **cooldown**: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html))<br>The configuration used during get-command <br> 执行get命令时的配置 |
| [ImageData](-image-data/index.html) | [jvm]<br>data class [ImageData](-image-data/index.html)(**pid**: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html), **p**: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html), **uid**: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html), **title**: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), **author**: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), **r18**: [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html), **width**: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html), **height**: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html), **tags**: [List](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)<[String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)>, **ext**: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), **uploadDate**: [Long](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-long/index.html), **urls**: [Map](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-map/index.html)<[String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)>)<br>The image information returned by Lolicon API <br> Lolicon API 返回的图片信息 |
| [Lolicon](-lolicon/index.html) | [jvm]<br>object [Lolicon](-lolicon/index.html) : CompositeCommand<br>Command instance <br> 命令实例 |
| [Main](-main/index.html) | [jvm]<br>object [Main](-main/index.html) : KotlinPlugin<br>Plugin instance <br> 插件实例 |
| [PluginConfig](-plugin-config/index.html) | [jvm]<br>object [PluginConfig](-plugin-config/index.html) : AutoSavePluginConfig<br>Object for auto saving plugin configuration <br> 插件配置 |
| [PluginData](-plugin-data/index.html) | [jvm]<br>object [PluginData](-plugin-data/index.html) : AutoSavePluginData<br>Object for auto saving plugin related data <br> 插件数据 |
| [ProxyConfig](-proxy-config/index.html) | [jvm]<br>object [ProxyConfig](-proxy-config/index.html) : AutoSavePluginConfig<br>Proxy config <br> 自定义代理 |
| [ReplyConfig](-reply-config/index.html) | [jvm]<br>object [ReplyConfig](-reply-config/index.html) : AutoSavePluginConfig<br>Reply config <br> 自定义回复语句 |
| [RequestBody](-request-body/index.html) | [jvm]<br>data class [RequestBody](-request-body/index.html)(**r18**: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html), **num**: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html), **uid**: [List](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)<[Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)>?, **keyword**: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)?, **tag**: [List](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)<[List](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)<[String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)>>?, **size**: [List](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)<[String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)>?, **proxy**: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), **dataAfter**: [Long](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-long/index.html)?, **dataBefore**: [Long](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-long/index.html)?, **dsc**: [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)?)<br>The information for making a GET request <br> 进行GET请求所需的信息 |
| [RequestHandler](-request-handler/index.html) | [jvm]<br>object [RequestHandler](-request-handler/index.html)<br>Object for handling GET request |
| [ResponseBody](-response-body/index.html) | [jvm]<br>data class [ResponseBody](-response-body/index.html)(**error**: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), **data**: [List](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)<[ImageData](-image-data/index.html)>)<br>Response body |
| [Timer](-timer/index.html) | [jvm]<br>object [Timer](-timer/index.html)<br>Object for handling cooldown feature <br> 计时器 |
| [Utils](-utils/index.html) | [jvm]<br>object [Utils](-utils/index.html)<br>Object for utility functions <br> 实用函数 |

