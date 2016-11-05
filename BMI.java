class BMI{
	double weight = 0;
	double height = 0;

	void setWeight(double w)
	{
	weight = w;
	}
	
	void setHeight(double h)
	{
	height = (h/100);
	}

	void determineBmi()
	{
	double bmi = weight/height/height;
	if(bmi<=18.5)
	{
		System.out.println("Low");
	} else if (18.5 <= bmi && bmi < 23){
		System.out.println("normal");
	} else if (23 <= bmi && bmi < 25){
		System.out.println("risky");
	} else if (25 <= bmi && bmi < 30){
		System.out.println("obesity 1");
	} else if (30 <= bmi && bmi < 40){
		System.out.println("obesity 2");
	} else if (bmi >= 40){
		System.out.println("obesity 3");
	} else {
		System.out.println("error");
	}
	}
}