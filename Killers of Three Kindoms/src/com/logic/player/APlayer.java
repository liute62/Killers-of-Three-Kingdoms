package com.logic.player;



import java.util.List;

import com.card.interfaces.ACard;
import com.logic.interfaces.IPlayer;

public abstract class APlayer implements IPlayer{

	 protected int currentHP;
	 
	 /****
	  * To get a list of cards which can be used in the player's turn.
	  * @param player the player
	  * @param cards  the player's card
	  * @return a list of card the player can use
	  * @author liuh4
	  */
	 protected List<ACard> getAvailableCards(APlayer player,List<ACard> cards) {
		return null;
	}
}
