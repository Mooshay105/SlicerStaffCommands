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
            if (p.hasPermission("slicer.staff.invsee")) {
                StringBuilder builder = new StringBuilder();
                for (String arg : args) {
                    builder.append(arg);
                    builder.append(" ");
                }
                Player invTarget = Bukkit.getServer().getPlayerExact(builder.toString().stripTrailing());
                if (invTarget == null) {
                    sender.sendMessage(messages.getPlayerNotOnlineMessage());
                    return true;
                }
                if (invTarget == p) {
                    sender.sendMessage(messages.getCanNotInvseeSlefMessage());
                    return true;
                }
                p.openInventory(invTarget.getInventory());
            } else {
                sender.sendMessage(messages.getNoPermissionMessage());
            }
        } else {
            sender.sendMessage(messages.getConsoleMessage());
        }
        return true;
    }
}
