
public class ForWhile {
	public static void main(String[] args) {
		System.out.println("== 実装その1 ==");
		for (int i = 1; i <= 100; i++) {
			String output = "";

			if (i % 3 == 0)
				output += "Fizz";
			if (i % 5 == 0)
				output += "Buzz";

			if (output.isEmpty()) {
				System.out.println(i);
			} else {
				System.out.println(output);
			}
		}

		System.out.println("\n== 実装その2 ==");
		String[] languages = { "Ruby", "Golang", "Java", "Python", "Typescript", "HTML", "Javascript" };

		for (int i = 1; i <= 100; i++) {
			String language = languages[(i - 1) % languages.length];

			switch (language) {
			case "Java":
				System.out.println("現在学習中の言語はJavaです。");
				continue;
			case "HTML":
				System.out.println("HTMLはプログラミング言語ではありません。");
				return;
			default:
				System.out.println(language);
			}
		}
	}
}