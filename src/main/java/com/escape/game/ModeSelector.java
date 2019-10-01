package main.java.com.escape.game;

public class ModeSelector {

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

            }
        }

        return mode;
    }
}
