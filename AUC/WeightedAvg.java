public class WeightedAvg {
	
	
	double findWeightedAvg(double lowerBound, double upperBound, double deltai)
	{
		AUCTest ob = new AUCTest();
		
		double weighted = 0;
		
		for (double i = lowerBound; i <= upperBound; i += 0.01)
		{
			weighted += Math.abs(i*ob.f(i)*deltai);
		}
		
		weighted /= (upperBound - lowerBound);
		
		return weighted;
	}
	
	public static void main (String[]args)
	{
		WeightedAvg ob = new WeightedAvg();
		
		System.out.println(ob.findWeightedAvg(-25, 25, 0.01));
	
	}
	
}
