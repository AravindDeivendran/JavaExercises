package exercise12;

import java.awt.print.Printable;

public class ThreeSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int val1 = Integer.parseInt(args[0]);
		int val2 = Integer.parseInt(args[1]);
		int val3 = Integer.parseInt(args[2]);
		
		int min = Math.min(val1,Math.min(val2,val3));
		int max = Math.max(val1,Math.max(val2,val3));
		
		System.out.println(min + " " + (val1 + val2 + val3 - min - max) + " " + max); 
	}

}
