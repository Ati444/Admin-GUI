package me.ati.admingui;

import java.util.ArrayList;

import me.ati.admingui.gui.AdminMenu;

public class GUIManager {

	private static GUIManager instance = new GUIManager();

	public static GUIManager getInstance() {
		return instance;
	}

	private ArrayList<GUI> GUIs;

	private GUIManager() {
		GUIs = new ArrayList<GUI>();
		GUIs.add(new AdminMenu());
	}

	public GUI getGUI(String title) {
		for (GUI g : GUIs) {
			if (g.getTitle().equalsIgnoreCase(title)) {
				return g;
			}
		}
		return null;
	}
}
