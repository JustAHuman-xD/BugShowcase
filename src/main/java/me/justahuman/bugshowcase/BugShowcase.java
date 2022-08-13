package me.justahuman.bugshowcase;

import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public class BugShowcase extends JavaPlugin {

    @Override
    public void onEnable() {

        getLogger().info("========================================");
        getLogger().info("    Allay Bug Showcase - By JustAHuman  ");
        getLogger().info("========================================");

        this.getServer().getPluginManager().registerEvents(new AllayListener(), this);
    }
}