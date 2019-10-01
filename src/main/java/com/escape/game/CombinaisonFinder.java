package main.java.com.escape.game;

public class CombinaisonFinder {
    StringBuilder combinaisonMin;
    StringBuilder combinaisonMax;
    String currentSuggestion;
    String correction;

    CombinaisonFinder() {
        this(4);
    }

    CombinaisonFinder(Integer length) {
        combinaisonMin = new StringBuilder();
        combinaisonMax = new StringBuilder();
        currentSuggestion = "";
        for(int index = 0; index < length; index++) {
            currentSuggestion += "0";
            combinaisonMin.append("0");
            combinaisonMax.append("9");
        }
    }

    Combinaison guessCombinaison() {
        StringBuilder candidate = new StringBuilder(currentSuggestion);
        int min;
        int max;
        int val;
        for (int index = 0; index<currentSuggestion.length(); index++) {
            min = combinaisonMin.charAt(index);
            max = combinaisonMax.charAt(index);
            val = min + (max - min) / 2;
            candidate.setCharAt(index, (char)val);
        }

        currentSuggestion = candidate.toString();
        return new CombinaisonSaisie(currentSuggestion);
    }

    void readCorrection(String pCorrection) {
        correction = pCorrection;
        char cor;
        int sug;
        for (int index = 0; index<correction.length(); index++) {

            cor = correction.charAt(index);
            sug = currentSuggestion.charAt(index);

            if(cor == '+') {
                combinaisonMin.setCharAt(index, (char) (sug+1) );
            } else if (cor == '-') {
                combinaisonMax.setCharAt(index, (char) (sug-1) );
            } else if (cor == '=') {
                combinaisonMin.setCharAt(index, (char) sug);
                combinaisonMax.setCharAt(index, (char) sug);
            }
        }
    }
}
