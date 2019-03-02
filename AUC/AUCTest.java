public class AUCTest {
	
	double f (double x)
	{
		return (Math.pow(Math.E, -1*(x*x)));
	}
	
	double findArea(double lowerBound, double upperBound, double deltai)
	{
		double area = 0;
		
		for (double i = lowerBound; i <= upperBound; i += deltai)
		{
			area += f(i)*deltai;
		}
		
		return(area);
	}
	
	public static void main (String[]args)
	{
		AUCTest ob = new AUCTest();
		System.out.println(ob.findArea(-25, 25, 0.01));
	}
	
}
