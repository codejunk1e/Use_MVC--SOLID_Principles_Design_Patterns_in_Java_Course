package Games;

import Model.Player;
import Model.PlayingCard;

import java.util.List;

public class HighCardGameEvaluator implements GameEvaluator {

    public  Player evaluateWinner(List<Player> players) {

        Player bestplayer = null;
        int bestRank = -1;
        int bestSuite = -1;

        for (Player player : players) {
            boolean newBestPlayer = false;

            if (bestplayer == null) {
                newBestPlayer = true;
            } else {
                PlayingCard pc = player.getCard(0);
                int thisRank = pc.getRank().value();
                if (thisRank >= bestRank) {
                    if (thisRank > bestRank) {

                        newBestPlayer = true;
                    } else {
                        if (pc.getSuite().value() > bestSuite) {
                            newBestPlayer = true;
                        }

                    }

                }

            }

            if (newBestPlayer) {
                bestplayer = player;
                PlayingCard pc = player.getCard(0);
                bestRank = pc.getRank().value();
                bestSuite = pc.getSuite().value();
            }
        }

        return  bestplayer;
    }
}
