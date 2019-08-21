import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class MainFunction {
	
	public ArrayList<SudukuTable> tableList;
	public SudukuTable singleTable;
	public printtable display;
	public Random randnom;
	Scanner scan = new Scanner (System.in);
	boolean gameOn = true;
	
	
	public MainFunction () {
		tableList = new ArrayList<SudukuTable>();
		singleTable =  new SudukuTable();
		display = new printtable();
	}
	
	public void TestFunction () {
		tableList = new ArrayList<SudukuTable>();
		singleTable =  new SudukuTable();
		display = new printtable();
		FileIO.ReadList();
		
		singleTable = FileIO.getList(9);
		display.updateTable(singleTable);
		display.display();
	
		
	}
	
	public static void main (String args[]) {
		MainFunction m = new MainFunction () ;
		m.TestFunction();
		//System.out.printf("|"+" \033[37m"+" %d",2);
		//System.out.println("\033[31;41mTEST\033[0m");
		//System.out.println("\033[37m"+ "123");
	}
	
	

}
