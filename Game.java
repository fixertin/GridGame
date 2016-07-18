package com.sanderson.brentf.gridgame;

import java.util.Scanner;

public class Game {
	
	private boolean stillPlaying = true;
	private Scanner input;
	
	
	private Building building;
	private Room currentRoom;
	
	public Game(Building building)
	{
		input = new Scanner(System.in);
		this.building = building;		
	}
	
	public void placePlayer(Player player)
	{
		player.initializeCurrentRoom(building);
		currentRoom = player.getCurrentRoom();
	}
	
	private String getCurrentRoomMessage()
	{
		return currentRoom.getMessage();
	}
	
	public Building getBuilding()
	{
		return building;
	}
	
	public void play(Player player)
	{
		while(stillPlaying)
		{
			System.out.println(getCurrentRoomMessage());
			input.nextLine();
		}
	}
	
	
	
	
}
