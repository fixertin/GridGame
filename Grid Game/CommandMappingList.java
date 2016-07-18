

import java.util.ArrayList;

public class CommandMappingList {
	
	private ArrayList<CommandMapping> commands;
	private Player player;
	
	public CommandMappingList(Player player)
	{
		this.player = player;
	}

	public CommandMappingList()
	{
		commands  = new ArrayList<CommandMapping>();
		commands.add(new CommandMapping("GO", new Go(player)));
	}
	
	

}
