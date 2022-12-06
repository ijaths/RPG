package monsters;

import bases.Monster;
import utils.Dice;

public class Dragon extends Monster{

	// コンストラクタ
	public Dragon(String name, String weapon) {
		super(name,weapon);
		super.setHp(Dice.get(270, 330));
		super.setOffensive(Dice.get(12,18));
		
	}
}
