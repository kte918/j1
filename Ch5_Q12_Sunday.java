import java.util.Calendar;
 
public class Ch5_Q12_Sunday{ 
  void countSunday(){ 
    int sunday = 0; 
    Calendar c = Calendar.getInstance(); 
    for(int y=1901; y<=2000; y++){ 
      for(int m=0; m<12; m++){ 
        c.set(y,m,1); 
        if(c.get(Calendar.DAY_OF_WEEK)==1){ 
          sunday=sunday+1; 
        } 
      } 
    } 
    System.out.println("Sunday's number 1901.01.01 to 2000.12.31 : "+sunday); 
  } 
  public static void main(String[] asrgs){ 
    Ch5_Q12_Sunday coun = new Ch5_Q12_Sunday(); 
    coun.countSunday(); 
  } 
 } 