import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Scanner;

public class FileIO {
	public static String line;
	
	
	public static void ReadList () {
		ArrayList<SudukuTable> questionarray = new ArrayList<SudukuTable>();
		
		
	try {
		Scanner sc = new Scanner(new BufferedReader(new FileReader("question.txt")));
		while (sc.hasNextLine()) {
			//default level
			Level level = Level.Undefined;
			String selector = sc.nextLine();
			if (selector.charAt(0) == 'E') {
				level = Level.Easy;
			}
			else if (selector.charAt(0) == 'M') {
				level = Level.Midium;
			}
			else if (selector.charAt(0) == 'H') {
				level = Level.Hard;
			}
			
			//this for loop is to read each 9 lines from one block 
			for (int i =0; i < 9; i++) {
				line = sc.nextLine();
				//this loop aim to find each single space of the total 81 space of one question block
				for (int x =0; x<9; x++) {
					for (int y =0; y< 9; y++) {
						
						
					}
				}
				
				
				
			}
		}
		
		
	} catch (Exception e) {
		System.out.println(e);
	}
	 
	}
	
	
	
	//testing only
	
	public static void main (String args[]) {
		ReadList();
		
	}

}
