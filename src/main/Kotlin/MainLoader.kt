package kr.heartpattern.kotlinpluginsample

import org.bukkit.command.CommandExecutor
import org.bukkit.event.Listener
import org.bukkit.plugin.java.JavaPlugin

open class MainLoader: JavaPlugin(), Listener,CommandExecutor {
    private sealed class MainCommand

    override fun onEnable() {
        logger.info("Plugin enabled")
    }

    override fun onDisable(){
        logger.info("Plugin disabled")
    }
}
