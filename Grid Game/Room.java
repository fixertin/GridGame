


public class Room {

	private String message;
	private int[] coordinates;
	
	public Room() 
	{ 
		message = "This is not a room"; 
		coordinates = new int[2];
	}
	
	public Room(int x, int y)
	{
		this.message = "This is not a room";
		coordinates = new int[2];
		setCoordinates(x, y);
	}
	
	public Room(int x, int y, String message)
	{
		this.message = "This is not a room";
		coordinates = new int[2];
		this.message = message;
		setCoordinates(x, y);
	}
	
	public void setMessage(String message)
	{
		this.message = message;
	}
	
	public String getMessage()
	{
		return message;
	}
	
	public int[] getCoordinates()
	{
		return coordinates;
	}
	
	private void setCoordinates(int x, int y)
	{
		coordinates[0] = x;
		coordinates[1] = y;
	}
	
}
