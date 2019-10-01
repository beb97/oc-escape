package main.java.com.escape.game;

abstract public class Mode {

    CompteurTour compteurTour;
    Settings settings;
    Combinaison combinaisonToFind;
    Combinaison combinaisonGuess;

    Mode() {
        settings = new Settings();
        compteurTour = new CompteurTour(settings.turnLimit);
    }

    abstract public void play();

    abstract public boolean isWon();

    abstract public boolean isLost();

    abstract public boolean continueToPlay();

    abstract public void displayWin();

    abstract public void displayLose();

}
