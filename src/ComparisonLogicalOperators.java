
public class ComparisonLogicalOperators {

	public static void main(String[] args) {

		int a = 10;
		int b = 5;
		if (a > b) {
			System.out.println(true);
		} else {
			System.out.println(false);
		}

		boolean isSunny = true;
		boolean isWarm = true;
		if (isSunny && isWarm) {
			System.out.println(true);
		} else {
			System.out.println(false);
		}
		
		int x = 5;
		int y = 4;
		if (x >= 0 && y % 2 == 0) {
			System.out.println(true);
		} else {
			System.out.println(false);
		}

		boolean hasPermission = false;
		if (!hasPermission) {
			System.out.println(true);
		} else {
			System.out.println(false);
		}
	}
}
