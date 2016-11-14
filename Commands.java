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
		if (cmd.getName().equalsIgnoreCase("basic")) {
			return true;
		} else if (cmd.getName().equalsIgnoreCase("mspc")) {
			if ((sender instanceof Player)) {
				sender.sendMessage("Here is the MuseScore version of Phoenix Council here: https://musescore.com/groups/phoenixcouncil");
			}
			return true;
		}
		return false;
	}
}
