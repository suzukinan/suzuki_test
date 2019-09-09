package javaTest;
import java.util.Scanner;
public class Janken {

		public static void main(String[] args) {
			Scanner scan = new Scanner(System.in);

//			player1に選択させる
			System.out.println("player1 選択して下さい。");
			System.out.println("1:グー、2:チョキ、3:パー");
			int player1 = scan.nextInt();

//			player2に選択させる
			System.out.println("player2 選択して下さい。");
			System.out.println("1:グー、2:チョキ、3:パー");
			int player2 = scan.nextInt();

//			配列に入れる
			String[] jankens = {"","グー","チョキ","パー"};
			System.out.println(jankens[player1] + " VS " +jankens[player2]);

//			条件分岐
			if (player1 == player2) {
				System.out.println("あいこです");
			}else if ((player1 == 1 && player2 == 2) || (player1 == 2 && player2 == 3) || (player1 == 3 && player2 == 1)){
				System.out.println("player1の勝ちです");
				System.out.println("player2の負けです");
			}else {
				System.out.println("player1の負けです");
				System.out.println("player2の勝ちです");

			}

			scan.close();
		}

}
