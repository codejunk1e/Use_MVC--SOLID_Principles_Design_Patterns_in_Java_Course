package View;

import Controller.GameController;

public interface GameViewable {
    public  void setGameController( GameController gc);
    public void promptForNewGame();
    public void promptForFlip();
    public void promptForPlayername();
    public void showFacedownCardForPlayer(int playerIndex, String playerName);
    public void showPlayerName(int playerIndex, String playerName);
    public void showCardForPlayer(int playerIndex, String playerName, String rank, String suit);
    public void showWimmer(String winner);

}
