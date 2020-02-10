package Model.DeckTypes;

import Model.Deck;
import Model.PlayingCard;
import Model.Rank;
import Model.Suite;

import java.util.ArrayList;

public class TestDeck extends Deck {

    public TestDeck() {
        cards = new ArrayList<>();
        for (int i = 0; i < 20;  ++i){

            cards.add(new PlayingCard(Rank.ACE, Suite.CLUBS));

        }

        shuffle();

    }
}
