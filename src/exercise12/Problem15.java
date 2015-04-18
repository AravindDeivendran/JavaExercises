package exercise12;

public class Problem15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int val1 = Integer.parseInt(args[0]);
		int val2 = Integer.parseInt(args[1]);
		int val3 = Integer.parseInt(args[2]);
		
		if ((val1 + val2 >= val3) && (val2 + val3 >= val1) && (val1 + val3 >= val2))
		{
			System.out.println("true");
		}
		else
		{
			System.out.println("false");
		}
	}

}
