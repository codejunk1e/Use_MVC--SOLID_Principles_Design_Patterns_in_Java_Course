package Model;

public class Player {
    String name;
    Hand hand;


    public Player(String name, Hand hand) {
        this.name = name;
        this.hand = hand;
    }

    public String getName() {
        return name;
    }

    public void addCardToHand(PlayingCard pc) {
        hand.addCard(pc);
    }

    public PlayingCard getCard(int index) {
        return hand.getCard(index);
    }

    public PlayingCard removeCard(int index) {
        return hand.removeCard();
    }

}
