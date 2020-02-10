package Model.DeckTypes;

import Model.Deck;
import Model.PlayingCard;
import Model.Rank;
import Model.Suite;

import java.util.ArrayList;

public class SmallDeck extends Deck {

    public SmallDeck() {
        cards = new ArrayList<>();
        for (Rank rank : Rank.values()){

            for(Suite suite: Suite.values()){

                if(rank.value() >= 7) {
                    System.out.println("Creating card: [ " + rank + " ] of [" + suite.name() + " ]");
                    cards.add(new PlayingCard(rank, suite));
                }
            }

        }

        shuffle();

    }
}
