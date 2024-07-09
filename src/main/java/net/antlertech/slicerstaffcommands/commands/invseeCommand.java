package net.antlertech.slicerstaffcommands.commands;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import net.antlertech.slicerstaffcommands.messages;
import org.jetbrains.annotations.NotNull;

public class invseeCommand implements CommandExecutor {
    @Override
    public boolean onCommand(@NotNull CommandSender sender, @NotNull Command command, @NotNull String s, @NotNull String[] args) {
        if (sender instanceof Player) {
            Player p = (Player) sender;
            StringBuilder builder = new StringBuilder();
            for (String arg : args) {
                builder.append(arg);
                builder.append(" ");
            }
            String invTargets = builder.toString();
            invTargets = invTargets.stripTrailing();
            Player invTarget = Bukkit.getServer().getPlayerExact(invTargets);
            if (invTarget == null) {
                sender.sendMessage(messages.getPlayerNotOnlineMessage());
                return true;
            }
            if (invTarget == p) {
                sender.sendMessage(messages.getCanNotInvseeSlefMessage());
                return true;
            }
            Inventory targetInventory = invTarget.getInventory();
            p.openInventory(targetInventory);
        } else {
            sender.sendMessage(messages.getConsoleMessage());
        }
        return true;
    }
}
