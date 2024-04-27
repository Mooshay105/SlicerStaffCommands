package net.antlertech.slicerstaffcommands.commands;
import net.antlertech.slicerstaffcommands.SlicerStaffCommands;
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
                player.sendMessage("You have been teleported to the spawn point.");
            }else{
                player.sendMessage("There is no spawn point set.");
            }
        }else{
            System.out.println("You Need To Be On The Server To Run This Command!");
        }
        return true;
    }
}