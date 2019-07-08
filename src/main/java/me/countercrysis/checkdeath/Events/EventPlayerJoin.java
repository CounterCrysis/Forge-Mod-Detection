package me.countercrysis.checkdeath.Events;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

public class EventPlayerJoin implements Listener {

  @EventHandler
  public void onJoin(PlayerJoinEvent event) {
    String uuid = event.getPlayer().getUniqueId().toString();
    String username = event.getPlayer().getName();
  }
}
