package com.caindonaghey.commandbin;

public class Phrases {
	
	
	/*
	 * Future Languages:
	 * Spanish, German
	 * Need translators pls.
	 */
	
	public static String get(String string) {
		
		if(CommandBin.language == "english") {
			if(string == "enabled") return "CommandBin has been enabled!";
			if(string == "disabled") return "CommandBin has been disabled!";
			if(string == "no-console") return "You may not use this command in console.";
			if(string == "invalid-arguments") return "You have entered invalid arguments.";
			if(string == "no-permission") return "You do not have permission to run this command.";
			if(string == "now-afk") return "You are now marked as AFK.";
			if(string == "no-afk") return "You are no longer marked as AFK.";
			if(string == "player-invalid") return "That player is not online.";
			if(string == "teleport-request-sent") return "Teleportation request has been sent.";
			if(string == "teleport-request-receive") return "wants to teleport to you.";
			if(string == "teleport-request-receive-2") return "/tpaccept <player> or /tpdeny <player>";
			if(string == "teleport-request-already") return "You have already sent a teleport request to this player.";
			if(string == "teleport-request-accepted") return "Your teleportation request has been accepted. Teleporting..";
			if(string == "teleport-request-allow") return "Accepted. One moment whilst I teleport them..";
			if(string == "teleport-request-invalid") return "No such teleport request exists.";
			if(string == "teleport-request-denied") return "Your teleport request has been denied.";
			if(string == "teleport-request-deny") return "Teleport request denied.";
			if(string == "player-blocked") return "This player is now blocked from using commands.";
			if(string == "player-unblocked") return "This player is now unblocked from using commands.";
			if(string == "blocked-from-commands") return "You are blocked from using commands.";
			if(string == "bolt-striked") return "Striked with lightning!";
			if(string == "bolt-player") return "Striked player with lightning!";
			if(string == "bolt-usage") return "/bolt [player]";
			if(string == "inventory-cleared") return "Inventory has been cleared.";
			if(string == "exploded") return "Boom!";
			if(string == "fed-self") return "You feel full now.";
			if(string == "fed-other") return "You have fed player. They feel full now.";
			if(string == "frozen-player") return "You have frozen this player.";
			if(string == "unfrozen-player") return "You have unfrozen this player.";
			if(string == "gamemode-switch") return "Player's gamemode has been switched.";
			if(string == "invalid-gamemode") return "Invalid gamemode has been specified.";
			if(string == "player-godmode") return "Player now has god mode.";
			if(string == "player-ungod") return "Player no longer has god mode.";
			if(string == "god-enabled") return "Godmode enabled.";
			if(string == "god-disabled") return "Godmode disabled.";
			if(string == "heal-other") return "You have healed this player.";
			if(string == "heal-self") return "You have healed yourself.";
			if(string == "kill-player") return "You have killed this player.";
			if(string == "kill-self") return "You have killed yourself.";
			if(string == "invalid-world") return "The world you have chosen does not exist.";
			if(string == "time-set") return "World time has been set to ";
			if(string == "time-locked") return "The time has been locked.";
			if(string == "time-unlocked") return "The time has been unlocked.";
			if(string == "player-muted") return "Player has been muted. They can no longer talk.";
			if(string == "player-unmuted") return "Player has been unmuted. They can now talk.";
			if(string == "you-are-muted") return "You cannot talk, you have been muted.";
			if(string == "spawn-set") return "World spawn has been set to your location.";
			if(string == "spawn-player") return "Teleported player to their current world spawn.";
			if(string == "player-tele-spawn") return "Teleported to your world spawn.";
			if(string == "starve-self") return "You have starved yourself.";
			if(string == "starve-others") return "You have starved another player.";
			if(string == "tele-all") return "You have teleport all online players to you.";
			if(string == "players-invalid") return "One of the players specified are not online.";
			if(string == "tele-1-2") return "Teleported Player 1 to Player 2";
			if(string == "invalid-numbers") return "Invalid co-ordinates entered.";
			if(string == "tele-1-co") return "Teleported player to specified co-ordinates.";
			if(string == "tele-player") return "Teleported to player";
			if(string == "player-vanish") return "This player is now vanished.";
			if(string == "player-visible") return "This player is now visible.";
			if(string == "self-invisible") return "You are now invisible.";
			if(string == "self-visible") return "You are no longer invisible.";
			if(string == "rain-stopped") return "It is now sunny.";
			if(string == "rain-start") return "It is now raining.";
			if(string == "removed-mobs") return "Removed all creatures from the world.";
			if(string == "player-fly") return "Player can now fly.";
			if(string == "player-nofly") return "Player can no longer fly.";
			if(string == "fly-self") return "You can now fly.";
			if(string == "nofly-self") return "You can no longer fly.";
			if(string == "chunk-reloaded") return "The chunk you are standing in has been reloaded.";
			if(string == "hat") return "You are now wearing a block hat!";
			if(string == "player-bow") return "Player can now use the explosion bow.";
			if(string == "player-nobow") return "Player can no longer use the explosion bow.";
			if(string == "self-bow") return "You may now use the explosion bow, be careful.";
			if(string == "self-nobow") return "You may no longer use the explosion bow.";
			if(string == "name-changed") return "Player's name has been changed!";
			if(string == "chat-cleared") return "Your chat has been cleared!";
			if(string == "home-set") return "Your home has been set!";
			if(string == "home-teleport") return "You have teleported to your home.";
			if(string == "invalid-home") return "You do not have a home! Use /sethome to set one!";
			if(string == "warp-set") return "Warp has been set!";
			if(string == "warp-teleport") return "You have teleported to this warp.";
			if(string == "invalid-warp") return "Warp non-existant. Use /setwarp to create one!";
		}
		
		if(CommandBin.language == "dutch") {
			if(string == "enabled") return "CommandBin is ingeschakeld!";
            if(string == "disabled") return "CommandBin is uitgeschakeld!";
            if(string == "no-console") return "Je kan deze command niet uitvoeren in console.";
            if(string == "invalid-arguments") return "Je voerde invalide argumenten toe.";
            if(string == "no-permission") return "Je hebt de permissie niet om deze command uit te voeren.";
            if(string == "now-afk") return "Je bent nu AFK.";
            if(string == "no-afk") return "Je bent niet langer AFK.";
            if(string == "player-invalid") return "Deze speler is niet online.";
            if(string == "teleport-request-sent") return "Teleportatie-verzoek is verzonden.";
            if(string == "teleport-request-receive") return "wil naar je teleporteren.";
            if(string == "teleport-request-receive-2") return "/tpaccept <speler> of /tpdeny <speler>";
            if(string == "teleport-request-already") return "Je hebt al een teleportatie-verzoek gestuurd naar deze speler.";
            if(string == "teleport-request-accepted") return "Je teleportatie-verzoek is geaccepteerd. Teleporteren..";
            if(string == "teleport-request-allow") return "Geaccepteerd. Ogenblikje terwijl ik hen teleporteer..";
            if(string == "teleport-request-invalid") return "Dit teleportatie-verzoek bestaat niet.";
            if(string == "teleport-request-denied") return "Je teleportatie-verzoek is geweigerd.";
            if(string == "teleport-request-deny") return "Teleportatie-verzoek geweigerd.";
            if(string == "player-blocked") return "Deze speler kan nu geen commands meer gebruiken.";
            if(string == "player-unblocked") return "Deze speler kan nu terug commands gebruiken.";
            if(string == "blocked-from-commands") return "Je mag geen commands meer gebruiken.";
            if(string == "bolt-striked") return "Geraakt door een bliksem!";
            if(string == "bolt-player") return "Speler is neergebliksemd";
            if(string == "bolt-usage") return "/bolt [speler]";
            if(string == "inventory-cleared") return "Inventory is geleegd.";
            if(string == "exploded") return "Boom!";
            if(string == "fed-self") return "Je hebt geen honger meer.";
            if(string == "fed-other") return "Je hebt speler gevoed. Hij heeft geen honger meer.";
            if(string == "frozen-player") return "Je hebt deze speler bevroren.";
            if(string == "unfrozen-player") return "Je hebt deze speler zijn bevriezing weggehaald.";
            if(string == "gamemode-switch") return "speler's gamemode is veranderd.";
            if(string == "invalid-gamemode") return "Invalide gamemode toegekend.";
            if(string == "player-godmode") return "Speler heeft nu god-modus.";
            if(string == "player-ungod") return "Speler heeft niet langer god-modus.";
            if(string == "god-enabled") return "God-modus ingeschakeld.";
            if(string == "god-disabled") return "God-modus uitgeschakeld.";
            if(string == "heal-other") return "Je hebt deze speler genezen.";
            if(string == "heal-self") return "Je hebt jezelf genezen.";
            if(string == "kill-player") return "Je hebt deze speler gedood.";
            if(string == "kill-self") return "Je hebt jezelf gedood.";
            if(string == "invalid-world") return "De wereld die je koos, bestaat niet.";
            if(string == "time-set") return "Wereldtijd is verzet naar ";
            if(string == "time-locked") return "De tijd is vastgezet.";
            if(string == "time-unlocked") return "De tijd gaat terug verder.";
            if(string == "player-muted") return "Speler is gemuted. Hij kan niet meer praten.";
            if(string == "player-unmuted") return "Speler is niet meer gemuted. Hij kan terug praten.";
            if(string == "you-are-muted") return "Je kan niet meer praten, je bent gemuted.";
            if(string == "spawn-set") return "Wereldspawn is naar je locatie verzet.";
            if(string == "spawn-player") return "Speler geteleporteerd naar spawn in betreffende wereld.";
            if(string == "player-tele-spawn") return "Geteleporteerd naar je wereldspawn.";
            if(string == "starve-self") return "Je hebt jezelf uitgehongerd.";
            if(string == "starve-others") return "Je hebt een andere speler uitgehongerd.";
            if(string == "tele-all") return "Je hebt alle online spelers naar je toe geteleporteerd.";
            if(string == "players-invalid") return "��n of meerdere spelers hiervan zijn niet online.";
            if(string == "tele-1-2") return "Speler 1 naar speler 2 geteleporteerd";
            if(string == "invalid-numbers") return "Invalide co�rdinaten ingevoerd.";
            if(string == "tele-1-co") return "Speler naar de aangegeven co�rdinaten geteleporteerd.";
            if(string == "tele-player") return "Geteleporteerd naar speler";
            if(string == "player-vanish") return "Deze speler is nu onzichtbaar.";
            if(string == "player-visible") return "Deze speler is nu zichtbaar.";
            if(string == "self-invisible") return "Je bent onzichtbaar.";
            if(string == "self-visible") return "Je bent niet langer onzichtbaar.";
            if(string == "rain-stopped") return "Het is nu zonnig.";
            if(string == "rain-start") return "Het is nu aan het regenen.";
            if(string == "removed-mobs") return "Alle wezens verwijderd op deze wereld.";
            if(string == "player-fly") return "Speler kan nu vliegen.";
            if(string == "player-nofly") return "Speler kan niet langer vliegen.";
            if(string == "fly-self") return "Je kan nu vliegen.";
            if(string == "nofly-self") return "Je kan niet langer vliegen.";
            if(string == "chunk-reloaded") return "De chunk waarin je staat is herladen.";
            if(string == "hat") return "Je draagt nu een blok-hoed!";
            if(string == "player-bow") return "Speler kan nu de explosieve boog gebruiken.";
            if(string == "player-nobow") return "Speler kan de explosieve boog niet meer gebruiken.";
            if(string == "self-bow") return "Je mag nu de explosieve boog gebruiken, wees voorzichtig.";
            if(string == "self-nobow") return "Je mag de explosieve boog niet meer gebruiken.";
            if(string == "name-changed") return "Speler's naam is veranderd!";
			if(string == "chat-cleared") return "Your chat has been cleared!";
			if(string == "home-set") return "Your home has been set!";
			if(string == "home-teleport") return "You have teleported to your home.";
			if(string == "invalid-home") return "You do not have a home! Use /sethome to set one!";
			if(string == "warp-set") return "Warp has been set!";
			if(string == "warp-teleport") return "You have teleported to this warp.";
			if(string == "invalid-warp") return "Warp non-existant. Use /setwarp to create one!";
		}
		return "Invalid language specified. Report at http://dev.bukkit.org/server-mods/CommandBin";
	}

}
