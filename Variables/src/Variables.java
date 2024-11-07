
public class Variables {

	public static void main(String[] args) {
        // 変数の定義
        int num1 = 34;           // 整数型
        double num2 = 0.1;      // 小数型
        
        // 共通化できる文字列を変数に格納
        String favoriteIntegerMessage = "私の好きな整数は";
        String favoriteDoubleMessage = "私の好きな小数は";

        // num1とnum2の値を出力
        System.out.println(num1);
        System.out.println(num2);

        // メッセージ付きで出力
        System.out.println(favoriteIntegerMessage + num1 + "です。");
        System.out.println(favoriteDoubleMessage + num2 + "です。");
    }
}
