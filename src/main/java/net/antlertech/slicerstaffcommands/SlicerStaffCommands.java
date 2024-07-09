package net.antlertech.slicerstaffcommands;

import net.antlertech.slicerstaffcommands.commands.*;
import net.antlertech.slicerstaffcommands.listeners.joinLeaveListener;
import net.antlertech.slicerstaffcommands.listeners.spawnListener;
import org.bukkit.plugin.java.JavaPlugin;

public final class SlicerStaffCommands extends JavaPlugin {
    @Override
    public void onEnable() {
        getConfig().options().copyDefaults();
        saveDefaultConfig();
        getCommand("hologram").setExecutor(new hologramCommand());
        getCommand("invsee").setExecutor(new invseeCommand());
        getCommand("endsee").setExecutor(new endseeCommand());
        getCommand("setspawn").setExecutor(new setSpawnCommand(this));
        getCommand("spawn").setExecutor(new spawnCommand(this));
        getServer().getPluginManager().registerEvents(new spawnListener(this), this);
        getServer().getPluginManager().registerEvents(new joinLeaveListener(this), this);
        getLogger().info("[INFO] : Slicer Staff Commands Has Started!");
    }
}