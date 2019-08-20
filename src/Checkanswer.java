
public class Checkanswer {
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
}
