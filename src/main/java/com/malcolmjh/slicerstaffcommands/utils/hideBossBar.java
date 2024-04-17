package com.malcolmjh.slicerstaffcommands.utils;

import net.kyori.adventure.audience.Audience;
import org.checkerframework.checker.nullness.qual.NonNull;
import com.malcolmjh.slicerstaffcommands.models.bossBars;

public class hideBossBar {
    public hideBossBar(final @NonNull Audience target) {
        target.hideBossBar(bossBars.getActiveBar());
    }
}
