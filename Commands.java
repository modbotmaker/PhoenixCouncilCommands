package me.modbot;

import org.bukkit.plugin.PluginDescriptionFile;
import org.bukkit.plugin.java.JavaPlugin;

public class PhoenixCouncilCommands extends JavaPlugin {
	@Override
	public boolean onEnable() {
		// Enable stuff
	}
	
	@Override
	public boolean onDisable() {
		// Disable stuff
	}
	
	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		if(sender instanceof Player) {
			switch(cmd.getName()) {
				case "mspc":
					sender.sendMessage("Here is the MuseScore version of Phoenix Council here: https://musescore.com/groups/phoenixcouncil");
					return true;
				case "steampc":
					sender.sendMessage("Here is the Steam version of Phoenix Council here: http://steamcommunity.com/groups/Phoenixcouncil2"); 
					return true;
				case "musescore":
					sender.sendMessage("Here is Mika's MuseScore profile here: https://musescore.com/maestermika");
					return true;
				case "myt":
					sender.sendMessage("Here is Mika's youtube channel: https://www.youtube.com/channel/UCiCT2ebIPRnEVHEcwpAuzhA");
					return true;
				default:
					return false;
			}
		}
	}
}
