package me.modbot;

import org.bukkit.plugin.PluginDescriptionFile;
import org.bukkit.plugin.java.JavaPlugin;

public class PhoenixCouncilCommands extends JavaPlugin{

	@Override
	public void onEnable(){
		PluginDescriptionFile pdfFile = getDescription();
		logger logger = getLogger();
		logger.info(pfdFile.getName() + " has been enabled!");
	}
	
	public void onDisable(){
		PluginDescriptionFile pdfFile = getDescription();
		logger logger = getLogger();
		logger.info(pfdFile.getName() + " has been disabled!");
		
	}
}