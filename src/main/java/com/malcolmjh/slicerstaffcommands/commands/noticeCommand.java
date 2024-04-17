package com.malcolmjh.slicerstaffcommands.commands;
import com.malcolmjh.slicerstaffcommands.SlicerStaffCommands;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.jetbrains.annotations.NotNull;
public class noticeCommand implements CommandExecutor {
    private final SlicerStaffCommands plugin;
    public noticeCommand(SlicerStaffCommands plugin) {
        this.plugin = plugin;
    }
    @Override
    public boolean onCommand(@NotNull CommandSender sender, @NotNull Command command, @NotNull String s, @NotNull String[] args) {
        StringBuilder builder = new StringBuilder();
        for(int i = 0; i < args.length; i++) {
            builder.append(args[i]);
            builder.append(" ");
        }
        String data = builder.toString();
        data = data.stripTrailing();
        plugin.getConfig().set("default-notice", data);
        plugin.saveConfig();
        return true;
    }
}