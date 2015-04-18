package exercise13;

public class Harmonic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int val1 = Integer.parseInt(args[0]);
		double sum = 0.0;
		
		for (int i = 1; i <= val1; i++) {
			sum  += (1.0/i);
		}
		
		System.out.println(sum);
	}

}
