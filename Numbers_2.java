class Numbers_2
{
	public static void main(String[] args) 
	{
	int i = 0;
	int count = 0;
	while(i<101)
	{
		if(i%4==0 && i%5!=0)
		{
			count++;
		}
		i++;
	}

	int [] list = new int[count];

	int j = 0;
	int count2 = 0;
	while(j<101)
	{
		if(j%4==0 && j%5!=0)
		{
		list[count2] = j;
		count2++;
		}
		j++;
	}

	int sum = 0;
	for(i=0;i<count;i++)
	{
	System.out.println(list[i]);
	sum = sum + list[i];
	}
	System.out.println("Total sum is "+sum);
	}
}
