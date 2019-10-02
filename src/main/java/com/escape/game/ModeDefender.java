package main.java.com.escape.game;

public class ModeDefender extends Mode {

    CombinaisonFinder finder;

    public ModeDefender() {
        super();
        finder = new CombinaisonFinder(settings.combinaisonLength);

        SaisieClavier combinaisonSaisie = new SaisieClavier("Choisissez la combinaison pour cette partie");
        combinaisonToFind = new CombinaisonSaisie(combinaisonSaisie);

    }

    @Override
    public void play() {
        compteurTour.nextTurn();

        combinaisonGuess = finder.guessCombinaison();
        System.out.println("Ordi propose : "+ combinaisonGuess.value);

        if(continueToPlay()) {
            SaisieClavier correction = new SaisieClavier("Faux. Saisissez la correction [ - + = ]");
            finder.readCorrection(correction.saisie);
        }
    }


    @Override
    public boolean isWon() {
        return compteurTour.isTimeOver();
    }

    @Override
    public boolean isLost() {
        return combinaisonGuess.equals(combinaisonToFind);
    }

    @Override
    public void displayWin() {
        System.out.println("Victoire. L'ordinateur n'a pas trouvé la combinaison a temps");
    }

    @Override
    public void displayLose() {
        System.out.println("Défaite. L'ordinateur a trouvé la combinaison");
    }

    @Override
    public boolean continueToPlay() {
        return (!isWon() && !isLost());
    }

    @Override
    public String toString() {
        return "ModeDefender";
    }
}
