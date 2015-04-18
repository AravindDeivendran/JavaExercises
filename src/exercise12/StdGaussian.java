package exercise12;

public class StdGaussian {

	public static void main(String args[])
	{
		double v = Math.random();
		double u = Math.random();
		
		double w = 0.0;
		
		w = Math.sin(2 * Math.PI * v) * Math.pow(-2 * Math.log(u), 0.5);
		System.out.println("Randomw no = " + w);
		
	}
	
}
