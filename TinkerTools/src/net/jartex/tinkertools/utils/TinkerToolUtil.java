package net.jartex.tinkertools.utils;

import org.bukkit.inventory.ItemStack;

import net.jartex.tinkertools.Listeners.CraftingListener;

public class TinkerToolUtil {
	public static TinkerToolUtil instance;
	public static TinkerToolUtil getInstance() {
		if(TinkerToolUtil.instance == null) {
			TinkerToolUtil.instance = new TinkerToolUtil();
		}
		return TinkerToolUtil.instance;
	}
	 
	boolean isTinkerTool(ItemStack s) {
		boolean isTool = false;
		if(CraftingListener.getInstance().allowedTools.contains(s.getType()) || CraftingListener.getInstance().bannedTools.contains(s.getType())) {
			
		}
		return isTool;
	}
}
