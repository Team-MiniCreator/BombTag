package kr.heartpattern.kotlinpluginsample

import java.util.ArrayList;
import java.util.List;
import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.World;
import org.bukkit.configuration.ConfigurationSection;
import

class Game {
    private val gm:GameManager
    private val mapName:String
    private val mapCreator:String
    private val spawns = ArrayList<Location>()
    private val mapCenter:Location
    private val specSpawn:Location
    private val lobbyLocation:Location
    private val currentSpawn:Int = 0
}