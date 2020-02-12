package Games;

import Model.IPlayer;
import Model.PlayingCard;

import java.util.List;

public class LowCardGameEvaluator implements  GameEvaluator {

    public IPlayer evaluateWinner(List<IPlayer> IPlayers) {

        IPlayer bestplayer = null;
        int bestRank = -1;
        int bestSuite = -1;

        for (IPlayer IPlayer : IPlayers) {
            boolean newBestPlayer = false;

            if (bestplayer == null) {
                newBestPlayer = true;
            } else {
                PlayingCard pc = IPlayer.getCard(0);
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
                bestplayer = IPlayer;
                PlayingCard pc = IPlayer.getCard(0);
                bestRank = pc.getRank().value();
                bestSuite = pc.getSuite().value();
            }
        }

        return  bestplayer;
    }
}
