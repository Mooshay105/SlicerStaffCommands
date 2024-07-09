package net.antlertech.slicerstaffcommands;

import org.bukkit.entity.ArmorStand;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Player;

public class makeArmorStand {
    public static void spawn(Player player, String[] args) {
        player.sendMessage("This command is still in BATA-INDEV!");
        StringBuilder builder = new StringBuilder();
        for (String arg : args) {
            builder.append(arg);
            builder.append(" ");
        }
        String data = builder.toString();
        data = data.stripTrailing();
        ArmorStand hologram = (ArmorStand) player.getWorld().spawnEntity(player.getLocation(), EntityType.ARMOR_STAND);
        hologram.setVisible(false);
        hologram.setGravity(false);
        hologram.setCustomNameVisible(true);
        hologram.setCustomName("§" + data);
    }
}