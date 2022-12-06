package bases;

import utils.Dice;

public abstract class Monster extends Living {
	
	// コンストラクタ
	public Monster(String name, String weapon) {
		// Livingクラスで定義したコンストラクタを利用する
		super(name, weapon);
	}

	// Livingクラスで定義したコンストラクタを利用する
	@Override
	public void attack(Living target) {
		// 1から10までのサイコロを振り、自分の攻撃力とかけ合わせた値を相手に与えるダメージとする
		int Offensive = Dice.get(1, 10) * super.getOffensive();
		// 相手のHPをダメージ値だけ減らす
		target.setHp(target.getHp() - Offensive);
		// コンソールにステータスを表示
		System.out.println("\n「" + super.getName() + "」が「" + super.getWeapon() + "」で攻撃！「" + target.getName() + "」に" + Offensive + "のダメージを与えた。");
	}

}
