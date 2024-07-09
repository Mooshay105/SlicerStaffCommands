package net.antlertech.slicerstaffcommands.commands;

import net.antlertech.slicerstaffcommands.SlicerStaffCommands;
import org.bukkit.ChatColor;
import org.bukkit.Location;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class spawnCommand implements CommandExecutor {
    private final SlicerStaffCommands plugin;
    public spawnCommand(SlicerStaffCommands plugin) {
        this.plugin = plugin;
    }
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (sender instanceof Player){
            Player player = (Player) sender;
            Location location = plugin.getConfig().getLocation("spawn");
            if (location != null){
                player.teleport(location);
                player.sendMessage(ChatColor.GREEN + "" + ChatColor.BOLD + "HEY!" + ChatColor.GRAY + " You have been teleported to the spawn point!");
            }else{
                player.sendMessage(ChatColor.RED + "" + ChatColor.BOLD + "HEY!" + ChatColor.GRAY + " There is no spawn point set!");
            }
        }else{
            sender.sendMessage(ChatColor.RED + "" + ChatColor.BOLD + "HEY!" + ChatColor.GRAY + " You must be a player to use this command!");
        }
        return true;
    }
}