package com.github.shynixn.mctennis.event

import com.github.shynixn.mctennis.contract.TennisGame

class GameEndEvent(val game: TennisGame) : MCTennisEvent() {
}
