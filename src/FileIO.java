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
			System.out.println();
			//default level
			Level level = Level.Undefined;
			if (sc.nextLine().charAt(0) == 'E') {
				level = Level.Easy;
			}
			else if (sc.nextLine().charAt(0) == 'M') {
				level = Level.Midimum;
			}
			else if (sc.nextLine().charAt(0) == 'H') {
				level = Level.Hard;
			}
			System.out.println(level);
			for (int i =0; i < 9; i++) {
				line = sc.nextLine();
				System.out.println(line);
				
				
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
