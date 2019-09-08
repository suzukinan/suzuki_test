package javaTest;
import java.util.Scanner;
public class Test1 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner scan = new Scanner(System.in);

        // 以下は問題１
//		int a = scan.nextInt();
//		int b = scan.nextInt();
//		int c =  a + b;
//		System.out.println("a+b=" + c + "です");
//		c = c + 1;
//		System.out.println("c+1=" + c + "です");



		// 以下は問題２
		int nenrei = scan.nextInt();
		int kakaku = 0;

		if (nenrei == 0) {
			kakaku = 100;

		}else {
			kakaku = 500;
		}
		System.out.println("年齢が" + nenrei + "歳のとき価格は" + kakaku + "円です。");



		scan.close();
	}
}