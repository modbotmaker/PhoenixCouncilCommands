package me.modbot;

import org.bukkit.plugin.PluginDescriptionFile;
import org.bukkit.plugin.java.JavaPlugin;

public class PhoenixCouncilCommands extends JavaPlugin {

	@Override
	public void onEnable() {
		PluginDescriptionFile pdfFile = getDescription();
		logger logger = getLogger();
		logger.info(pfdFile.getName() + " has been enabled!");
	}
	
	@Override
	public void onDisable() {
		PluginDescriptionFile pdfFile = getDescription();
		logger logger = getLogger();
		logger.info(pfdFile.getName() + " has been disabled!");
	}
	
	@Override
	public void onCommand(CommandSender arg0, Command arg1, String arg2, String arg3) {
		
	}
}
