import java.io.File;
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
	File question = new File ("question.txt");
	File answer = new File ("answer.txt");
	
	
	public MainFunction () {
		tableList = new ArrayList<SudukuTable>();
		singleTable =  new SudukuTable();
		display = new printtable();
	}
	
	
	public void Checkanswer(SudukuTable userinput,SudukuTable answerlist)
    {
 	   for(int x=0;x<9;++x)
 	   {
 		   for(int y=0;y<9;++y)
 		   {
 			   if(userinput.getTable()[x][y].getValue()==answerlist.getTable()[x][y].getValue())
 			   {
 				   userinput.getTable()[x][y].setIs_true(true);
 			   }
 			   else
 			   {
 				   userinput.getTable()[x][y].setIs_true(false);
 			   }
 		   }
 	   }
    }

	
	public void TestFunction () {
		tableList = new ArrayList<SudukuTable>();
		singleTable =  new SudukuTable();
		display = new printtable();
	   FileIO questionIO = new FileIO();
	  questionIO.setFile(answer);
	questionIO.ReadList();
		
		singleTable = FileIO.getList(0);
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
