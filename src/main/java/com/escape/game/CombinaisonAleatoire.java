package main.java.com.escape.game;

import org.apache.log4j.Logger;

public class CombinaisonAleatoire extends Combinaison {

    static Logger logger = Logger.getLogger(CombinaisonAleatoire.class);

    CombinaisonAleatoire() {
        this(4);
    }

    CombinaisonAleatoire(Integer length) {
        this(length, false);
    }

    CombinaisonAleatoire(Integer length, Boolean debug) {
        this.setValue(String.valueOf(generateRandomInt(length)));
        if (debug) {
            System.out.println("*DEBUG* Combinaison genere par l'ordi : "+this.value);
        }
    }

    CombinaisonAleatoire(Settings settings) {
        this(settings.combinaisonLength, settings.debug);
    }

    Integer generateRandomInt(Integer length) {
        Integer randomInt = (int) (Math.random() * Math.pow(10, length));
        logger.debug("Combinaison aléatoire généré : " + randomInt);
        return randomInt;
    }

}


