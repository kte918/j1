class Temperature {

double t = 0;

Temperature(double t)
{
this.t = t;
}

void TransferF()
{
double resultF = (t-32d)/1.8d;
System.out.println("Result is "+resultF);
}

void TransferC()
{
double resultC = (t*1.8d)+32d;
System.out.println("Result is "+resultC);
}

public static void main(String[] args)
{
Temperature t = new Temperature(30);
System.out.println("Celsius 30 will be converted to Fahrenheit");
t.TransferC();
System.out.println("Fahrenheit 30 will be converted Celsius");
t.TransferF();
}
}