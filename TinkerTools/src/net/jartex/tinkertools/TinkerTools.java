package net.jartex.tinkertools;

import java.util.logging.Level;

import org.bukkit.plugin.java.JavaPlugin;

public class TinkerTools extends JavaPlugin{
	
	public void onEnable() {
		
	}
	
	public void onDisable() {
		
	}
	
	void log(String s) {
		String s1 = "TinkerTools: " + s;
		getLogger().log(Level.INFO, s1);
	}

}
