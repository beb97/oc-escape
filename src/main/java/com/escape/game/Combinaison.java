package main.java.com.escape.game;

public abstract class Combinaison {
    String value;

    public void setValue(String pValue) {
        this.value = pValue;
    }

    String compareTo(Combinaison candidate) {
        return new CombinaisonComparator(this, candidate).compare();
    }

    boolean equals(Combinaison other) {
        return other!=null && this.value.equals(other.value);
    }

}
