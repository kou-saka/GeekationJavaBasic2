package basicSyntax;

public class IfSwitch {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
		int num = 17;
		
		if (num % 2 == 0) {
			System.out.println("2の倍数です。");
		} else if (num % 3 == 0) {
			System.out.println("3の倍数です。");
		} else {
			System.out.println("どちらでもありません。");
		};
		
		
		String pref = "東京";
		
		switch (pref) {
			case "北海":
				System.out.println("北海道");
				break;
			case "東京":
				System.out.println("東京都");
				break;
			case "京都":
				System.out.println("京都府");
				break;
			default:
				System.out.println("当てはまりません。");
		}
	}
}
