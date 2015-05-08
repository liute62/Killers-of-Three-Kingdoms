package com.ai.service;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

import com.card.interfaces.ACard;
import com.gui.gaming.BattleFieldPanel;
import com.logic.player.APlayer;
import com.logic.player.Player;
import com.system.enums.GameStage;
import com.system.utils.DebugUtil;
import com.system.utils.PlayerUtil;

public class AIAction {

	private APlayer player;
	private int castCardIndex;
	private List<ACard> availableCards;
	private APlayer target;
	public AIAction(APlayer player){
		this.setPlayer(player);
		player.setTargetPlayer(PlayerUtil.getInstance().getPlayers().get(0));
	}
	
	public void process(){
		
	}
	
	/**
	 * Draw card stage for AI. 
	 */
	public void drawCard(){
		player.setDrawCardNum(2);
		int num = player.getDrawCardNum();
		for (int i = 0; i < num; i++) {
			player.drawACard();	
		}
		if(player.getHands() == null){
			List<ACard> cards = new ArrayList<ACard>();
			player.setHands(cards);
		}
	}
	
	/**
	 * Cast card stage for AI.
	 * 1.get available card and randomly choose a card to use.
	 * 2.check the range of being used card, and get the available target.
	 * 3.there are 3 rule for choosing the target.
	 * 4.if AI's role is Monarch
	 * 5.if AI's role is
	 * 6.if AI's role is
	 * 7.then finish.
	 */
	public void castCard(){
		player.gameStage = GameStage.castCard;
		List<ACard> cards = player.getAvailableCards(player.getHands());
		setAvailableCards(cards);
		player.setBeingUsedCard(cards.get(castCardIndex));
		//choose the available target
		APlayer target = new Player();
		target.setPosition(1);
		setTarget(target);
		BattleFieldPanel.Instance().addACard(player, cards.get(0));
	}
	
	/**
	 * Drop card stage for AI
	 */
	public void dropCard(){
		int num = player.getDiscardNum();
		List<ACard> tmp = new ArrayList<ACard>();
		for (int i = 0; i < num; i++) {
			tmp.add(player.getHands().get(i));
		}
		player.getHands().removeAll(tmp);
	}

	public APlayer getPlayer() {
		return player;
	}

	public void setPlayer(APlayer player) {
		this.player = player;
	}


	public void setCastCardIndex(int castCardIndex) {
		this.castCardIndex = castCardIndex;
	}


	public void setAvailableCards(List<ACard> availableCards) {
		this.availableCards = availableCards;
	}

	public APlayer getTarget() {
		return target;
	}

	public void setTarget(APlayer target) {
		this.target = target;
	}
}
