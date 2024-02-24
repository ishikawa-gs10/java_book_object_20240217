package janken.object;

/*
 * じゃんけんの審判を表すクラス
 */
public class Judge {
	final int GAME_NUM = 3; // じゃんけんの勝負する回数

	/*
	 * じゃんけんを開始する
	 * 
	 * @param player1 判定対象プレイヤー1
	 * @param player1 判定対象プレイヤー2
	 */
	public void startJanken(Player player1, Player player2) {
		System.out.println("【じゃんけん開始】\n");

		for (int i = 0; i < GAME_NUM; i++) {
			System.out.println((i + 1) + "回目の勝負");

			// じゃんけんの判定
			Player winner = judgeJanken(player1, player2);

			if (winner != null) {
				// 勝者を表示する
				System.out.println(winner.getName() + "が勝ちました！\n");

				// 勝ったプレイヤーへ結果を伝える
				winner.notifyResult(true);
			} else {
				// 引き分けの場合
				System.out.println("引き分けです！\n");
			}
		}

		System.out.println("【じゃんけん終了】");

		// 最終的な勝者を判定する
		Player finalWinner = judgeFinalWinner(player1, player2);

		// 結果の表示
		System.out.print(player1.getWinCount() + "対" + player2.getWinCount() + "で");

		if (finalWinner != null) {
			System.out.println(finalWinner.getName() + "の勝ちです！　\n");
		} else {
			System.out.println("引き分けです！\n");
		}
	}

	/*
	 * 「じゃんけんぽん！」と声をかけ、プレイヤーの手を見て、どちらが勝ちかを判定する。
	 * 
	 * @param player1 判定対象プレイヤー1
	 * @param player2 判定対象プレイヤー2
	 * @return 勝ったプレイヤー。引き分けの場合はnullを返す。
	 */
	private Player judgeJanken(Player player1, Player player2) {
		Player winner = null;
		
		// プレイヤー1の手をだす
		int player1Hand = player1.showHand();
		
		// プレイヤー2の手をだす
		int player2Hand = player2.showHand();
		
		// それぞれの手を表示する
		printHand(player1Hand);
		System.out.print(" vs. ");
		printHand(player2Hand);
		System.out.print("\n");
		
		if ((player1Hand + 1) % 3 == player2Hand) {
			// プレイヤー1が勝つ場合
			winner = player1;
		} else if (player1Hand != player2Hand) {
			// プレイヤー2が勝つ場合
			winner = player2;
		}
		
		// どちらでもない場合は引き分け（nullを返す）
		return winner;
	}
	
	/*
	 * 最終的な勝者を判定する
	 * 
	 * @param player1 判定対象プレイヤー1
	 * @param player2 判定対象プレイヤー2
	 * @return 勝ったプレイヤー。引き分けの場合はnullを返す。
	 */
	private Player judgeFinalWinner(Player player1, Player player2) {
		Player winner = null;
		
		// Player1から勝ち数を聞く
		int player1WinCount = player1.getWinCount();
		
		// Player2から勝ち数を聞く
		int player2WinCount = player2.getWinCount();
		
		if (player1WinCount > player2WinCount) {
			// プレイヤー1の勝ち
			winner = player1;
		} else if (player1WinCount < player2WinCount) {
			// プレイヤー2の勝ち
			winner = player2;
		} 
		
		// どちらでもない場合は引き分け（nullを返す）
		return winner;
	}
	
	/*
	 * じゃんけんの手を表示する
	 * 
	 * @param hand じゃんけんの手
	 */
	private void printHand(int hand) {
		switch (hand) {
		case 0:
			System.out.print("グー");
			break;
		case 1:
			System.out.print("チョキ");
			break;
		case 2:
			System.out.print("パー");
			break;
		default:
			break;
		}
	}
}
