package main.java.com.escape.game;

import org.apache.log4j.Logger;

abstract public class Mode {

    static Logger logger = Logger.getLogger(Mode.class);

    CompteurTour compteurTour;
    Settings settings;
    Combinaison combinaisonToFind;
    Combinaison combinaisonGuess;

    Mode() {
        logger.debug("Init du mode : "+this);
        settings = new Settings();
        logger.debug("Settings are : "+settings);
        compteurTour = new CompteurTour(settings.turnLimit);
    }

    abstract public void play();

    abstract public boolean isWon();

    abstract public boolean isLost();

    abstract public boolean continueToPlay();

    abstract public void displayWin();

    abstract public void displayLose();

}
