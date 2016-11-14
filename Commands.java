package me.modbot;

import org.bukkit.plugin.PluginDescriptionFile;
import org.bukkit.plugin.java.JavaPlugin;

public class PhoenixCouncilCommands extends JavaPlugin {

	@Override
	public void onEnable() {
		PluginDescriptionFile pdfFile = getDescription();
		logger logger = getLogger();
		logger.info(pdfFile.getName() + " has been enabled!");
	}
	
	@Override
	public void onDisable() {
		PluginDescriptionFile pdfFile = getDescription();
		logger logger = getLogger();
		logger.info(pdfFile.getName() + " has been disabled!");
	}
	
	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] a) {
		if(!(sender instanceof Player)) {
			sender.sendMessage("This command can be only run by a player!");
			return false;
		}
		return false;
		
	}
}
