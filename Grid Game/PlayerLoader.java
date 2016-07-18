


import java.util.ArrayList;

public class PlayerLoader {

	public static Player loadPlayer(ArrayList<String> rawData, Game game)
	{
		Player loaded = new Player(game);
		for(int i = 1; i < rawData.size(); i++)
		{
			Integer[] location = getPlayerLocation(rawData.get(i));
			if(location[0] != null && location[1] != null)
			{
				loaded.setCoordinates(location[0], location[1]);
			}			
		}
		loaded.placePlayerInGame();
		return loaded;
		
	}
	
	private static Integer[] getPlayerLocation(String line)
	{
		int found = line.indexOf("PlayerX: ");
		int xIndexBegin = found + "PlayerX: ".length();
		int xIndexEnd = line.indexOf('%', xIndexBegin);
		Integer x = parseIntegerValue(found, xIndexBegin, xIndexEnd, line);
		
		found = line.indexOf("PlayerY: ");
		int yIndexBegin = found + "PlayerY: ".length();
		int yIndexEnd = line.indexOf('%', yIndexBegin);
		Integer y = parseIntegerValue(found, yIndexBegin, yIndexEnd, line);
		
	    Integer[] location = {x, y};
		return location;
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