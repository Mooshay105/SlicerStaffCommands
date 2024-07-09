package net.antlertech.slicerstaffcommands.commands;

import net.antlertech.slicerstaffcommands.SlicerStaffCommands;
import org.bukkit.Location;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import net.antlertech.slicerstaffcommands.messages;
import org.jetbrains.annotations.NotNull;

public class spawnCommand implements CommandExecutor {
    private final SlicerStaffCommands plugin;
    public spawnCommand(SlicerStaffCommands plugin) {
        this.plugin = plugin;
    }
    @Override
    public boolean onCommand(@NotNull CommandSender sender, @NotNull Command command, @NotNull String label, @NotNull String[] args) {
        if (sender instanceof Player){
            Player player = (Player) sender;
            Location location = plugin.getConfig().getLocation("spawn");
            if (location != null){
                player.teleport(location);
                player.sendMessage(messages.getPlayerTeleportedToSpawnMessage());
            }else{
                player.sendMessage(messages.getNoSpawnPointSetMessage());
            }
        }else{
            sender.sendMessage(messages.getConsoleMessage());
        }
        return true;
    }
}