package main.java.com.escape.game;

public class CombinaisonComparator {
    Combinaison c1;
    Combinaison c2;

    CombinaisonComparator(Combinaison pC1, Combinaison pC2) {
        c1 = pC1;
        c2 = pC2;
    }

    public String compare() {
        String comparaison = "";
        if (c2 == null || c1 == null) {
            comparaison = "combinaison invalide";
        } else if (c2.value.length() != c1.value.length()) {
            comparaison = "combinaison invalide";
        } else if (c2.value.equals(c1.value)) {
            comparaison = "you win";
        } else if (c2.value.length() == c1.value.length()) {
            comparaison = compareStrings(c1.value, c2.value);
        }
        return comparaison;
    }

    private String compareStrings(String s1, String s2) {
        String result = "";
        char ch1;
        char ch2;
        for (int index = 0; index<s1.length(); index++) {
            ch1 = s1.charAt(index);
            ch2 = s2.charAt(index);
            if (ch1 == ch2) {
                result += "=";
            } else if (ch1 < ch2) {
                result += "-";
            } else if (ch1 > ch2) {
                result += "+";
            }
        }
        return result;
    }
}
