package Model;
public class WinningPlayer implements  IPlayer {

    // Decorator Pattern Class

    IPlayer winner;

    public WinningPlayer(IPlayer winner) {
        this.winner = winner;
    }

    @Override
    public String getName() {

        return "*********** " + winner.getName() +" ***********";
    }

    @Override
    public void addCardToHand(PlayingCard pc) {

    }

    @Override
    public PlayingCard getCard(int index) {
        return null;
    }

    @Override
    public PlayingCard removeCard(int index) {
        return null;
    }
}
