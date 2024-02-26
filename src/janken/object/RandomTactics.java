package janken.object;

import java.util.Random;

/**
 * ランダムに手を決める戦略クラス
 */
public class RandomTactics implements Tactics {
	/**
	 * 戦略を読み、じゃんけんの手を得る。
	 * 
	 * @return じゃんけんの手
	 */
	public int readTactics() {
		Random rand = new Random();
		
		return Player.jankenList[rand.nextInt(Player.jankenList.length)];
	}
}
