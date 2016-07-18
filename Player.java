package com.sanderson.brentf.gridgame;

public class Player {

	private int[] location;
	private Game game;
	public Room currentRoom;
	
	public Player(Game game) 
	{
		location = new int[2];
		this.game = game;		
	}
	
	public Player(int x, int y, Game game)
	{
		this.game = game;		
		location = new int[2];
		setCoordinates(x, y);
	}
	
	public void placePlayerInGame()
	{
		game.placePlayer(this);
	}
	
	public Room getCurrentRoom()
	{
		return currentRoom;		
	}	
	
	public void initializeCurrentRoom(Building building)
	{
		if(building.roomExistsHere(location[0], location[1]))
		{
			Room current = building.getRoomHere(location[0], location[1]);
			setCurrentRoom(current);
		}
	}
	
	public boolean goNorth()
	{
		Building building = game.getBuilding();
		Room northRoom = building.getRoomNorth(location[0], location[1]);
		if(northRoom != null)
		{
			setCurrentRoom(northRoom);
			return true;
		}
		
		return false;
	}
	
	private void setCurrentRoom(Room currentRoom)
	{
		this.currentRoom = currentRoom;
		setCoordinates(currentRoom.getCoordinates());
	}
	
	public void setCoordinates(int x, int y)
	{
		location[0] = x;
		location[1] = y;
	}
	
	private void setCoordinates(int[] location)
	{
		this.location[0] = location[0];
		this.location[1] = location[1];
	}
	
}
