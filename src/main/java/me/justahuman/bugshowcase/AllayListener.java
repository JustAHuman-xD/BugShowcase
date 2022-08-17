package me.justahuman.bugshowcase;

import org.bukkit.entity.Allay;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerInteractAtEntityEvent;
import org.bukkit.event.player.PlayerInteractEntityEvent;

public class AllayListener implements Listener {

    @EventHandler(ignoreCancelled = true, priority = EventPriority.LOWEST)
    public void AllayGiveListener(PlayerInteractEntityEvent event) {
        if (event.getRightClicked() instanceof Allay) event.setCancelled(true);
        event.getPlayer().sendMessage(event.getRightClicked().getUniqueId() + " ? " + event.getRightClicked().getEntityId());
    }

    @EventHandler(ignoreCancelled = true, priority = EventPriority.LOWEST)
    public void AllayAtListener(PlayerInteractAtEntityEvent event) {
        if (event.getRightClicked() instanceof Allay) event.setCancelled(true);
    }
}
