package net.antlertech.slicerstaffcommands.commands;

import net.antlertech.slicerstaffcommands.utils.makeArmorStand;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class hologramCommand implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (sender instanceof Player) {
            Player player = (Player) sender;
            makeArmorStand.spawn(player, args);
        } else {
            System.out.println("You Must Be in-game to use /hologram");
        }
        return true;
    }
}