package net.antlertech.slicerstaffcommands;

import org.bukkit.ChatColor;

public class messages {
    private static final String consoleMessage = ChatColor.RED + "" + ChatColor.BOLD + "HEY!" + ChatColor.GRAY + " You must be a player to use this command!";
    private static final String noSpawnPointSetMessage = ChatColor.RED + "" + ChatColor.BOLD + "HEY!" + ChatColor.GRAY + " There is no spawn point set!";
    private static final String hologramMessage = ChatColor.GREEN + "" + ChatColor.BOLD + "YAY!" + ChatColor.GRAY + " You have made a hologram!";
    private static final String playerTeleportedToSpawnMessage = ChatColor.GREEN + "" + ChatColor.BOLD + "YAY!" + ChatColor.GRAY + " You have been teleported to the spawn point!";
    private static final String playerSetTheSpawnMessage = ChatColor.GREEN + "" + ChatColor.BOLD + "YAY!" + ChatColor.GRAY + " You have set the spawn point!";
    private static final String canNotInvseeSlefMessage = ChatColor.RED + "" + ChatColor.BOLD + "HEY!" + ChatColor.GRAY + " You can not use /invsee on yourself!";
    private static final String canNotEndseeSlefMessage = ChatColor.RED + "" + ChatColor.BOLD + "HEY!" + ChatColor.GRAY + " You can not use /endsee on yourself!";
    private static final String playerNotOnlineMessage = ChatColor.RED + "" + ChatColor.BOLD + "HEY!" + ChatColor.GRAY + " That player is not online!";
    private static final String noPermissionMessage = ChatColor.RED + "" + ChatColor.BOLD + "HEY!" + ChatColor.GRAY + " You do not have permission to use this command!";

    public static String getConsoleMessage() {
        return consoleMessage;
    }
    public static String getNoSpawnPointSetMessage() {
        return noSpawnPointSetMessage;
    }
    public static String getPlayerTeleportedToSpawnMessage () {
        return playerTeleportedToSpawnMessage;
    }
    public static String getPlayerSetTheSpawnMessage() {
        return playerSetTheSpawnMessage;
    }
    public static String getCanNotInvseeSlefMessage() {
        return canNotInvseeSlefMessage;
    }
    public static String getCanNotEndseeSlefMessage() {
        return canNotEndseeSlefMessage;
    }
    public static String getPlayerNotOnlineMessage() {
        return playerNotOnlineMessage;
    }
    public static String getHologramMessage() {
        return hologramMessage;
    }
    public static String getNoPermissionMessage() {
        return noPermissionMessage;
    }
}