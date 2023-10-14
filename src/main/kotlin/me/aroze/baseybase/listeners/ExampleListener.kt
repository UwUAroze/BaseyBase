package me.aroze.baseybase.listeners

import io.papermc.paper.event.player.AsyncChatEvent
import org.bukkit.Bukkit
import org.bukkit.event.EventHandler
import org.bukkit.event.Listener
import org.bukkit.event.player.PlayerJoinEvent

object ExampleListener : Listener {

    @EventHandler
    fun onJoin(event: PlayerJoinEvent) {
        Bukkit.broadcastMessage("no way is that baseybase?!")
    }

}