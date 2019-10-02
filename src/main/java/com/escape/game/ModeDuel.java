package main.java.com.escape.game;

public class ModeDuel extends Mode {

    CombinaisonFinder finder;
    Combinaison combinaisonToFindForComputer;
    Combinaison combinaisonGuessForComputer;

    public ModeDuel() {
        super();
        finder = new CombinaisonFinder(settings.combinaisonLength);

        // Saisie des combinaisons
        // Que l'ordi doit deviner
        SaisieClavier combinaisonSaisie = new SaisieClavier("Choisissez la combinaison pour cette partie");
        combinaisonToFindForComputer = new CombinaisonSaisie(combinaisonSaisie);
        // Que le joueur doit deviner
        combinaisonToFind = new CombinaisonAleatoire(settings);
    }

    @Override
    public void play() {
        // Tentative de deviner

        // Pour le joueur
        System.out.println("");
        System.out.println("*** JOUEUR ***");

        combinaisonGuess = new CombinaisonSaisie(new SaisieClavier("Proposez une combinaison"));
        if(!isWon()) {
            System.out.println(combinaisonToFind.compareTo(combinaisonGuess));
        }

        // Pour l'ordi
        System.out.println("");
        System.out.println("*** ORDI ***");

        combinaisonGuessForComputer = finder.guessCombinaison();
        System.out.println("Ordi propose : "+ combinaisonGuessForComputer.value);
        if(!isLost()) {
            SaisieClavier correction = new SaisieClavier("Faux ("+combinaisonToFindForComputer.value+"). Saisissez la correction [ - + = ]");
            finder.readCorrection(correction.saisie);
        }


    }

    @Override
    public boolean isWon() {
        return combinaisonGuess.equals(combinaisonToFind);
    }

    @Override
    public boolean isLost() {
        return combinaisonGuessForComputer.equals(combinaisonToFindForComputer);
    }

    @Override
    public void displayWin() {
        System.out.println("Victoire. Vous avez trouvé la combinaison");
    }

    @Override
    public void displayLose() {
        System.out.println("Défaite. L'ordi a trouvé sa combinaison avant vous");
    }

    @Override
    public boolean continueToPlay() {
        return (!isWon() && !isLost());
    }

    @Override
    public String toString() {
        return "ModeDuel";
    }
}
