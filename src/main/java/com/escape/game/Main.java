package main.java.com.escape.game;

import org.apache.log4j.Logger;

public class Main {

    static Logger logger = Logger.getLogger(Main.class);

    public static void main(String[] args) {

        logger.debug("Début du jeu");
        new Game();
        logger.debug("Fin du jeu");

    }
}
