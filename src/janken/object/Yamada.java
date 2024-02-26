package janken.object;

/**
 * プレイヤーを継承したクラス
 */
public class Yamada extends Player {
	// コンストラクタ
	public Yamada(String name) {
		super(name);
	}
	
	@Override
	public int showHand() {
		return Player.PAPER;
	}
}
