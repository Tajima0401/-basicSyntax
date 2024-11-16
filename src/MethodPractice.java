
public class MethodPractice {
    public static void main(String[] args) {

		int a = 1;
		int b = 2;

		int sum = add(a, b);
		printResult(sum);

		int difference = subtract(a, b);
		printResult(difference);

		int product = multiply(a, b);
		printResult(product);

		int quotient = divide(a, b);
		printResult(quotient);
	}

	public static int add(int a, int b) {
		return a + b;
	}

	public static int subtract(int a, int b) {
		return a - b;
	}

	public static int multiply(int a, int b) {
		return a * b;
	}

	public static int divide(int a, int b) {
		if (b != 0) {
			return a / b;
		} else {
			System.out.println("0で割ることはできません！");
			return 0;
		}
	}

	public static void printResult(int result) {
		System.out.println("計算結果は" + result + "です。");
	}
}
