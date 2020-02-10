package View;

import Controller.GameController;

import java.util.Scanner;

public class CommandLineView implements  GameViewable {
    GameController gameController;
    Scanner keyboard = new Scanner(System.in);

    public  void setGameController( GameController gc){
        this.gameController = gc;
    }

    public void promptForNewGame() {
        String name = keyboard.nextLine();
        if(name.isEmpty()){
            gameController.startGame();
        }
        else {
            gameController.addingPlayers(name);
        }
    }

    public void promptForFlip() {
        System.out.println("Press enter to reveal cards");
        keyboard.nextLine();
        gameController.flipCards();
    }

    public void promptForPlayername() {
        System.out.println("Press enter to deal again");
        keyboard.nextLine();
        gameController.startGame();
    }


    public void showFacedownCardForPlayer(int playerIndex, String playerName) {
        System.out.println("[ " + playerName + " ][][]");
    }

    public void showPlayerName(int playerIndex, String playerName) {
        System.out.println("[ " + playerIndex + "][ " + playerName + " ]");
    }

    public void showCardForPlayer(int playerIndex, String playerName, String rank, String suit) {
        System.out.println("[ " + playerName + " ][ " + rank +"][ "  +suit + "]");
    }


    public void showWimmer(String winner) {
        System.out.println("Winner!!! " + winner);
    }
}
