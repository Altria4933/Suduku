

public class printtable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         System.out.println("---------------------------------------------------------------");
         System.out.printf("  ");
         for(int colums=1;colums<=3;++colums)
         {
        	 System.out.printf(" ,  %d  ,  %d  ,  %d  ",colums*3-2,colums*3-1,colums*3);
         }
         
         System.out.printf(",\n");
         for(int a=0;a<19;++a)
         {
        	
        	 if(a%6==0)
        	 {
        		 System.out.printf("  +");
        		 for(int b=0;b<3;++b)
        		 {
        			 System.out.printf("+=====+=====+=====+");
        		 }
        		 System.out.printf("+");
            	 System.out.printf("\n");
        	 }
        	 else if(a%2!=0)
        		 {
        			 System.out.printf("%d",a/2+1);
        			 System.out.printf(" |");
        			 for(int index=0;index<3;++index)
        			 {
        				 System.out.printf("|  %d  |  %d  |  %d  |",index,index,index);
        			 }
        			 System.out.printf("|");
        			 System.out.printf("\n");
        			 
        		 }
            else
                 {
                     System.out.print("  +");
                     for(int index =0; index < 3; index++)
                     {
                         System.out.print("+-----+-----+-----+");
                     }
                     System.out.println("+");
                 }
         }
         System.out.println("---------------------------------------------------------------");
	}

}
