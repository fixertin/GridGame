package com.sanderson.brentf.gridgame;

public class Go extends Command{
	
	private Player player;
	private final String errorMessage = "You can't go there...";
	
	public Go(Player player)
	{
		this.player = player;
	}
	
	@Override
	public void execute(String description)
	{
		if(description.toUpperCase().equals("NORTH"))
		{
			goNorth();
		}		
		else if(description.toUpperCase().equals("EAST"))
		{
			goEast();
		}		
		else if(description.toUpperCase().equals("SOUTH"))
		{
			goSouth();
		}		
		else if(description.toUpperCase().equals("WEST"))
		{
			goWest();
		}		
		else
		{
			printError();
		}
	}
	
	private void printError()
	{
		System.out.println(errorMessage);
	}
	
	private void goNorth()
	{
		if(!player.goNorth())
		{
			printError();
		}
	}
	
	private void goEast()
	{
		
	}
	
	private void goSouth()
	{
		
	}
	
	private void goWest()
	{
		
	}
}
