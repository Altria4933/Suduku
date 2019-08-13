import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Scanner;

public class FileIO {
	
	
	public void ReadList () {
	try {
		Scanner sc = new Scanner(new BufferedReader(new FileReader("SudukuList.txt")));
		
		
	} catch (Exception e) {
		System.out.println("io error");
	}
	 
	}

}
