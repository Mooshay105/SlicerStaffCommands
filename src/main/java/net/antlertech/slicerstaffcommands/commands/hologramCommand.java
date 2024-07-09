package net.antlertech.slicerstaffcommands.commands;

import net.antlertech.slicerstaffcommands.makeArmorStand;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import net.antlertech.slicerstaffcommands.messages;
import org.jetbrains.annotations.NotNull;

public class hologramCommand implements CommandExecutor {
    @Override
    public boolean onCommand(@NotNull CommandSender sender, @NotNull Command command, @NotNull String label, @NotNull String[] args) {
        if (sender instanceof Player) {
            Player player = (Player) sender;
            makeArmorStand.spawn(player, args);
        } else {
            System.out.println(messages.getConsoleMessage());
        }
        return true;
    }
}