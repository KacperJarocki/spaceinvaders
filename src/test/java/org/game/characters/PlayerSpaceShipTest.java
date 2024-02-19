package org.game.characters;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PlayerSpaceShipTest {
	PlayerSpaceShip playerSpaceShip;
	@BeforeEach
	void setUp() {
		playerSpaceShip = new PlayerSpaceShip(100,50,50,100,"[A]");
	}
	@Test
	void moveRight() {
		playerSpaceShip.moveRight();
		assertEquals(51,playerSpaceShip.positionX);
	}

	@Test
	void moveLeft() {
		playerSpaceShip.moveLeft();
		assertEquals(49,playerSpaceShip.positionX);
	}
	@Test
	void draw() {
		playerSpaceShip.draw();
	}
}