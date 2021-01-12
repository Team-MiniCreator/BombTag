package kr.heartpattern.kotlinpluginsample

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.Sound;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

open class GameManager {
    /*variables*/
    private val gameName:String
    private val forceStop = false
    private val forceStart = false
    private val starting = false
    private val canTalk = true
    private val canMove = true
    private val gamePlayers = ArrayList<GamePlayer>()
    private val winners = ArrayList<GamePlayer>()
    private val gameState = GameState.Limbow
    private val potatoPlayer:Player
    private val description:String
    private val game:Game
}