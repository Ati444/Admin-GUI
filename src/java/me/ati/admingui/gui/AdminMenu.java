package me.ati.admingui.gui;

import me.ati.admingui.GUI;
import me.ati.admingui.IconType;

import org.bukkit.ChatColor;

public class AdminMenu extends GUI {

	public AdminMenu() {
		super(ChatColor.DARK_RED + "Admin GUI Menu", 9);

		setSlot(1, getIcon(IconType.SURVIVAL));
		setSlot(2, getIcon(IconType.CREATIVE));
		setSlot(3, getIcon(IconType.ADVENTURE));
	}
}
