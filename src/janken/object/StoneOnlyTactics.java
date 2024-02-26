package janken.object;

/**
 * 「グーのみ出す」戦略クラス
 */
public class StoneOnlyTactics implements Tactics {
	/**
	 * 戦略を読み、じゃんけんの手を得る。
	 * 
	 * @return じゃんけんの手
	 */
	public int readTactics() {
		return Player.STONE;
	}
}
