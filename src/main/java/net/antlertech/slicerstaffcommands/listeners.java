package net.antlertech.slicerstaffcommands;

import org.bukkit.Location;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerQuitEvent;
import org.bukkit.event.player.PlayerRespawnEvent;

public class listeners implements Listener {
    private final SlicerStaffCommands plugin;
    public listeners(SlicerStaffCommands plugin) {
        this.plugin = plugin;
    }
    @EventHandler
    public void onJoin(PlayerJoinEvent e) {
        Player p = e.getPlayer();
        String message = plugin.getConfig().getString("Join-Message").replace("[Player]", p.getDisplayName());
        e.setJoinMessage(message);
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
        String message = plugin.getConfig().getString("Quit-Message").replace("[Player]", p.getDisplayName());
        e.setQuitMessage(message);
    }
    @EventHandler
    public void onPlayerDeath(PlayerRespawnEvent e){
        Location location = plugin.getConfig().getLocation("spawn");
        if(location != null){
            e.setRespawnLocation(location);
        }
    }
}