package com.caindonaghey.commandbin.commands;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import com.caindonaghey.commandbin.Phrases;

public class CraftCommand implements CommandExecutor {
	
	public boolean onCommand(CommandSender s, Command c, String l, String [] args) {
		if(l.equalsIgnoreCase("craft")){
			if(!(s instanceof Player)) {
				System.out.println("[CommandBin] " + Phrases.get("no-console"));
				return true;
			}
			Player player = (Player) s;
			if(!player.hasPermission("CommandBin.craft")) {
				player.sendMessage(Phrases.get("no-permission"));
				return true;
			}
			player.openWorkbench(player.getLocation(), true);
		}
		return true;
	}

}
