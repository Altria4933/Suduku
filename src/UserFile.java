
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


public class UserFile {
	/*
	 * To change this license header, choose License Headers in Project Properties.
	 * To change this template file, choose Tools | Templates
	 * and open the template in the editor.
	 */
	/**
	 *
	 * @author ASUS
	 * @throws IOException 
	 */
	public void UserFile(Scanner sc,int numebr) throws IOException {
	  
	         HashMap<String,Integer> myMap=readRecords();
	         String name=null;
	         Integer score=0;
	         while(true)
	         {
	             System.out.println("Please enter the name: ");
	             name=Checkinput(sc,myMap);
	             if(myMap.containsKey(name))
	             {
	            	 score=myMap.get(name);
	                 System.out.println("The name "+name+"is exiting, do you wanna to add your score from last time? Enter'Y'to overwrite.");
	                 if(Checkinput(sc,myMap).trim().equalsIgnoreCase("Y"))
	                 {
	                	 score=score+numebr;
	                     myMap.put(name, score);
	                 }
	             }
	             else{
	                 myMap.put(name,numebr);
	             }
	         }
	         
	         
	     }
	     public static HashMap<String,Integer> readRecords() throws FileNotFoundException, IOException
	     {
	         HashMap<String,Integer> records=new HashMap();
	         BufferedReader br=new BufferedReader(new FileReader("Userfile.txt"));
	         try{
	             String line=null;
	         while((line=br.readLine())!=null)
	         {
	             String a[]=line.split(" ");
	             records.put(a[0], Integer.parseInt(a[1]));
	         }
	         }
	         finally {
	            if (br != null) {
	                  try {
	                      br.close();
	                      } catch(Exception ex){
	                             ex.printStackTrace();
	                                           }
	         }
	         }
	         return records;
	     }
	     public static void writetoFile(HashMap<String,Integer>records) throws FileNotFoundException
	     {
	          PrintWriter pw=new PrintWriter("Userfile.txt");
	        try{ 
	           
	         for(Map.Entry entry:records.entrySet())
	         {
	             pw.println(entry.getKey()+" "+entry.getValue());
	         }
	        }catch(Exception ex)
	        {
	            System.out.println("Invalid");
	        }
	        finally{
	            if(pw!=null)
	            {
	                pw.close();
	            }
	        }
	     }
	     
	     public static String Checkinput(Scanner sc,HashMap<String,Integer>records) throws FileNotFoundException
	     {
	         String s=sc.nextLine();
	         if(s.trim().equalsIgnoreCase("e"))
	         {
	             writetoFile(records);
	             System.out.println("Saved");
	             System.exit(0);
	         }
	         return s;
	     }
	    
	}


