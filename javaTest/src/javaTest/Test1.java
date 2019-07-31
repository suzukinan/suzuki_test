package javaTest;
import java.util.Scanner;
public class Test1 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner scan = new Scanner(System.in);

		String a = scan.next();
		String b = scan.next();
		String c =  a + b;
		System.out.println("a+b"+ c +"です");
		c = c + 1;
		System.out.println("c+1=" + c + "です");

		scan.close();
	}
}