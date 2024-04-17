package com.malcolmjh.slicerstaffcommands.commands;
import com.malcolmjh.slicerstaffcommands.SlicerStaffCommands;
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
            player.sendMessage("Spawn location set!");
        }else{
            System.out.println("You Need To Be On The Server To Run This Command!");
        }
        return true;
    }
}