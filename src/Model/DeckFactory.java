package Model;

import Model.DeckTypes.NormalDeck;
import Model.DeckTypes.SmallDeck;
import Model.DeckTypes.TestDeck;

public class DeckFactory {
    public  enum  DeckType{
        NORMAL,
        SMALL,
        TEST
    }

    public  static  Deck makeDeck(DeckType deckType){
        switch (deckType){
            case NORMAL: return new NormalDeck();
            case SMALL: return new SmallDeck();
            case TEST: return new TestDeck();
        }

        return new NormalDeck();

    }

}
