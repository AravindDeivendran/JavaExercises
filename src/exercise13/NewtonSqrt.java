package exercise13;

public class NewtonSqrt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double c = Double.parseDouble(args[0]);
		double e = 1e-15;
		
		double t = c;
		
		while(Math.abs(t - c/t) > e * t)
		{
			t = (c/t + t) / 2.0;
		}
		System.out.println(t);
				
				
	}

}
