package Games;

import Model.Player;

import java.util.List;

public interface GameEvaluator {
    public Player evaluateWinner(List<Player> players);
}

