package com.caindonaghey.commandbin.commands;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.World;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Creature;
import org.bukkit.entity.Entity;
import org.bukkit.entity.Player;

import com.caindonaghey.commandbin.Phrases;

public class KillmobsCommand implements CommandExecutor {
	
	public boolean onCommand(CommandSender s, Command c, String l, String [] args) {
		if(l.equalsIgnoreCase("killmobs")) {
			if(!(s instanceof Player)) {
				if(args.length != 1) {
					System.out.println("[CommandBin] " + Phrases.get("invalid-arguments"));
					return false;
				}
				
				World world = Bukkit.getServer().getWorld(args[0]);
				if(world == null) {
					System.out.println("[CommandBin] " + Phrases.get("invalid-world"));
					return true;
				}
				
				for(Entity entities : world.getEntities()) {
					if(entities instanceof Creature) {
						entities.remove();
					}
				}
				System.out.println("[CommandBin] " + Phrases.get("removed-mobs"));
			}
			
			Player player = (Player) s;
			
			if(!player.hasPermission("CommandBin.killmobs")) {
				player.sendMessage(Phrases.get("no-permission"));
				return true;
			}
			
			for(Entity entities : player.getWorld().getEntities()) {
				if(entities instanceof Creature) {
					entities.remove();
				}
			}
			player.sendMessage(Phrases.get("removed-mobs"));
		}
		return true;
	}

}
