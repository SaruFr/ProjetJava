package frog;

import gameCommons.Game;
import gameCommons.IFrog;
import graphicalElements.Element;
import util.Case;
import util.Direction;

import java.awt.event.KeyEvent;

public class Frog implements IFrog {

	private Game game;
	private Case maPosition;
	private Direction maDirection;

	public Frog(Game game) {
		this.game = game;
		this.maPosition = new Case(12,0);

	}


	@Override
	public Case getPosition() {

		return maPosition;
	}

	@Override
	public Direction getDirection() {
		return maDirection;
	}

	@Override
	public void move(Direction key) {
		maDirection = key;
		switch (key) {
			case up:
				if(maPosition.ord < 19)
				{
					maPosition = new Case(maPosition.absc,maPosition.ord + 1);
				}
				break;
			case down:
				if(maPosition.ord > 0)
				{
					maPosition = new Case(maPosition.absc,maPosition.ord - 1);
				}
				break;
			case left:
				if(maPosition.absc > 0)
				{
					maPosition = new Case(maPosition.absc - 1,maPosition.ord);
				}
				break;
			case right:
				if(maPosition.absc < 25)
				{
					maPosition = new Case(maPosition.absc + 1,maPosition.ord);
				}
		}

	}
}
