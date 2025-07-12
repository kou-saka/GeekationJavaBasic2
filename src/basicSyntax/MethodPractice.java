package basicSyntax;

public class MethodPractice {

	public static void main(String[] args) {
        
        int a = 1;
        int b = 2;
		
        int result1 = add(a, b);
        int result2 = subtract(a, b);
        int result3 = multiply(a, b);
        int result4 = divide(a, b);
		
        showCaluculationResult(result1);
        showCaluculationResult(result2);
        showCaluculationResult(result3);
        showCaluculationResult(result4);		
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
	
    public static void showCaluculationResult(int result) {
        System.out.println("計算結果は" + result + "です。");
    }

}