package com.hero.skills.trigger;

import java.util.List;

import com.card.interfaces.ACard;
import com.hero.skills.interfaces.ISkill;
import com.logic.player.APlayer;

public class GuoJia_Talented implements ISkill{
	
	public void talented(APlayer player, ACard card)
	{
		player.getHands().add(card);
	}

	@Override
	public void use(APlayer operator, List<ACard> cards, List<APlayer> players) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean check(APlayer operator, List<ACard> cards,
			List<APlayer> players) {
		// TODO Auto-generated method stub
		return false;
	}
}
