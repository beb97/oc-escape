package main.java.com.escape.game;

public class Game {

    Mode mode;
    ModeSelector ms;

    Game() {
        ms = new ModeSelector();
        do {
            mode = ms.chooseMode();

            do {
                mode.play();
            } while (mode.continueToPlay());

            if (mode.isWon()) {
                mode.displayWin();
            } else {
                mode.displayLose();
            }

        } while (true);
    }
}
