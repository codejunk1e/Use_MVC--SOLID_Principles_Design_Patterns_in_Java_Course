import Controller.GameController;
import Games.HighCardGameEvaluator;
import Model.Deck;
import Model.DeckFactory;
import Model.PlayingCard;
import View.CommandLineView;

import java.util.List;

public class CardGame {

    public static void main(String[] args) {

        GameController gameController  = new GameController(new DeckFactory().makeDeck(DeckFactory.DeckType.NORMAL),
                                                                                            new CommandLineView(),
                                                                                            new HighCardGameEvaluator() );

        gameController.run();
    }
}
