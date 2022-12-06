package monsters;

import bases.Monster;
import utils.Dice;

public class Oak extends Monster{

	// コンストラクタ
	public Oak(String name, String weapon) {
		super(name,weapon);
		super.setHp(Dice.get(170, 230));
		super.setOffensive(Dice.get(9,15));
		
	}

}
