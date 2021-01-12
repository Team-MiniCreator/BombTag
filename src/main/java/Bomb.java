import net.md_5.bungee.api.ChatColor;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.World;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.ArrayList;
import java.util.List;

public class Bomb extends JavaPlugin{
    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
        if(label.equalsIgnoreCase("bomb")){
            if(!(sender instanceof Player)){
                sender.sendMessage("이 커맨드는 콘솔에서는 사용할 수가 없습니다.");
            }
            Player player = (Player) sender;
            if(player.getInventory().firstEmpty() == -1){
                Location loc = player.getLocation();
                World world = player.getWorld();
               ((World) world).dropItemNaturally(loc, getBomb());
                player.sendMessage("폭탄이 인벤토리가 꽉 찼으므로 근처에 떨어뜨려졌습니다.");
            }

            player.getInventory().addItem(getBomb());
            player.sendMessage("폭탄이 인벤토리에 생겼습니다.");
            return true;
        }
        return false;
    }

    public ItemStack getBomb(){
        ItemStack bomb = new ItemStack(Material.TNT);
        ItemMeta meta = bomb.getItemMeta();

        assert meta != null;
        meta.setDisplayName(ChatColor.RED + "" + ChatColor.BOLD + "폭탄");
        List<String> lore = new ArrayList<>();
        lore.add("");
        lore.add(ChatColor.YELLOW + "" + ChatColor.ITALIC + "이 아이템으로 상대방을 쳐서 폭탄을 넘기세요");
        meta.setLore(lore);

        meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
        meta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
        meta.setUnbreakable(true);

        bomb.setItemMeta(meta);

        return bomb;
    }
}