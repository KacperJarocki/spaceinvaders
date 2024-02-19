package org.game.characters;

import org.game.interfaces.Drawable;
import org.game.interfaces.Movable;

public class PlayerSpaceShip extends SpaceShip implements Movable, Drawable {
	PlayerSpaceShip(int life, int positionX, int positionY, int speed, String appearance) {
		this.life = life;
		this.positionX = positionX;
		this.positionY = positionY;
		this.speed = speed;
		this.appearance = appearance;
	}

	@Override
	public void moveRight() {
		positionX++;
	}

	@Override
	public void moveLeft() {
		positionX--;
	}
	@Override
	public void draw() {

	}
}
