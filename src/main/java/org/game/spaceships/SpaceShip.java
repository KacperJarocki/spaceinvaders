package org.game.spaceships;

import org.game.interfaces.Drawable;
import org.game.interfaces.Movable;

public class SpaceShip implements Drawable, Movable {
	int x;
	int y;
	String image;
	public SpaceShip(int x,int y){
		this.x=x;
		this.y=y;
		this.image = "A";
	}

	@Override
	public int positionX() {
		return x;
	}

	@Override
	public int positionY() {
		return y;
	}

	@Override
	public String getImage() {
		return image;
	}

	@Override
	public void moveRight() {
		x++;
	}

	@Override
	public void moveLeft() {
		x--;
	}
}
