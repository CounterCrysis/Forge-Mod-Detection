package me.countercrysis.checkdeath;

import me.countercrysis.checkdeath.Events.EventPlayerJoin;
import org.bukkit.plugin.java.JavaPlugin;

public class ForgeModDetection extends JavaPlugin {

  @Override
  public void onEnable() {
    registerEvents();
  }

  private void registerEvents() {
    getServer().getPluginManager().registerEvents(new EventPlayerJoin(), this);
  }
}
