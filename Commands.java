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
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		if (cmd.getName().equalsIgnoreCase("basic")) { // If the player typed /basic then do the following...
			// do something...
			return true;
		} else if (cmd.getName().equalsIgnoreCase("basic2")) {
			if (!(sender instanceof Player)) {
				sender.sendMessage("This command can only be run by a player.");
			} else {
				Player player = (Player) sender;
				// do something
			}
			return true;
		}
		return false;
	}
}
