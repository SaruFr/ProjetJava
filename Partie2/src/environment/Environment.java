package environment;

import java.util.ArrayList;

import util.Direction;
import util.Case;
import gameCommons.Game;
import gameCommons.IEnvironment;

import util.Direction;

public class Environment implements IEnvironment {
		
	public Environment(Game inGame)
    {
        game = inGame;
    }
    private Game game;

    public boolean isSafe(Case c){return false;};

    public boolean isWinningPosition(Case c){return true;};

    public void update(){
        //DO nothing
    };


}
