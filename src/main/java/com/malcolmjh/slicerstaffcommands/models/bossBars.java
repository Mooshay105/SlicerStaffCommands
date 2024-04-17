package com.malcolmjh.slicerstaffcommands.models;

import net.kyori.adventure.bossbar.BossBar;
import org.checkerframework.checker.nullness.qual.Nullable;

public class bossBars {
    private static @Nullable BossBar localActiveBar;

    public static BossBar getActiveBar() {
        return localActiveBar;
    }

    public static void setActiveBar(BossBar activeBar) {
        localActiveBar = activeBar;
    }
}
