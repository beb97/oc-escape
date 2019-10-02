package main.java.com.escape.game;

import org.apache.log4j.Logger;

public class CombinaisonSaisie extends Combinaison {

    static Logger logger = Logger.getLogger(CombinaisonSaisie.class);

    CombinaisonSaisie(String value) {
        this.setValue(value);
        logger.debug("Combinaison saisie : "+value);
    }

    CombinaisonSaisie(SaisieClavier saisie) {
        this(saisie.saisie);
    }
}
