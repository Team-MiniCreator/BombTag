package kr.heartpattern.kotlinpluginsample

import org.bukkit.plugin.java.JavaPlugin

class SamplePlugin: JavaPlugin(){
    override fun onEnable() {
        logger.info("Plugin enabled")
    }

    override fun onDisable(){
        logger.info("Plugin disabled")
    }
}