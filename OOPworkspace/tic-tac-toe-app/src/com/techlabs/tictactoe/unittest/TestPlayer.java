package com.techlabs.tictactoe.unittest;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

import com.techlabs.tictactoe.MarkType;
import com.techlabs.tictactoe.Player;

public class TestPlayer {
	
	@Test
	public void shouldBeSettingPlayerMarkWithX() {
		Player player = new Player("ABC",MarkType.X);
		MarkType actual = player.getMark();
		MarkType expected = MarkType.X;
		assertEquals(actual,expected);
	}
}
