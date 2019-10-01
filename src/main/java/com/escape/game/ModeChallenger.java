package main.java.com.escape.game;

public class ModeChallenger extends Mode {

    String result;

    public ModeChallenger() {
        super();
        combinaisonToFind = new CombinaisonAleatoire(settings);
    }

    @Override
    public void play() {
        compteurTour.nextTurn();

        combinaisonGuess = new CombinaisonSaisie(new SaisieClavier("Proposez une combinaison"));

        if(!isWon()) {
            result = combinaisonToFind.compareTo(combinaisonGuess);
            System.out.println(result);
        }

    }

    @Override
    public boolean isWon() {
        return combinaisonGuess.equals(combinaisonToFind);
    }

    @Override
    public boolean isLost() {
        return (compteurTour.isTimeOver());

    }

    @Override
    public void displayWin() {
        System.out.println("Victoire. Vous avez trouvé la combinaison");
    }

    @Override
    public void displayLose() {
        System.out.println("Défaite. Vous n'avez pas trouvé la combinaison ("+combinaisonToFind.value+") a temps");
    }

    @Override
    public boolean continueToPlay() {
        return (!isWon() && !isLost());
    }
}
