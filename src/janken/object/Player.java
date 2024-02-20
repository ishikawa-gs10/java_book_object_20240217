package janken.object;

import java.util.Random;

/*
 * じゃんけんのプレイヤーを表すクラス
 */
public class Player {
	// じゃんけんの手を表す定数
	final static int STONE = 0; // グー
	final static int SCISSORS = 1; // チョキ
	final static int PAPER = 2; // パー
	static int[] janken = { STONE, SCISSORS, PAPER };
	
	// フィールド
	private String name;	// 名前
	private int winCount = 0;	// プレイヤーの勝った回数
	
	// コンストラクタ
	public Player(String name) {
		this.name = name;
	}
	
	
	/*
	 * じゃんけんの手を出す
	 * 
	 * @return じゃんけんの手
	 */
	public int showHand() {
		Random rand = new Random();
		
		return janken[rand.nextInt(janken.length)];
	}
	
	/*
	 * 審判から勝敗を聞く
	 * 
	 * @param result true:勝ち, false:負け
	 */
	public void notifyResult(boolean result) {
		if(result) {
			// 勝った場合は勝ち数を加算する
			this.winCount++;
		}
	}
	
	/*
	 * 自分の勝った回数を答える
	 * 
	 * @return 勝った回数
	 */
	public int getWinCount() {
		return this.winCount;
	}

	/*
	 * 自分の名前を答える
	 * 
	 * @return 名前
	 */
	public String getName() {
		return this.name;
	}
}
