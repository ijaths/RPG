package monsters;

import bases.Monster;
import utils.Dice;

public class Slime extends Monster{
	
	// コンストラクタ
	public Slime(String name, String weapon) {
		super(name,weapon);
		super.setHp(Dice.get(70, 130));
		super.setOffensive(Dice.get(5,11));
		
	}

}
