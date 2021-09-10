---
title: convertValue
---
//[mirai-console-lolicon](../../../index.html)/[com.github.samarium150.mirai.plugin](../index.html)/[Utils](index.html)/[convertValue](convert-value.html)



# convertValue



[jvm]\
fun [convertValue](convert-value.html)(value: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), type: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)): [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)



Convert [value](convert-value.html) into a valid number for setting the corresponding property <br> 将字符串转为整数值



#### Return



integer value <br> 转换后的值



## See also


jvm

| | |
|---|---|
| [com.github.samarium150.mirai.plugin.Lolicon](../-lolicon/set.html) |  |



## Parameters


jvm

| | |
|---|---|
| value | input string value <br> 输入的字符串 |
| type | input property <br> 需要转化的类别 |



#### Throws


| | |
|---|---|
| [kotlin.NumberFormatException](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-number-format-exception/index.html) | if [value](convert-value.html) is invalid <br> 数值非法时抛出 |



