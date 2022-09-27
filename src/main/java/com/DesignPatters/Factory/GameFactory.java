package com.DesignPatters.Factory;

public class GameFactory {
    public Game createGame(GameTypeEnum gameType) {
        Game game = null;
        switch (gameType) {
            case BOARD -> game = new BoardGame("Murlan", 4);
            case PC -> game = new PcGame("Counter Strike", true, 4);
            case LAND -> game = new LandGame(2, "BattleField");

        }
        return game;
    }
}
