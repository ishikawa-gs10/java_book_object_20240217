package janken.object;

public class Janken_Object {
	public static void main(String[] args) {
		Judge judge = new Judge();
		Player player1 = new Player("鈴木");
		Player player2 = new Player("田中");

		judge.startJanken(player1, player2);
	}
}
