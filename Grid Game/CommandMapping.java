

import java.util.HashMap;

public class CommandMapping {
	
	private HashMap<String,Command> mapping;
	
	public CommandMapping(String commandWord, Command command)
	{
		mapping.put(commandWord, command);
	}
	
	public void attemptExecution(String commandWord, String description)
	{
		if(mapping.containsKey(commandWord))
		{
			Command command = mapping.get(commandWord);
			command.execute(description);
		}
		
		else
		{
			System.out.println("Command not recognized");
		}
	}

}

