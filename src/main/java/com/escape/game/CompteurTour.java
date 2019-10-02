package main.java.com.escape.game;

import org.apache.log4j.Logger;

public class CompteurTour {

    static Logger logger = Logger.getLogger(CompteurTour.class);

    Integer turnLimit;
    Integer turn;

    CompteurTour() {
        this(10);
    }

    CompteurTour(Integer limit) {
        turnLimit = limit;
        turn = 0;
        logger.debug("Turn limit : "+turnLimit);
    }

    void nextTurn () {
        turn++;
        logger.debug("Turn : "+turn);
    }

    public boolean isTimeOver() {
        return turn > turnLimit;
    }
}
