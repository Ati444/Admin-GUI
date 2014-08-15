package me.ati.admingui.icons;

import me.ati.admingui.Icon;
import me.ati.admingui.IconType;

import org.bukkit.ChatColor;
import org.bukkit.Material;

public class Creative extends Icon {
	public Creative() {
		super(IconType.CREATIVE, Material.GRASS, 1,
				ChatColor.GOLD + "Creative",
				ChatColor.GREEN + "Change your gamemode",
				ChatColor.GREEN + "to Creative");
	}
}
