class findSunday{
public static void main(String args[]) {

    Calendar startDateCal = createDateInstance(0,1901,1);
    Calendar endDateCal = createDateInstance(11,2000,13);

    checkSundays(startDate, endDate);
}

public static Date createDateInstance(int month, int year, int date){
  Calendar cal= Calendar.getInstance();
  cal.set(Calendar.YEAR, year);
  cal.set(Calendar.MONTH, month);
  cal.set(Calendar.DATE, date);

  return cal.getTime();

}

private static void checkSundays(Calendar start, Calendar end) 
{
    int dayNum;

    Calendar startDate = Calendar.getInstance();
    startDate.setTime(start);
    System.out.println(startDate.getTime());

    Calendar endDate = Calendar.getInstance();
    endDate.setTime(end);
    System.out.println(endDate.getTime());
    int count = 0;

    while (startDate.before(endDate)) {
        for (int i = 1; i < 13; i++) {
            dayNum = startDate.get(Calendar.DAY_OF_WEEK);
            if (dayNum == 1) {
                count++;
            }

            System.out.println(startDate.getTime());
            startDate.add(Calendar.MONTH, 1);

        }
            System.out.println("Count " + count);

    }
}
}