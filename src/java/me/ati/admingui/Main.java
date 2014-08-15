package me.ati.admingui;

import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {

	public void onEnable() {

		getCommand("debug1").setExecutor(new Debug1());
	}

	public void onDisable() {

	}

}
