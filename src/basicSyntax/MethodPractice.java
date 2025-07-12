package basicSyntax;

public class MethodPractice {

	public static void main(String[] args) {
		int a = 1;
		int b = 2;
		
		int result1 = add(a, b);
		int result2 = subtract(a, b);
		int result3 = multiply(a, b);
		int result4 = divide(a, b);
		
		caluculationResult(result1);
		caluculationResult(result2);
		caluculationResult(result3);
		caluculationResult(result4);		
	}
	
	public static int add(int x, int y) {
		return x + y;
	}
	
	public static int subtract(int x, int y) {
		return x - y;
	}
	
	public static int multiply(int x, int y) {
		return x * y;
	}
	
	public static int divide(int x, int y) {
		return x / y;
	}
	
	public static void caluculationResult(int result) {
		System.out.println("計算結果は" + result + "です。");
	}

}