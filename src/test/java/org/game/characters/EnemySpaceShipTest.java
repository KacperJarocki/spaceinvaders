package org.game.characters;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EnemySpaceShipTest {
	EnemySpaceShip enemySpaceShip;
	@BeforeEach
	void setUp() {
		enemySpaceShip = new EnemySpaceShip(100,50,50,100,"[=]");
	}

	@Test
	void moveRight() {
		enemySpaceShip.moveRight();
		assertEquals(51,enemySpaceShip.positionX);
	}

	@Test
	void moveLeft() {
		enemySpaceShip.moveLeft();
		assertEquals(49,enemySpaceShip.positionX);
	}
	@Test
	void getDrawParametersShouldNotBeNull() {
		assertNotEquals(null,enemySpaceShip.getDrawParameters());
	}
	@Test
	void whenHitLifeShouldDecrease() {
		enemySpaceShip.hit();
		assertEquals(99,enemySpaceShip.life);
	}
}