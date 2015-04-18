package exercise12;

import java.util.Random;

public class Problem19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int val1 = Integer.parseInt(args[0]);
		int val2 = Integer.parseInt(args[1]);
		
		for (int i = 0; i < 10; i++) {
			System.out.println((int)(val1 + Math.random() * (val2 - val1)));
		}
		
		 
	}

}
