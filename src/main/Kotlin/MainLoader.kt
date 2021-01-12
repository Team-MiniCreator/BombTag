package kr.heartpattern.kotlinpluginsample

import org.bukkit.Bukkit
import org.bukkit.command.CommandExecutor
import org.bukkit.entity.Player
import org.bukkit.event.Listener
import org.bukkit.plugin.java.JavaPlugin
import java.util.ArrayList

open class MainLoader: JavaPlugin(), Listener,CommandExecutor {
    private val inGame = ArrayList<Player>()
    private val games = ArrayList<GameManager>()

    private sealed class MainCommand

    override fun onEnable() {
        logger.info("Plugin enabled")


    }

    override fun onDisable(){
        logger.info("Plugin disabled")
    }

    public fun findGame(player:Player):GameManager {
        for (gameManager in games)
        {
            for (gp in gameManager.getGamePlayers())
            {
                if (gp.getPlayer() === player)
                {
                    return gameManager
                }
            }
        }
    }
}


//
//