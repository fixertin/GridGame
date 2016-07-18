

import java.util.ArrayList;

public class Builder {
	
	public static Building createBuilding(ArrayList<String> rawData)
	{		
		Integer height = getHeight(rawData.get(0));
		Integer width = getWidth(rawData.get(0));
		
		Room[][] grid = new Room[0][0];
		
		if(height != null && width != null)
		{
			grid = new Room[height][width];
			
			for(int i = 1; i < rawData.size(); i++)
			{
				String message = getRoomMessage(rawData.get(i));
				Integer x = getRoomX(rawData.get(i));
				Integer y = getRoomY(rawData.get(i));
				
				if(message != null && x != null && y != null )
				{
					grid[y][x] = new Room(x, y, message);
				}
			}
		}			
		return new Building(grid);		
	}
	
	private static String getRoomMessage(String line)
	{
		int found = line.indexOf("RoomMessage: ");
		int indexBegin = found + "RoomMessage: ".length();
		int indexEnd = line.indexOf('%', indexBegin);
		String message = line.substring(indexBegin, indexEnd);
		return message;		
	}
	
	private static Integer getRoomX(String line)
	{
				
		int found = line.indexOf("RoomX: ");
		int indexBegin = line.indexOf("RoomX: ") + "RoomX: ".length();
		int indexEnd = line.indexOf('%', indexBegin);
				
		return parseIntegerValue(found, indexBegin, indexEnd, line);
	}
	
	private static Integer getRoomY(String line)
	{
		int found = line.indexOf("RoomY: ");
		int indexBegin = line.indexOf("RoomY: ") + "RoomY: ".length();
		int indexEnd = line.indexOf('%', indexBegin);
		return parseIntegerValue(found, indexBegin, indexEnd, line);
	}
	
	private static Integer getWidth(String line)
	{
		int found = line.indexOf("BuildingWidth: ");
		int indexBegin = line.indexOf("BuildingWidth: ") + "BuildingWidth: ".length();
		int indexEnd = line.indexOf('%', indexBegin);
		return parseIntegerValue(found, indexBegin, indexEnd, line);	
	}
	
	private static Integer getHeight(String line)
	{
		int found = line.indexOf("BuildingHeight: ");
		int indexBegin = line.indexOf("BuildingHeight: ") + "BuildingHeight: ".length();
		int indexEnd = line.indexOf('%', indexBegin);
		return parseIntegerValue(found, indexBegin, indexEnd, line);	
	}
	
	private static Integer parseIntegerValue(int found, int indexBegin, int indexEnd, String line)
	{
		if(found >= 0)		
		{			
			String message = line.substring(indexBegin, indexEnd);	
			return new Integer(message);	
		}		
		
		return null;	
	}
	

}