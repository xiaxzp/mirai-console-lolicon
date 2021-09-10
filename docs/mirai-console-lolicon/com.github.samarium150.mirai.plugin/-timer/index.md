---
title: Timer
---
//[mirai-console-lolicon](../../../index.html)/[com.github.samarium150.mirai.plugin](../index.html)/[Timer](index.html)



# Timer



[jvm]\
object [Timer](index.html)

Object for handling cooldown feature <br> 计时器



## Functions


| Name | Summary |
|---|---|
| [cooldown](cooldown.html) | [jvm]<br>suspend fun [cooldown](cooldown.html)(@Nullable()subject: Contact?, cooldown: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html))<br>Asynchronously cooldown <br> 异步冷却 |
| [getCooldown](get-cooldown.html) | [jvm]<br>fun [getCooldown](get-cooldown.html)(@Nullable()subject: Contact?): [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)<br>Get [subject](get-cooldown.html)'s cooldown status <br> 获取联系对象的冷却状态 |
| [groupCooldownAsync](group-cooldown-async.html) | [jvm]<br>private suspend fun [groupCooldownAsync](group-cooldown-async.html)(key: [Long](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-long/index.html), cooldown: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)): Deferred<[Unit](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)><br>Asynchronously cooldown for groups <br> 异步冷却群组 |
| [setCooldown](set-cooldown.html) | [jvm]<br>fun [setCooldown](set-cooldown.html)(@Nullable()subject: Contact?)<br>Set [subject](set-cooldown.html)'s cooldown status <br> 设置联系对象的冷却状态 |
| [userCooldownAsync](user-cooldown-async.html) | [jvm]<br>private suspend fun [userCooldownAsync](user-cooldown-async.html)(key: [Long](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-long/index.html), cooldown: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)): Deferred<[Unit](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)><br>Asynchronously cooldown for users <br> 异步冷却用户 |


## Properties


| Name | Summary |
|---|---|
| [getGroupCooldown](get-group-cooldown.html) | [jvm]<br>private val [getGroupCooldown](get-group-cooldown.html): ([Long](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-long/index.html)) -> [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)<br>The lambda function for getting group's cooldown status <br> 获取群组冷却状态的lambda函数 |
| [getUserCooldown](get-user-cooldown.html) | [jvm]<br>private val [getUserCooldown](get-user-cooldown.html): ([Long](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-long/index.html)) -> [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)<br>The lambda function for getting user's cooldown status <br> 获取用户冷却状态的lambda函数 |
| [groupCooldown](group-cooldown.html) | [jvm]<br>private val [groupCooldown](group-cooldown.html): [MutableMap](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-mutable-map/index.html)<[Long](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-long/index.html), [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)><br>Cooldown map for groups <br> 群组及其冷却状态 |
| [setGroupCooldown](set-group-cooldown.html) | [jvm]<br>private val [setGroupCooldown](set-group-cooldown.html): ([Long](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-long/index.html), [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)) -> [Unit](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>The lambda function for setting group's cooldown status <br> 设置群组冷却状态的lambda函数 |
| [setUserCooldown](set-user-cooldown.html) | [jvm]<br>private val [setUserCooldown](set-user-cooldown.html): ([Long](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-long/index.html), [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)) -> [Unit](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>The lambda function for setting user's cooldown status <br> 设置用户冷却状态的lambda函数 |
| [userCooldown](user-cooldown.html) | [jvm]<br>private val [userCooldown](user-cooldown.html): [MutableMap](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-mutable-map/index.html)<[Long](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-long/index.html), [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)><br>Cooldown map for users <br> 用户及其冷却状态 |

