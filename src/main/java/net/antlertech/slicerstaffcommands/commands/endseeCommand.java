package net.antlertech.slicerstaffcommands.commands;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;

public class endseeCommand implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String s, String[] args) {
        if (sender instanceof Player) {
            Player p = (Player) sender;
            StringBuilder builder = new StringBuilder();
            for(int i = 0; i < args.length; i++) {
                builder.append(args[i]);
                builder.append(" ");
            }
            String invTargets = builder.toString();
            invTargets = invTargets.stripTrailing();
            Player invTarget = Bukkit.getServer().getPlayerExact(invTargets);
            if (invTarget == null) {
                sender.sendMessage(ChatColor.RED + "" + ChatColor.BOLD + "HEY!" + ChatColor.GRAY + " That player is not online!");
                return true;
            }
            if (invTarget == p) {
                sender.sendMessage(ChatColor.RED + "" + ChatColor.BOLD + "HEY!" + ChatColor.GRAY + " You can not use /invsee on yourself!");
                return true;
            }
            Inventory targetEnderChest = invTarget.getEnderChest();
            p.openInventory(targetEnderChest);
        } else {
            sender.sendMessage(ChatColor.RED + "" + ChatColor.BOLD + "HEY!" + ChatColor.GRAY + " You must be a player to use this command.");
        }
        return true;
    }
}
