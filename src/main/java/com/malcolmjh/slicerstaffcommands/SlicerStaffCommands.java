package com.malcolmjh.slicerstaffcommands;
import com.malcolmjh.slicerstaffcommands.commands.hologramCommand;
import com.malcolmjh.slicerstaffcommands.commands.invseeCommand;
import com.malcolmjh.slicerstaffcommands.commands.noticeCommand;
import com.malcolmjh.slicerstaffcommands.commands.spawnCommand;
import com.malcolmjh.slicerstaffcommands.commands.setSpawnCommand;
import com.malcolmjh.slicerstaffcommands.listeners.joinLeaveListener;
import com.malcolmjh.slicerstaffcommands.listeners.spawnListener;
import org.bukkit.plugin.java.JavaPlugin;

public final class SlicerStaffCommands extends JavaPlugin {
    @Override
    public void onEnable() {
        getConfig().options().copyDefaults();
        saveDefaultConfig();
        getCommand("hologram").setExecutor(new hologramCommand());
        getCommand("invsee").setExecutor(new invseeCommand());
        getCommand("notice").setExecutor(new noticeCommand(this));
        getCommand("setspawn").setExecutor(new setSpawnCommand(this));
        getCommand("spawn").setExecutor(new spawnCommand(this));
        getServer().getPluginManager().registerEvents(new spawnListener(this), this);
        getServer().getPluginManager().registerEvents(new joinLeaveListener(this), this);
        getLogger().info("[INFO] : Slicer Staff Commands Has Started!");
    }
}