package org.game.characters;

import org.game.interfaces.Drawable;
import org.game.interfaces.Hittable;
import org.game.interfaces.Movable;

abstract class SpaceShip implements Movable, Drawable, Hittable {
	int life;
	int positionX;
	int positionY;
	int speed;
	String appearance;



}
