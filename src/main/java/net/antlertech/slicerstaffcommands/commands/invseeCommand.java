package net.antlertech.slicerstaffcommands.commands;
import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
public class invseeCommand implements CommandExecutor {
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
            Player invTarget = Bukkit.getServer().getPlayer(invTargets);
            Inventory targetInventory = invTarget.getInventory();
            p.openInventory(targetInventory);
        } else {
            return false;
        }
        return true;
    }
}
