package janken.object;

/**
 * じぇんけん戦略インタフェース
 */
public interface Tactics {
	/**
	 * 戦略を読み、じゃんけんの手を得る。
	 * グー・チョキ・パーのいずれかをPlayerクラスに定義された
	 * 以下の定数で返す
	 * Player.STONE = 0; // グー
	 * Player.SCISSORS = 1; // チョキ
	 * Player.PAPER = 2; // パー
	 * 
	 * @return じゃんけんの手
	 */
	public int readTactics();
}
