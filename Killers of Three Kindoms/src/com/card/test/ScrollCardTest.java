package com.card.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.card.scroll.PeachGarden;
import com.logic.player.APlayer;
import com.logic.player.Player;

public class ScrollCardTest {
	Player p1,p2,p3,p4,p5;
	List<APlayer> targetPlayers;
	
	private List<Integer> list(Integer...integers) {
        return Arrays.asList(integers);
    }

	@Before
	public void playerInitialize()
	{
		this.p1 = new Player();
		this.p2 = new Player();
		this.p3 = new Player();
		this.p4 = new Player();
		this.p5 = new Player();
		this.targetPlayers = new ArrayList<APlayer>();
	}
	@Test
	public void testPeachGardenRecover1HealthForEachPlayer()
	{	
		p1.setCurrentHP(2);
		p2.setCurrentHP(3);
		p3.setCurrentHP(4);
		
		targetPlayers.add(p1);
		targetPlayers.add(p2);
		targetPlayers.add(p3);
		
		PeachGarden target = new PeachGarden();
		
		target.use(p1, targetPlayers);
		Assert.assertEquals(3,targetPlayers.get(0).getCurrentHP());
		Assert.assertEquals(4, targetPlayers.get(1).getCurrentHP());
		Assert.assertEquals(5, targetPlayers.get(2).getCurrentHP());
	}
}
