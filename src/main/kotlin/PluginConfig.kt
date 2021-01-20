/**
 * Copyright (c) 2020-2021 Samarium
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Affero General Public License as published
 * by the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Affero General Public License for more details.
 *
 * You should have received a copy of the GNU Affero General Public License
 * along with this program.  If not, see <https://www.gnu.org/licenses/>
 */
package com.github.samarium150.mirai.plugin

import net.mamoe.mirai.console.data.AutoSavePluginConfig
import net.mamoe.mirai.console.data.ValueDescription
import net.mamoe.mirai.console.data.value

/**
 * Object for auto saving plugin configuration
 */
object PluginConfig : AutoSavePluginConfig("Config") {

    /**
     * Bot owner's id
     */
    @ValueDescription("Bot所有者账号")
    val master: Long by value()

    /**
     * Whether the plugin should be enabled
     */
    @ValueDescription("是否启用插件")
    var enabled: Boolean by value(true)

    /**
     * Default apikey
     */
    @ValueDescription("默认的apikey")
    var apikey: String by value("")

    /**
     * Default recall time
     */
    @ValueDescription("默认的撤回时间(单位: s)")
    var recall: Int by value(30)

    /**
     * Default cooldown time
     */
    @ValueDescription("默认的冷却时间(单位: s)")
    var cooldown: Int by value(60)
}