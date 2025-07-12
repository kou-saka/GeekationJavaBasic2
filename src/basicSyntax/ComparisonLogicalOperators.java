package basicSyntax;

public class ComparisonLogicalOperators {

	public static void main(String[] args) {
		int a = 1;
		int b = 2;
		
		boolean result = (a < b);
		
		System.out.println(result);
		
		boolean isSunny = true;
		boolean isWarm = true;
		
		boolean andResultA = (isSunny && isWarm);
		
		System.out.println(andResultA);
		
		int x = 3;
		int y = 4;
		
		boolean andResultB = (x >= 0 && y % 2 == 0);
		
		System.out.println(andResultB);
		
		boolean hasPermission = false;
		
		System.out.println(!hasPermission);
	}

}