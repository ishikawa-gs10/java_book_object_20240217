package janken;

import java.util.Random;

public class Janken_Simple2 {
	// じゃんけんの手を表す定数
	final static int STONE = 0; // グー
	final static int SCISSORS = 1; // チョキ
	final static int PAPER = 2; // パー
	static int[] janken = { STONE, SCISSORS, PAPER };
	static int player1Win = 0; // プレイヤー1の勝利数
	static int player2Win = 0; // プレイヤー2の勝利数
	static int gameCount = 0; // じゃんけんをした回数

	public static void main(String[] args) {
		final int GAME_NUM = 3; // じゃんけんの勝負する回数
		Random rand = new Random();

		System.out.println("じゃんけん開始");

		while (gameCount < GAME_NUM) {
			System.out.println((gameCount + 1) + "回目の勝負");
			// プレイヤー1の手を決める
			int player1Hand = janken[rand.nextInt(janken.length)];
			System.out.print("プレイヤー1の手は");
			printHand(player1Hand);

			// プレイヤー2の手を決める
			int player2Hand = janken[rand.nextInt(janken.length)];
			System.out.print("プレイヤー2の手は");
			printHand(player2Hand);

			// じゃんけんの判定
			judgeGame(player1Hand, player2Hand);
		}

		// 勝敗数でどちらが勝ったか判定
		judgePlayerWin();
	}

	public static void judgePlayerWin() {
	    System.out.printf("プレイヤー1: %d 対 プレイヤー2: %d で\n", player1Win, player2Win);

		if (player1Win == player2Win) {
			System.out.println("引き分けです");
		} else if (player1Win < player2Win) {
			System.out.println("プレイヤー2の勝利");
		} else {
			System.out.println("プレイヤー1の勝利");
		}
	}

	public static void judgeGame(int player1Hand, int player2Hand) {
		if (player1Hand == player2Hand) {
			System.out.println("あいこ");
		} else if ((player1Hand + 1) % 3 == player2Hand) {
			System.out.println("プレイヤー1の勝利");
			player1Win++;
		} else {
			System.out.println("プレイヤー2の勝利");
			player2Win++;
		}
		gameCount++;
	}

	public static void printHand(int hand) {
		switch (hand) {
		case 0:
			System.out.println("グー");
			break;
		case 1:
			System.out.println("チョキ");
			break;
		case 2:
			System.out.println("パー");
			break;
		default:
			break;
		}
	}
}
