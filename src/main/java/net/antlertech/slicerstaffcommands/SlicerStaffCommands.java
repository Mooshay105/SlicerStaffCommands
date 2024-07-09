package net.antlertech.slicerstaffcommands;

import net.antlertech.slicerstaffcommands.commands.*;
import org.bukkit.plugin.java.JavaPlugin;

public final class SlicerStaffCommands extends JavaPlugin {
    @Override
    public void onEnable() {
        // Load Config
        getConfig().options().copyDefaults();
        saveDefaultConfig();
        // Register Commands
        getCommand("hologram").setExecutor(new hologramCommand());
        getCommand("invsee").setExecutor(new invseeCommand());
        getCommand("endsee").setExecutor(new endseeCommand());
        getCommand("setspawn").setExecutor(new setSpawnCommand(this));
        getCommand("spawn").setExecutor(new spawnCommand(this));
        // Register The Listener
        getServer().getPluginManager().registerEvents(new listeners(this), this);
        getLogger().info("[INFO] : Slicer Staff Commands Has Started!");
    }
}