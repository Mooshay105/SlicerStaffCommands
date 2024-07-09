package net.antlertech.slicerstaffcommands;

import org.bukkit.entity.ArmorStand;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Player;

public class makeArmorStand {
    public static void spawn(Player player, String[] args) {
        player.sendMessage("This command is still in BATA-INDEV!");
        StringBuilder builder = new StringBuilder();
        for(int i = 0; i < args.length; i++) {
            builder.append(args[i]);
            builder.append(" ");
        }
        String data = builder.toString();
        data = data.stripTrailing();
        ArmorStand hologram = (ArmorStand) player.getWorld().spawnEntity(player.getLocation(), EntityType.ARMOR_STAND);
        hologram.setVisible(false);
        hologram.setGravity(false);
        hologram.setCustomNameVisible(true);
        hologram.setCustomName("§" + data);
        //Coming Soon!
        //Second line
        //ArmorStand hologram2 = (ArmorStand) player.getWorld().spawnEntity(player.getLocation().add(0, -0.5, 0), EntityType.ARMOR_STAND);
        //hologram2.setVisible(false);
        //hologram2.setGravity(false);
        //hologram2.setCustomNameVisible(true);
        //hologram2.setCustomName(ChatColor.AQUA + "Second line");
    }
}