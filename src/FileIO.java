import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Scanner;

public class FileIO {
	public static String line;
	static File input;
	static ArrayList<SudukuTable> questionarray = new ArrayList<SudukuTable>();
	
	
	public static void ReadList () {
		//ArrayList<SudukuTable> questionarray = new ArrayList<SudukuTable>();
		
		
	try {
		Scanner sc = new Scanner(new BufferedReader(new FileReader(input)));
		while (sc.hasNextLine()) {
			//default level
			SudukuTable newTable = new SudukuTable() ;
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
			for (int x =0; x < 9; x++) {
				line = sc.nextLine();
				System.out.println(line);
				//int value = 1;
				//this loop aim to find each single space of the total 81 space of one question block
					for (int y =0; y< 9; y++) {
						int value = Character.getNumericValue(line.charAt(y));
						//System.out.println(value);
						if (value == 0) {
						newTable.setNumber(x, y, value, true);
						}
						else {
							newTable.setNumber(x, y, value, false);
					}
						newTable.setLevel(level);
				}	
			}
			questionarray.add(newTable);
		}
		
		//test block
		//for (int i =0; i < questionarray.size(); i++) {
			//questionarray.get(i).printmyself();
		//}
		
		
		
	} catch (Exception e) {
	 e.printStackTrace();
	}
	 
	}
	
    public static SudukuTable getList (int i) {
		return questionarray.get(i) ;
	}
    
    public void setFile (File input) {
    	this.input = input;
    }
	
	
	
	//testing only
	
		//ReadList();
		//questionarray.get(0);
		
		//System.out.println();
		
	



}
