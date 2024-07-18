package net.antlertech.slicerstaffcommands;

import net.antlertech.slicerstaffcommands.commands.*;
import org.bukkit.plugin.java.JavaPlugin;

public final class SlicerStaffCommands extends JavaPlugin {
    @Override
    public void onEnable() {
        getConfig().options().copyDefaults();
        saveDefaultConfig();
        getCommand("invsee").setExecutor(new invseeCommand());
        getCommand("endsee").setExecutor(new endseeCommand());
        getCommand("setspawn").setExecutor(new setSpawnCommand(this));
        getCommand("spawn").setExecutor(new spawnCommand(this));
        getServer().getPluginManager().registerEvents(new listeners(this), this);
        getLogger().info("[INFO] : Slicer Staff Commands Has Started!");
    }
}