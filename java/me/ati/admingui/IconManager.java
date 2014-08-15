package me.ati.admingui;

import java.util.ArrayList;

import me.ati.admingui.icons.Creative;

public class IconManager {

	private static IconManager instance = new IconManager();

	public static IconManager getInstance() {
		return instance;
	}

	public ArrayList<Icon> icons;

	private IconManager() {
		icons = new ArrayList<Icon>();
		icons.add(new Creative());
	}

	public Icon getIcon(IconType iconType) {
		for (Icon i : icons) {
			if (i.getType().equals(iconType)) {
				return i;
			}
		}
		return null;
	}
}
