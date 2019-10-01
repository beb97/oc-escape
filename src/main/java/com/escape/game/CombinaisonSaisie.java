package main.java.com.escape.game;

public class CombinaisonSaisie extends Combinaison {

    CombinaisonSaisie(String value) {
        this.setValue(value);
    }

    CombinaisonSaisie(SaisieClavier saisie) {
        this(saisie.saisie);
    }
}
