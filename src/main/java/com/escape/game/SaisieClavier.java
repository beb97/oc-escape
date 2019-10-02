package main.java.com.escape.game;

import org.apache.log4j.Logger;

import java.util.Scanner;

public class SaisieClavier {

    static Logger logger = Logger.getLogger(SaisieClavier.class);

    String message;
    String saisie;

    SaisieClavier(String pMessage) {
        this.message = pMessage;
        System.out.println(message);
        Scanner scanner = new Scanner(System.in);
        this.saisie = scanner.nextLine();

        logger.debug("User entered : "+saisie);

    }

}
