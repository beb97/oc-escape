package main.java.com.escape.game;

public class CompteurTour {
    Integer turnLimit;
    Integer turn;

    CompteurTour() {
        this(10);
    }

    CompteurTour(Integer limit) {
        turnLimit = limit;
        turn = 0;
    }

    void nextTurn () {
        turn++;
    }

    public boolean isTimeOver() {
        return turn > turnLimit;
    }
}
