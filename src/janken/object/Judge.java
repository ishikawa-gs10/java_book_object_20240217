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
		System.out.println("じゃんけん開始");
		
		for (int i = 0; i < GAME_NUM; i++) {
			System.out.println((i + 1) + "回目の勝負");
			
			// じゃんけんの判定
			Player winner = judgeGame(player1, player2);
			
			if (winner != null) {
				// 勝者を表示する
				System.out.println("\n" + winner.getName() + "が勝ちました！\n");
				
				// 勝ったプレイヤーへ結果を伝える
				
			}
		}
	}

}
