package net.antlertech.slicerstaffcommands.commands;

import net.antlertech.slicerstaffcommands.messages;
import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.jetbrains.annotations.NotNull;

public class endseeCommand implements CommandExecutor {
    @Override
    public boolean onCommand(@NotNull CommandSender sender, @NotNull Command command, @NotNull String s, @NotNull String[] args) {
        if (sender instanceof Player) {
            Player p = (Player) sender;
            if (p.hasPermission("slicer.staff.endsee")) {
                StringBuilder builder = new StringBuilder();
                for (String arg : args) {
                    builder.append(arg);
                    builder.append(" ");
                }
                Player endTarget = Bukkit.getServer().getPlayerExact(builder.toString().stripTrailing());
                if (endTarget == null) {
                    sender.sendMessage(messages.getPlayerNotOnlineMessage());
                    return true;
                }
                if (endTarget == p) {
                    sender.sendMessage(messages.getCanNotEndseeSlefMessage());
                    return true;
                }
                p.openInventory(endTarget.getEnderChest());
            } else {
                sender.sendMessage(messages.getNoPermissionMessage());
            }
        } else {
            sender.sendMessage(messages.getConsoleMessage());
        }
        return true;
    }
}
