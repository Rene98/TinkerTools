package net.jartex.tinkertools.Listeners;

import java.util.ArrayList;
import java.util.Arrays;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.entity.HumanEntity;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.PrepareItemCraftEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class CraftingListener implements Listener {
	ArrayList<Material> bannedTools = new ArrayList<Material>(Arrays.asList(
			Material.STONE_AXE, Material.STONE_HOE, Material.STONE_PICKAXE, Material.STONE_SPADE, Material.STONE_SWORD,
			Material.IRON_AXE, Material.IRON_HOE, Material.IRON_PICKAXE, Material.IRON_SPADE, Material.IRON_SWORD,
			Material.GOLD_AXE, Material.GOLD_HOE, Material.GOLD_PICKAXE, Material.GOLD_SPADE, Material.GOLD_SWORD,
			Material.DIAMOND_AXE, Material.DIAMOND_HOE, Material.DIAMOND_PICKAXE, Material.DIAMOND_SPADE, Material.DIAMOND_SWORD
			));
	ArrayList<Material> allowedTools = new ArrayList<Material>(Arrays.asList(
			Material.WOOD_AXE, Material.WOOD_HOE, Material.WOOD_PICKAXE, Material.WOOD_SPADE, Material.WOOD_SWORD
			));
	@EventHandler
	public void onCraft(PrepareItemCraftEvent e) {
		Material result = e.getRecipe().getResult().getType();
		if(bannedTools.contains(result)) {
			e.getInventory().setResult(new ItemStack(Material.AIR));
			for(HumanEntity he:e.getViewers()) {
                if(he instanceof Player) {
                    ((Player)he).sendMessage(ChatColor.RED+"You cannot craft this!");
                }
            }
		} else if(allowedTools.contains(result)) {
			ItemStack TinkerTool = new ItemStack(result);
			ItemMeta tinkermeta = TinkerTool.getItemMeta(); 
			tinkermeta.setLore(Arrays.asList(ChatColor.GREEN + "Tinker Tool", ChatColor.GOLD + "BrandNew: (0/250)"));
		}
	}
}
