package cc.sukazyo.icee.system.command;

import java.util.ArrayList;
import java.util.List;

public abstract class CommandWithChildAndAlias extends CommandWithChild implements ICommandWithAlias {
	
	public List<String> getAvailableAliases () {
		List<String> names = new ArrayList<>();
		for (String i : getAliases()) {
			if (
					(!CommandManager.getRegisteredCommandsMap().containsKey(i)) ||
					(
							CommandManager.getRegisteredCommandsMap().containsKey(i) &&
							CommandManager.getRegisteredCommandsMap().get(i) == this
					)
			) names.add(i);
		}
		return names;
	}
	
	@Override
	public List<String> getRegistryName() {
		List<String> names = new ArrayList<>();
		names.add(getName());
		names.addAll(getAvailableAliases());
		return names;
	}
	
}
