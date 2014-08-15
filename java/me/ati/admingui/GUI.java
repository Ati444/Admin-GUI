package me.ati.admingui;

import org.bukkit.Bukkit;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;

public abstract class GUI {

	private Inventory inv;
	private String title;
	private int rows;

	/**
	 * 
	 * @param title
	 *            The title for the inventory.
	 * @param rows
	 *            The number of rows for the inventory.
	 */
	public GUI(String title, int rows) {
		this.title = title;
		this.rows = rows;
		this.inv = Bukkit.createInventory(null, rows * 9, title);
	}

	/**
	 * 
	 * @param position
	 *            Position for the item.
	 * @param item
	 *            The item to be set.
	 */
	public void setSlot(int position, ItemStack item) {
		inv.setItem(position, item);
	}

	public String getTitle() {
		return inv.getName();
	}

	public ItemStack getIcon(IconType type) {
		return IconManager.getInstance().getIcon(type).getItemStack();
	}

	public Inventory getInventory() {
		return inv;
	}

}
