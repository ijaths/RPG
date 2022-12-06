package bases;

import utils.Dice;

public abstract class Human extends Living{
	
	// コンストラクタ
	public Human(String name, String wepon) {
		// Livingクラスで定義したコンストラクタを利用する
		super(name, wepon);
	}
	
	// attackメソッドのオーバーライド
	@Override
	public void attack(Living target) {
		// 1から10までのサイコロを振り、自分の攻撃力とかけ合わせた値を相手に与えるダメージとする
		int Offensive = Dice.get(1, 10) * super.getOffensive();
		// 相手のHPをダメージ値だけ減らす
		target.setHp(target.getHp() - Offensive);
		// 自分の攻撃力を1だけ減らす
		super.setOffensive(super.getOffensive() - 1);
		// コンソールにステータスを表示
		System.out.println("\n「" + super.getName() + "」が「" + super.getWeapon() + "」で攻撃！「" + target.getName() + "」に" + Offensive + "のダメージを与えた。" );
		System.out.println("しかし自分の攻撃力も1減少した。");
	}

}
