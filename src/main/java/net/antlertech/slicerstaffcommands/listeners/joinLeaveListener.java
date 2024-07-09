package net.antlertech.slicerstaffcommands.listeners;

import net.antlertech.slicerstaffcommands.SlicerStaffCommands;
import org.bukkit.Location;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerQuitEvent;

public class joinLeaveListener implements Listener {
    private final SlicerStaffCommands plugin;
    public joinLeaveListener(SlicerStaffCommands plugin) {
        this.plugin = plugin;
    }
    @EventHandler
    public void onJoin(PlayerJoinEvent e) {
        Player p = e.getPlayer();
        String message = plugin.getConfig().getString("Join-Message");
        e.setJoinMessage(message.replace("[Player]", p.getDisplayName()));
        if(!e.getPlayer().hasPlayedBefore()){
            Location location = plugin.getConfig().getLocation("spawn");
            if(location != null){
                e.getPlayer().teleport(location);
            }
        }
    }
    @EventHandler
    public void onLeave(PlayerQuitEvent e) {
        Player p = e.getPlayer();
        String message = plugin.getConfig().getString("Quit-Message");
        e.setQuitMessage(message.replace("[Player]", p.getDisplayName()));
    }
}