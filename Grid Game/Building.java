

public class Building {

	
	private Room[][] grid;
	
	
	public Building()
	{		
		grid = new Room[5][5];
		for(int i = 0; i < grid.length; i++)
		{
			for(int j = 0; j < grid[i].length; j++)
			{
				grid[i][j] = new Room(i, j);
			}
		}
	}
	
	public Building(Room[][] grid)
	{ 
		this.grid = grid;
	}	
	
	public boolean roomExistsHere(int x, int y)
	{
		if(grid[y][x] != null && grid[y][x].getMessage() != null)
		{
			return true;
		}
		
		return false;
	}
	
	public boolean roomExistsNorth(int currentX, int currentY)
	{
		if(grid[currentY - 1][currentX].getMessage() != null)
		{
			return true;
		}
		
		return false;
	}
	
	public Room getRoomNorth(int currentX, int currentY)
	{
		if(roomExistsNorth(currentX, currentY))
		{
			return grid[currentY - 1][currentX];
		}
		
		return getRoomHere(currentX, currentY);
	}
	
	public Room getRoomHere(int x, int y)
	{
		return grid[y][x];
	}
	
	public void testGrid()
	{
		for(int i = 0; i < grid.length; i++)
		{
			for(int j = 0; j < grid[i].length; j++)
			{
				if(grid[i][j] == null)
				{
					System.out.print("[ ] ");
				}
				else
				{
					System.out.print("[*] ");
				}							
			}
			System.out.println("");
		}
	}
	
	
	
	
}

