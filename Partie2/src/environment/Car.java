package environment;

import java.awt.Color;

import gameCommons.Game;
import graphicalElements.Element;
import util.Direction;
import util.Case;

public class Car {
	private Game game;
	private Case leftPosition;
	private boolean leftToRight;
	private int length;
	private final Color colorLtR = Color.BLACK;
	private final Color colorRtL = Color.BLUE;

	public Car(Game inGame,Case inCase,boolean isLeftToRight){
		game = inGame;
		leftPosition = inCase;
		leftToRight = isLeftToRight;
	}
	
	//TODO : ajout de methodes


	
	/* Fourni : addToGraphics() permettant d'ajouter un element graphique correspondant a la voiture*/
	private void addToGraphics() {
		for (int i = 0; i < length; i++) {
			Color color = colorRtL;
			if (this.leftToRight){
				color = colorLtR;
			}
			game.getGraphic()
					.add(new Element(leftPosition.absc + i, leftPosition.ord, color));
		}
	}

}
