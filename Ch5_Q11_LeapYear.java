public class Ch5_Q11_LeapYear{ 
    void checkYear(int y){ 
       if(((y%4==0)&&(y%100!=0))||(y%400==0)){ 
          System.out.printf("%s is Leap Year\n",y); 
       } 
       else{ 
          System.out.printf("%s is not Leap Year\n",y);
       } 
    } 
    public static void main(String[] args){ 
       Ch5_Q11_LeapYear l = new Ch5_Q11_LeapYear(); 
       int[] years={2000,2002,2005,1902,2016,2009,1995,1995,2010,2017};
       for(int i:years){ 
          l.checkYear(i); 
       }  
	}
}	