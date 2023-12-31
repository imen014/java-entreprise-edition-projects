package com.openclassrooms.cardgame.games;

import java.util.List;

import com.openclassrooms.cardgame.model.Player;

public class HighCardGameEvaluator implements GameEvaluator{
	
	    public Player evaluateWinner(List<Player> players) {

		void evaluateWinner() {
			Player bestPlayer = null;
			int bestRank = -1;
			int bestSuit = -1;

			for (Player player : players) {
				boolean newBestPlayer = false;

				if (bestPlayer == null) {
					newBestPlayer = true;
				} else {
					PlayingCard pc = player.getCard(0);
					int thisRank = pc.getRank().value();
					if (thisRank >= bestRank) {
						if (thisRank > bestRank) {
							newBestPlayer = true;
						} else {
							if (pc.getSuit().value() > bestSuit) {
								newBestPlayer = true;
							}
						}
					}
				}

				if (newBestPlayer) {
					bestPlayer = player;
					PlayingCard pc = player.getCard(0);
					bestRank = pc.getRank().value();
					bestSuit = pc.getSuit().value();
				}
			}

			winner = bestPlayer;
		}


}
