package javaTest;
import java.util.Scanner;
public class Janken {

		public static void main(String[] args) {
			Scanner scan = new Scanner(System.in);

			System.out.println("player1 選択して下さい。");
			System.out.println("1:グー、2:チョキ、3:パー");
			int player1 = scan.nextInt();

			System.out.println("player2 選択して下さい。");
			System.out.println("1:グー、2:チョキ、3:パー");
			int player2 = scan.nextInt();

			if (player1 == player2) {
				System.out.println("あいこです");
			}else if ((player1 == 0 && player2 == 1) || (player1 == 1 && player2 == 2) || (player1 == 2 && player2 == 0)){
				System.out.println("player1の勝ちです");
				System.out.println("player2の負けです");
			}else {
				System.out.println("player1の負けです");
				System.out.println("player2の勝ちです");
			}

			scan.close();
		}

}
