package Games;

import Model.IPlayer;

import java.util.List;

public interface GameEvaluator {
    public IPlayer evaluateWinner(List<IPlayer> IPlayers);
}

