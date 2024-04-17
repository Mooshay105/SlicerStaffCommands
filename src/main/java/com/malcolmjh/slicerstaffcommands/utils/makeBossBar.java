package com.malcolmjh.slicerstaffcommands.utils;
import net.kyori.adventure.audience.Audience;
import net.kyori.adventure.bossbar.BossBar;
import net.kyori.adventure.text.Component;
import org.checkerframework.checker.nullness.qual.NonNull;
import org.jetbrains.annotations.NotNull;
public class makeBossBar {
    public makeBossBar(@NonNull String text, @NonNull int progress, @NotNull BossBar.Color color, @NotNull BossBar.Overlay overlay, @NonNull Audience target) {
        final Component name = Component.text(text);
        final BossBar bar = BossBar.bossBar(name, progress, color, overlay);
        target.showBossBar(bar);
    }
}
