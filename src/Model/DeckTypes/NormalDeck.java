package Model.DeckTypes;

import Model.Deck;
import Model.PlayingCard;
import Model.Rank;
import Model.Suite;

import java.util.ArrayList;

public class NormalDeck extends Deck {

    public NormalDeck() {
        cards = new ArrayList<>();
        for (Rank rank : Rank.values()){

            for(Suite suite: Suite.values()){

                System.out.println("Creating card " + rank +" of" + suite.name());
                cards.add(new PlayingCard(rank, suite));

            }

        }

        shuffle();

    }
}
