import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Scanner;

public class FileIO {
	public static String line;
	static File input;
	ArrayList<SudukuTable> questionarray = new ArrayList<SudukuTable>();

	public void ReadList() {
		// ArrayList<SudukuTable> questionarray = new ArrayList<SudukuTable>();

		try {
			FileReader fr = new FileReader(input);
			BufferedReader br = new BufferedReader(fr);
			Scanner sc = new Scanner(br);
			while (sc.hasNextLine()) {
				// default level
				SudukuTable newTable = new SudukuTable();
				Level level = Level.Undefined;
				String selector = sc.nextLine();
				//level enum is reserved for future database use, will not used in stage one
				//stage one will pick the right table based on arraylist index (0-5 is easy  6-12 = mid  13-18 = hard)
				if (selector.charAt(0) == 'E') {
					level = Level.Easy;
				} else if (selector.charAt(0) == 'M') {
					level = Level.Midium;
				} else if (selector.charAt(0) == 'H') {
					level = Level.Hard;
				}

				// this for loop is to read each 9 lines from one block
				for (int x = 0; x < 9; x++) {
					line = sc.nextLine();
					// this loop aim to find each single space of the total 81 space of one question
					// block
					for (int y = 0; y < 9; y++) {
						int value = Character.getNumericValue(line.charAt(y));
						// System.out.println(value);
						
						if (value == 0) {
							newTable.setNumber(x, y, value, true);
						} else {
							newTable.setNumber(x, y, value, false);
						}
						newTable.setLevel(level);
					}
				}
				questionarray.add(newTable);
				
			}
			fr.close(); br.close();

			// test block
			// for (int i =0; i < questionarray.size(); i++) {
			// questionarray.get(i).printmyself();
			// }

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	private Object fr(File input2) {
		// TODO Auto-generated method stub
		return null;
	}

	public SudukuTable getList(int i) {
		return questionarray.get(i);
	}

	public void setFile(File input) {
		this.input = input;
	}

	// testing only

	// ReadList();
	// questionarray.get(0);

	// System.out.println();

}
