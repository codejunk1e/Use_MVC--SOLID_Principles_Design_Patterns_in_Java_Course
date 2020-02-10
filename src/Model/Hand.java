package Model;

import java.util.List;

public class Hand {
    List<PlayingCard> cards;

    public  void addCard(PlayingCard pc){
        cards.add(pc);
    }

    public  PlayingCard getCard(int index){
        return  cards.get(index);
    }

    public  PlayingCard removeCard(){
        return  cards.remove(0);
    }

}
