package me.modbot;

import org.bukkit.plugin.PluginDescriptionFile;
import org.bukkit.plugin.java.JavaPlugin;

public class PhoenixCouncilCommands extends JavaPlugin {

	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		if (cmd.getName().equalsIgnoreCase("mspc")) {
			return true;
		} else if (cmd.getName().equalsIgnoreCase("mspc")) {
			if ((sender instanceof Player)) {
				sender.sendMessage("Here is the MuseScore version of Phoenix Council here: https://musescore.com/groups/phoenixcouncil");
			}
			return true;
		}
		return false;
	}
	
	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		if (cmd.getName().equalsIgnoreCase("steampc")) {
			return true;
		} else if (cmd.getName().equalsIgnoreCase("steampc")) {
			if ((sender instanceof Player)) {
				sender.sendMessage("Here is the Steam version of Phoenix Council here: http://steamcommunity.com/groups/Phoenixcouncil2");
			}
			return true;
		}
		return false;
	}
	
	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		if (cmd.getName().equalsIgnoreCase("musescore")) {
			return true;
		} else if (cmd.getName().equalsIgnoreCase("musescore")) {
			if ((sender instanceof Player)) {
				sender.sendMessage("Here is Mika's MuseScore profile here: https://musescore.com/maestermika");
			}
			return true;
		}
		return false;
	}
	
	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		if (cmd.getName().equalsIgnoreCase("myt")) {
			return true;
		} else if (cmd.getName().equalsIgnoreCase("myt")) {
			if ((sender instanceof Player)) {
				sender.sendMessage("Here is Mika's youtube channel: https://www.youtube.com/channel/UCiCT2ebIPRnEVHEcwpAuzhA");
			}
			return true;
		}
		return false;
	}
}
