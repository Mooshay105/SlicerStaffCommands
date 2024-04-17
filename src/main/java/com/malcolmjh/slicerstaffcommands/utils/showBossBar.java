package com.malcolmjh.slicerstaffcommands.utils;
import net.kyori.adventure.audience.Audience;
import net.kyori.adventure.text.Component;
import org.checkerframework.checker.nullness.qual.NonNull;
import org.jetbrains.annotations.NotNull;

public class showBossBar {
    public showBossBar(@NonNull String text, @NonNull int progress, @NotNull net.kyori.adventure.bossbar.BossBar.Color color, @NotNull net.kyori.adventure.bossbar.BossBar.Overlay overlay, @NonNull Audience target) {
        final Component name = Component.text(text);
        final net.kyori.adventure.bossbar.BossBar bar = net.kyori.adventure.bossbar.BossBar.bossBar(name, progress, color, overlay);
        target.showBossBar(bar);
    }
}