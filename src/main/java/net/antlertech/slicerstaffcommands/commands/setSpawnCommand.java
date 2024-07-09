package net.antlertech.slicerstaffcommands.commands;

import net.antlertech.slicerstaffcommands.SlicerStaffCommands;
import org.bukkit.ChatColor;
import org.bukkit.Location;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class setSpawnCommand implements CommandExecutor {
    private final SlicerStaffCommands plugin;
    public setSpawnCommand(SlicerStaffCommands plugin){
        this.plugin = plugin;
    }
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (sender instanceof Player){
            Player player = (Player) sender;
            Location location = player.getLocation();
            plugin.getConfig().set("spawn", location);
            plugin.saveConfig();
            player.sendMessage(ChatColor.GREEN + "" + ChatColor.BOLD + "YAY!" + ChatColor.GRAY + " You have set the spawn point!");
        }else{
            sender.sendMessage(ChatColor.RED + "" + ChatColor.BOLD + "HEY!" + ChatColor.GRAY + " You must be a player to use this command!");
        }
        return true;
    }
}