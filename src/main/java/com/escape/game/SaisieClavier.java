package main.java.com.escape.game;

import java.util.Scanner;

public class SaisieClavier {
    String message;
    String saisie;

    SaisieClavier() {
        this("");
    }

    SaisieClavier(String pMessage) {
        this.message = pMessage;
        System.out.println(message);
        Scanner scanner = new Scanner(System.in);
        this.saisie = scanner.nextLine();
    }

    public void show() {
        System.out.println(this.saisie);
    }

}
