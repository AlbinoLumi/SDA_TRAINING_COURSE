package com.DesignPatters.Factory;

public class PcGame implements Game{

    private String title;
    private boolean isOnline;
    private int numberOfPlayers;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public boolean isOnline() {
        return isOnline;
    }

    public void setOnline(boolean online) {
        isOnline = online;
    }

    public int getNumberOfPlayers() {
        return numberOfPlayers;
    }

    public void setNumberOfPlayers(int numberOfPlayers) {
        this.numberOfPlayers = numberOfPlayers;
    }

    @Override
    public void printGameInfo() {
        System.out.println("Loja elektronike: "+  this.title);
        System.out.println("numri i lojtarever" + this.numberOfPlayers);
        System.out.println("Loja eshte online ? " + this.isOnline);

    }

    public PcGame(String title, boolean isOnline, int numberOfPlayers) {
        this.title = title;
        this.isOnline = isOnline;
        this.numberOfPlayers = numberOfPlayers;
    }

    @Override
    public void play() {
        System.out.println("Loja elektroniike" + this.title + "Filloi...");

    }
}
