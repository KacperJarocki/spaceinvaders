package org.game.spaceships;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SpaceShipTest {
	SpaceShip spaceShip;
	@BeforeEach
	void setUp() {
		spaceShip = new SpaceShip(10, 0);
	}
	@Test
	void positionX() {
		assertEquals(10, spaceShip.positionX());
	}

	@Test
	void positionY() {
		assertEquals(0, spaceShip.positionY());
	}

	@Test
	void getImage() {
		assertEquals("A", spaceShip.getImage());
	}

	@Test
	void moveRight() {
		spaceShip.moveRight();
		assertEquals(11, spaceShip.positionX());
	}

	@Test
	void moveLeft() {
		spaceShip.moveLeft();
		assertEquals(9, spaceShip.positionX());
	}
}