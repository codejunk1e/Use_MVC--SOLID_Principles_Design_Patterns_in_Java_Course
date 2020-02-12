package Controller;

import Games.GameEvaluator;
import Model.*;
import View.GameViewable;
import java.util.ArrayList;
import java.util.List;



public class GameController {
    enum GameState {
        AddingPlayers,
        CardsDealt,
        WinnerRevealed;
    }

    Deck deck ;
    List<IPlayer> IPlayers;
    IPlayer Winner;
    GameViewable view;
    GameState gameState;
    GameEvaluator gameEvaluator;

    public GameController(Deck deck, GameViewable view, GameEvaluator gameEvaluator) {
        this.deck = deck;
        this.view = view;
        IPlayers = new ArrayList<>();
        gameState = GameState.AddingPlayers;
        this.view.setGameController(this);
    }

    public void  run (){
        while (true){
            switch ( gameState){

                case AddingPlayers:
                    view.promptForPlayername();
                    break;

                case CardsDealt:
                    view.promptForFlip();
                    break;

                case WinnerRevealed:
                    view.promptForNewGame();
                    break;

            }
        }
    }

    public  void  addingPlayers(String playerName) {
        if (gameState == GameState.AddingPlayers) {
            IPlayers.add(new Player(playerName, null));
            view.showPlayerName(IPlayers.size(), playerName);
        }
    }

        public  void  startGame(){
        if(gameState != GameState.CardsDealt){
        deck.shuffle();
        int playerIndex = 1;
        for (IPlayer IPlayer : IPlayers){
            IPlayer.addCardToHand(deck.removeTopCard());
                IPlayers.add(new Player(IPlayer.getName(), null));
                view.showFacedownCardForPlayer(playerIndex++, IPlayer.getName());
             }
        gameState = GameState.CardsDealt;
        }
    }

    public  void flipCards(){
        int playerIndex = 1;
        for (IPlayer IPlayer : IPlayers){
            PlayingCard pc = IPlayer.getCard(0);
            pc.flip(true);
            view.showCardForPlayer(playerIndex++, IPlayer.getName(), pc.getRank().toString(), pc.getSuite().toString());
        }

        evaluateWinner();
        displayWinner();
        rebuildDeck();
        gameState = GameState.WinnerRevealed;
    }

    private void rebuildDeck() {

    }

    private void displayWinner() {
        view.showWimmer(Winner.getName());

    }

    private void evaluateWinner() {
        Winner = new WinningPlayer(gameEvaluator.evaluateWinner(IPlayers));
    }

}
