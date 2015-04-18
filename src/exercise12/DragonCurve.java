package exercise12;

public class DragonCurve {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			System.out.println(printCurve(4));

		
	}
	private static String printCurve(int number)
	{
		String recPrintCurve = "";
		if (number == 0)
		{
			return "F";
		}
		else
		{
			recPrintCurve = printCurve(number-1);
			
			//revPrintCurve = new StringBuilder(recPrintCurve).reverse().toString();
			//System.out.println(revPrintCurve);
			return recPrintCurve + "L" + revCurve(recPrintCurve);
		}
	}
	private static String revCurve(String curve)
	{
		String retString = "";
		String curchar = "";
		for (int i = curve.length() - 1; i >= 0 ; i--) {
			curchar = curve.substring(i, i+1);

			if (curchar.equals("L"))
				retString = retString + "R";
			else if (curchar.equals("R"))
			{
				retString = retString + "L";
			}
			else
				retString = retString + curchar; 
		}
		return retString;
				
				
			
		
	}

}
