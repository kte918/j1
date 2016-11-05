class leapYearDetermine 
{

int year = 0;

void setYear(int y)
{
year = y;	
}

void leapYearDetermine()
{
	if((year%4==0) && (year%100!=0) || (year % 400 == 0))
	{
		System.out.println(year+" is a leap year");
	} else {
		System.out.println(year+" isn't a leap year");
	} 
}
}