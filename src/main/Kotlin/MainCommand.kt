package kr.heartpattern.kotlinpluginsample

import org.bukkit.command.CommandExecutor
import org.bukkit.event.EventHandler
import org.bukkit.event.Listener
import org.bukkit.event.player.PlayerJoinEvent
import org.bukkit.plugin.java.JavaPlugin
import org.bukkit.Bukkit
import org.bukkit.Bukkit.getOnlinePlayers
import org.bukkit.Material
import org.bukkit.World
import org.bukkit.command.Command
import org.bukkit.command.CommandSender
import org.bukkit.entity.Player

class MainCommand:MainLoader(), Listener, CommandExecutor {
    @EventHandler
    public fun joinEvent(event: PlayerJoinEvent) {
        var players = getOnlinePlayers()
        var i = 0;
        for(p in players) {
            i++;
        }
        Bukkit.broadcastMessage("Online Players: "+ i);
    }
}