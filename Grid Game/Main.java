

import java.util.ArrayList;

public class Main {

	private static Building building;
	
	public static void main(String args[])
	{
		ArrayList<String> rawData = FileReader.readData();
		building = Builder.createBuilding(rawData);
		building.testGrid();
		Game game = new Game(building);
		Player player = PlayerLoader.loadPlayer(rawData, game);		
		
		game.play(player);		
	}
	
	
}
