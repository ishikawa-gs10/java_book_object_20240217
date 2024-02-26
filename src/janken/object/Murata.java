package janken.object;

/**
 * プレイヤーを継承したクラス
 */
public class Murata extends Player {
	// コンストラクタ
	public Murata(String name) {
		super(name);
	}
	
	@Override
	public int showHand() {
		return Player.STONE;
	}
}
