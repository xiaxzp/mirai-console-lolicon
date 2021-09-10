---
title: getProxyType
---
//[mirai-console-lolicon](../../../index.html)/[com.github.samarium150.mirai.plugin](../index.html)/[Utils](index.html)/[getProxyType](get-proxy-type.html)



# getProxyType



[jvm]\
fun [getProxyType](get-proxy-type.html)(value: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)): [Proxy.Type](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/net/Proxy.Type.html)



Get proxy type from the given string <br> 根据输入值返回代理类型



#### Return



[Proxy.Type](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/net/Proxy.Type.html)<br> 代理的类型



## See also


jvm

| | |
|---|---|
| [java.net.Proxy](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/net/Proxy.html) |  |



## Parameters


jvm

| | |
|---|---|
| value | input string value <br> 输入的字符串 |



#### Throws


| | |
|---|---|
| [kotlin.IllegalArgumentException](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-illegal-argument-exception/index.html) | if [value](get-proxy-type.html) is not [Proxy.Type](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/net/Proxy.Type.html)<br> 数值非法时抛出 |



