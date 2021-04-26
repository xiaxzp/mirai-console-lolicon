---
title: Timer -
---
//[mirai-console-lolicon](../../../index.md)/[com.github.samarium150.mirai.plugin](../index.md)/[Timer](index.md)



# Timer  
 [jvm] object [Timer](index.md)

Object for handling cooldown feature <br> 计时器

   


## Functions  
  
|  Name |  Summary | 
|---|---|
| <a name="com.github.samarium150.mirai.plugin/Timer/cooldown/#net.mamoe.mirai.contact.Contact?#kotlin.Int/PointingToDeclaration/"></a>[cooldown](cooldown.md)| <a name="com.github.samarium150.mirai.plugin/Timer/cooldown/#net.mamoe.mirai.contact.Contact?#kotlin.Int/PointingToDeclaration/"></a>[jvm]  <br>Content  <br>suspend fun [cooldown](cooldown.md)(@Nullable()subject: Contact?, cooldown: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html))  <br>More info  <br>Asynchronously cooldown <br> 异步冷却  <br><br><br>|
| <a name="com.github.samarium150.mirai.plugin/Timer/getCooldown/#net.mamoe.mirai.contact.Contact?/PointingToDeclaration/"></a>[getCooldown](get-cooldown.md)| <a name="com.github.samarium150.mirai.plugin/Timer/getCooldown/#net.mamoe.mirai.contact.Contact?/PointingToDeclaration/"></a>[jvm]  <br>Content  <br>fun [getCooldown](get-cooldown.md)(@Nullable()subject: Contact?): [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)  <br>More info  <br>Get [subject](get-cooldown.md)'s cooldown status <br> 获取联系对象的冷却状态  <br><br><br>|
| <a name="com.github.samarium150.mirai.plugin/Timer/groupCooldownAsync/#kotlin.Long#kotlin.Int/PointingToDeclaration/"></a>[groupCooldownAsync](group-cooldown-async.md)| <a name="com.github.samarium150.mirai.plugin/Timer/groupCooldownAsync/#kotlin.Long#kotlin.Int/PointingToDeclaration/"></a>[jvm]  <br>Content  <br>private suspend fun [groupCooldownAsync](group-cooldown-async.md)(key: [Long](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-long/index.html), cooldown: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)): Deferred<[Unit](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)>  <br>More info  <br>Asynchronously cooldown for groups <br> 异步冷却群组  <br><br><br>|
| <a name="com.github.samarium150.mirai.plugin/Timer/setCooldown/#net.mamoe.mirai.contact.Contact?/PointingToDeclaration/"></a>[setCooldown](set-cooldown.md)| <a name="com.github.samarium150.mirai.plugin/Timer/setCooldown/#net.mamoe.mirai.contact.Contact?/PointingToDeclaration/"></a>[jvm]  <br>Content  <br>fun [setCooldown](set-cooldown.md)(@Nullable()subject: Contact?)  <br>More info  <br>Set [subject](set-cooldown.md)'s cooldown status <br> 设置联系对象的冷却状态  <br><br><br>|
| <a name="com.github.samarium150.mirai.plugin/Timer/userCooldownAsync/#kotlin.Long#kotlin.Int/PointingToDeclaration/"></a>[userCooldownAsync](user-cooldown-async.md)| <a name="com.github.samarium150.mirai.plugin/Timer/userCooldownAsync/#kotlin.Long#kotlin.Int/PointingToDeclaration/"></a>[jvm]  <br>Content  <br>private suspend fun [userCooldownAsync](user-cooldown-async.md)(key: [Long](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-long/index.html), cooldown: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)): Deferred<[Unit](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)>  <br>More info  <br>Asynchronously cooldown for users <br> 异步冷却用户  <br><br><br>|


## Properties  
  
|  Name |  Summary | 
|---|---|
| <a name="com.github.samarium150.mirai.plugin/Timer/getGroupCooldown/#/PointingToDeclaration/"></a>[getGroupCooldown](get-group-cooldown.md)| <a name="com.github.samarium150.mirai.plugin/Timer/getGroupCooldown/#/PointingToDeclaration/"></a> [jvm] private val [getGroupCooldown](get-group-cooldown.md): ([Long](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-long/index.html)) -> [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)The lambda function for getting group's cooldown status <br> 获取群组冷却状态的lambda函数   <br>|
| <a name="com.github.samarium150.mirai.plugin/Timer/getUserCooldown/#/PointingToDeclaration/"></a>[getUserCooldown](get-user-cooldown.md)| <a name="com.github.samarium150.mirai.plugin/Timer/getUserCooldown/#/PointingToDeclaration/"></a> [jvm] private val [getUserCooldown](get-user-cooldown.md): ([Long](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-long/index.html)) -> [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)The lambda function for getting user's cooldown status <br> 获取用户冷却状态的lambda函数   <br>|
| <a name="com.github.samarium150.mirai.plugin/Timer/groupCooldown/#/PointingToDeclaration/"></a>[groupCooldown](group-cooldown.md)| <a name="com.github.samarium150.mirai.plugin/Timer/groupCooldown/#/PointingToDeclaration/"></a> [jvm] private val [groupCooldown](group-cooldown.md): [MutableMap](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-mutable-map/index.html)<[Long](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-long/index.html), [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)>Cooldown map for groups <br> 群组及其冷却状态   <br>|
| <a name="com.github.samarium150.mirai.plugin/Timer/setGroupCooldown/#/PointingToDeclaration/"></a>[setGroupCooldown](set-group-cooldown.md)| <a name="com.github.samarium150.mirai.plugin/Timer/setGroupCooldown/#/PointingToDeclaration/"></a> [jvm] private val [setGroupCooldown](set-group-cooldown.md): ([Long](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-long/index.html), [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)) -> [Unit](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)The lambda function for setting group's cooldown status <br> 设置群组冷却状态的lambda函数   <br>|
| <a name="com.github.samarium150.mirai.plugin/Timer/setUserCooldown/#/PointingToDeclaration/"></a>[setUserCooldown](set-user-cooldown.md)| <a name="com.github.samarium150.mirai.plugin/Timer/setUserCooldown/#/PointingToDeclaration/"></a> [jvm] private val [setUserCooldown](set-user-cooldown.md): ([Long](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-long/index.html), [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)) -> [Unit](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)The lambda function for setting user's cooldown status <br> 设置用户冷却状态的lambda函数   <br>|
| <a name="com.github.samarium150.mirai.plugin/Timer/userCooldown/#/PointingToDeclaration/"></a>[userCooldown](user-cooldown.md)| <a name="com.github.samarium150.mirai.plugin/Timer/userCooldown/#/PointingToDeclaration/"></a> [jvm] private val [userCooldown](user-cooldown.md): [MutableMap](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-mutable-map/index.html)<[Long](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-long/index.html), [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)>Cooldown map for users <br> 用户及其冷却状态   <br>|

