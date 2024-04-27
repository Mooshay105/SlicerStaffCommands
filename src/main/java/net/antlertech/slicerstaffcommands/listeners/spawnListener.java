package net.antlertech.slicerstaffcommands.listeners;
import net.antlertech.slicerstaffcommands.SlicerStaffCommands;
import org.bukkit.Location;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerRespawnEvent;

public class spawnListener implements Listener {
    private final SlicerStaffCommands plugin;
    public spawnListener(SlicerStaffCommands plugin) {
        this.plugin = plugin;
    }
    @EventHandler
    public void onPlayerDeath(PlayerRespawnEvent e){
        Location location = plugin.getConfig().getLocation("spawn");
        if(location != null){
            e.setRespawnLocation(location);
        }
    }
}