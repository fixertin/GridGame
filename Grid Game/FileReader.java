

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.charset.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;

public class FileReader {
	
	static Path file = Paths.get("c:/Users/Brent/EclipseWorkspace/DataHolder.txt");
	
	
	public static ArrayList<String> readData()
	{
		ArrayList<String> rooms = new ArrayList<String>();
		
		Charset charset = Charset.forName("US-ASCII");
		try (BufferedReader reader = Files.newBufferedReader(file, charset)) {
		    String line = null;
		    while ((line = reader.readLine()) != null) {
		        rooms.add(line);
		    }
		} catch (IOException x) {
		    System.err.format("IOException: %s%n", x);
		}
		
		return rooms;
	}
}

