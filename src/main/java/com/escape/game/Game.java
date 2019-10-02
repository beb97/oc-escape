package main.java.com.escape.game;

import org.apache.log4j.Logger;

public class Game {

    static Logger logger = Logger.getLogger(Game.class);

    Mode mode;
    ModeSelector ms;

    Game() {
        ms = new ModeSelector();
        do {
            mode = ms.chooseMode();

            logger.debug("Début de la partie");
            do {
                mode.play();
            } while (mode.continueToPlay());
            logger.debug("Fin de la partie");

            if (mode.isWon()) {
                logger.debug("Victoire");
                mode.displayWin();
            } else {
                logger.debug("Defaite");
                mode.displayLose();
            }

        } while (true);
    }
}
