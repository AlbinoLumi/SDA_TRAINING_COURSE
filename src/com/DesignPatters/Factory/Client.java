package com.DesignPatters.Factory;

public class Client {
    public static void main(String[] args) {
        GameTypeEnum gameType = GameTypeEnum.LAND;

        GameFactory factory = new GameFactory();
        Game game = factory.createGame(gameType);
        Game game1 = factory.createGame(GameTypeEnum.BOARD);//me factory mund te krijojm disa
        // objekte pa pasur nevoje te krijojme switch case
        // por duke krijuar nje klas tjeter ne vete si factory.




        game.printGameInfo();
        game1.printGameInfo();
    }
}
