package main.java.com.escape.game;

import org.apache.log4j.Logger;

public class ModeSelector {

    static Logger logger = Logger.getLogger(ModeSelector.class);

    ModeSelector() {
    }

    public Mode chooseMode() {
        System.out.println();
        SaisieClavier modeJeu = new SaisieClavier("Choisisez votre mode de jeu (Challenger:1 Defender:2  Duel:3)");
        Mode mode = null;
        while(mode == null) {
            try {
                switch (Integer.parseInt(modeJeu.saisie)) {
                    case 1:
                        mode = new ModeChallenger();
                        break;
                    case 2:
                        mode = new ModeDefender();
                        break;
                    case 3:
                        mode = new ModeDuel();
                        break;
                    default:
                        break;
                }
            } catch (Exception e) {
                logger.error("Erreur lors du choix du mode : "+e);
            }
        }
        return mode;
    }
}
