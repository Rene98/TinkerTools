package net.jartex.tinkertools;

import java.util.logging.Level;

import org.bukkit.plugin.java.JavaPlugin;

import net.jartex.tinkertools.Listeners.CraftingListener;

public class TinkerTools extends JavaPlugin{
	
	public void onEnable() {
		getServer().getPluginManager().registerEvents(new CraftingListener(), this);
	}
	
	public void onDisable() {
		
	}
	
	void log(String s) {
		String s1 = "TinkerTools: " + s;
		getLogger().log(Level.INFO, s1);
	}

}
