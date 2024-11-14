
public class ForWhile {
	public static void main(String[] args) {
		String[] languages = { "Ruby", "Golang", "Java", "Python", "Typescript", "HTML", "Javascript" };

		for (int i = 1; i <= 100; i++) {

			String output = (i % 3 == 0 ? "Fizz" : "") + (i % 5 == 0 ? "Buzz" : "");
			System.out.println(output.isEmpty() ? i : output);

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