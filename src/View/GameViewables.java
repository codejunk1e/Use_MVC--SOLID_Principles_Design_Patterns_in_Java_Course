package View;

import Controller.GameController;

import java.util.ArrayList;
import java.util.List;

public class GameViewables implements  GameViewable {
    List<GameViewable> views;


    public GameViewables() {
        this.views = new ArrayList<>();
    }

    public  void  addGameViewable(GameViewable gameViewable){
        views.add(gameViewable);
    }

    @Override
    public void setGameController(GameController gc) {
        for (GameViewable gameViewable : views){
            gameViewable.setGameController(gc);
        }

    }

    @Override
    public void promptForNewGame() {
        for (GameViewable gameViewable : views){
            gameViewable.promptForNewGame();
        }

    }

    @Override
    public void promptForFlip() {
        for (GameViewable gameViewable : views){
            gameViewable.promptForFlip();
        }
    }

    @Override
    public void promptForPlayername() {
        for (GameViewable gameViewable : views){
            gameViewable.promptForPlayername();
        }
    }

    @Override
    public void showFacedownCardForPlayer(int playerIndex, String playerName) {
        for (GameViewable gameViewable : views){
            gameViewable.showFacedownCardForPlayer(playerIndex, playerName );
        }
    }

    @Override
    public void showPlayerName(int playerIndex, String playerName) {
        for (GameViewable gameViewable : views){
            gameViewable.showPlayerName(playerIndex, playerName );
        }
    }

    @Override
    public void showCardForPlayer(int playerIndex, String playerName, String rank, String suit) {
        for (GameViewable gameViewable : views){
            gameViewable.showCardForPlayer(playerIndex, playerName,  rank, suit );
        }
    }

    @Override
    public void showWimmer(String winner) {
        for (GameViewable gameViewable : views) {
            gameViewable.showWimmer(winner);

        }
    }
}
