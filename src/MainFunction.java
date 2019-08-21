import java.io.File;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class MainFunction {

	public ArrayList<SudukuTable> tableList;
	public SudukuTable singleTable;
	//public SudukuTable answerTable;
	public printtable display;
	public Random random;
	public int rand;
	Scanner scan = new Scanner(System.in);
	boolean gameOn = true;
	FileIO mainIO;
	//FileIO answerIO;
	File question = new File("question.txt");
	//File answer = new File("answer.txt");

	public MainFunction() {
		tableList = new ArrayList<SudukuTable>();
		singleTable = new SudukuTable();
		//answerTable = new SudukuTable();
		display = new printtable();
		mainIO = new FileIO();
		//answerIO = new FileIO();
		mainIO.setFile(question);
		//answerIO.setFile(answer);
//load file to arraylist to both question and answer io class
		mainIO.ReadList();
		//answerIO.ReadList();

		greeting();
		// insert user level here
		levelPicker();

		display.updateTable(singleTable);
		display.display();
		System.out.println(rand);

	}

	public void Checkanswer(SudukuTable userinput, SudukuTable answerlist) {
		for (int x = 0; x < 9; ++x) {
			for (int y = 0; y < 9; ++y) {
				if (userinput.getTable()[x][y].getValue() == answerlist.getTable()[x][y].getValue()) {
					userinput.getTable()[x][y].setIs_true(true);
				} else {
					userinput.getTable()[x][y].setIs_true(false);
				}
			}
		}
	}

	public String greeting() {
		return "Welcome to Sudoku game! ";
	}

	public void levelPicker() {
		
		boolean rightInput = false;
		int picker = 0;

		while (!rightInput) {
			System.out.println("Please choose your game level!" + "\nEasy, Midium or Hard \nenter 'Help' for more info.");
			String choise = scan.nextLine();
			switch (choise.toLowerCase()) {
			case "easy": {
				rightInput = true;
				picker = 1;
				break;
			}

			case "midium": {
				rightInput = true;
				picker = 2;
				break;
			}

			case "hard": {
				rightInput = true;
				picker = 3;
				break;
			}

			case "help": {
				System.out.println(Help.level_pick());
				break;
			}

			default:
				System.out.println("Invalid input, please try again!/n");
				break;

			}
		}
		singleTable = tablePicker(picker);

	}

	public SudukuTable tablePicker(int i) {
		random = new Random();
		rand = 0;
		// in the arrayList we read from the file. first 6 block are easy questions, and
		// the next 6 are mid and the next 6 are hard
		// therefore index 0-5 will stand for ez question and 6-11 for mid 12-17 for
		// hard.
		// this method will generate a random number regarding to the level user picked
		// and get a question using the number generated
		switch (i) {
		case 1: {
			
			rand = random.nextInt(6);
			System.out.println(rand);
			break;
		}
		case 2: {
			rand = (random.nextInt(12 - 6) + 6);
			System.out.println(rand);
			break;
		}
		case 3: {
			rand = (random.nextInt(18 - 12) + 12);
			System.out.println(rand);
			break;

		}

		}

		return mainIO.getList(rand);

	}

	// -------------------------------------------------------Test
	// Block----------------------------------------------------

	public void TestFunction() {
		tableList = new ArrayList<SudukuTable>();
		singleTable = new SudukuTable();
		display = new printtable();
		FileIO questionIO = new FileIO();
		questionIO.setFile(answer);
		questionIO.ReadList();

		singleTable = questionIO.getList(0);
		// System.out.println(singleTable.getTable()[4][4].getValue());
		// System.out.println(singleTable.getTable()[5][4].getValue());
		display.updateTable(singleTable);
		display.display();

	}

	public static void main(String args[]) {
		MainFunction m = new MainFunction();

		// m.TestFunction();
		// System.out.printf("|"+" \033[37m"+" %d",2);
		// System.out.println("\033[31;41mTEST\033[0m");
		// System.out.println("\033[37m"+ "123");

	}

}
