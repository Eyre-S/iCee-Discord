package cc.sukazyo.icee.module.bot.mirai;

import cc.sukazyo.icee.system.command.CommandWithAlias;

import java.util.HashMap;

public class MiraiCommands extends CommandWithAlias {
	
	private static final String NAME = "mirai";
	private static final String[] ALIAS = new String[]{"qq"};
	
	@Override
	protected String getName() { return NAME; }
	@Override
	protected String[] getAliases() { return ALIAS; }
	
	@Override
	public void execute(String[] args, HashMap<String, String> parameters) {
	
	}
	
}
