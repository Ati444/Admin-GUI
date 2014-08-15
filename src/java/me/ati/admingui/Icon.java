package me.ati.admingui;

import java.util.Arrays;

import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public abstract class Icon {

	private IconType type;
	private Material mat;
	private int pos;
	private String name;
	private String[] lore;
	ItemStack icon;
	private ItemMeta meta;

	/**
	 * 
	 * @param type
	 *            IconType of the icon.
	 * @param mat
	 *            Material to be used for the icon.
	 * @param pos
	 *            Position in the inventory for the icon.
	 * @param name
	 *            Display for the icon.
	 * @param lore
	 *            Lore for the icon.
	 */
	public Icon(IconType type, Material mat, int pos, String name,
			String... lore) {
		this.type = type;
		this.mat = mat;
		this.name = name;
		this.lore = lore;

		icon = new ItemStack(this.mat);

		if (icon.getItemMeta() != null)
			meta = icon.getItemMeta();
		meta.setDisplayName(this.name);
		meta.setLore(Arrays.asList(this.lore));
		icon.setItemMeta(this.meta);
	}

	/**
	 * 
	 * @return The IconType of the icon.
	 */
	public final IconType getType() {
		if (type != null)
			return type;
		return null;
	}

	/**
	 * 
	 * @return The material of the icon.
	 */
	public final Material getMaterial() {
		return mat;
	}

	/**
	 * 
	 * @return the inventory slot of the icon.
	 */
	public final int getPosition() {
		return pos;
	}

	/**
	 * 
	 * @return The name of the icon.
	 */
	public final String getName() {
		return name;
	}

	/**
	 * 
	 * @return The lore of the icon.
	 */
	public final String[] getLore() {
		return lore;
	}

	/**
	 * 
	 * @return The icon.
	 */
	public final ItemStack getItemStack() {
		if (icon != null) return icon;
		return icon;
	}
}
