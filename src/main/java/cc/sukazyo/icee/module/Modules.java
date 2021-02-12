package cc.sukazyo.icee.module;

import cc.sukazyo.icee.module.bot.discord.DiscordBot;
import cc.sukazyo.icee.module.bot.mirai.MiraiBot;
import cc.sukazyo.icee.module.http.HttpListener;
import cc.sukazyo.icee.system.Log;
import cc.sukazyo.icee.system.ModuleManager;
import cc.sukazyo.icee.system.command.CommandException;

public class Modules {
	
	public static HttpListener http;
	public static DiscordBot discord;
	public static MiraiBot mirai;
	
	public static void registerModules () {
		
		try {
			
			discord = new DiscordBot();
			mirai = new MiraiBot();
			http = new HttpListener();
			
			ModuleManager.register(discord, mirai, http);
			
		} catch (CommandException.CommandNameConflictException e) {
			Log.logger.fatal("Command Conflict when registering Built-in Module!", e);
			System.exit(10);
		}
		
		
		Log.logger.info("Built-in Module Registered");
		
	}
	
}
