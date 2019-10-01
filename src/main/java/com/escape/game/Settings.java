package main.java.com.escape.game;

import java.io.InputStream;
import java.util.Properties;

public class Settings {
    Properties properties;
    Integer turnLimit = 10;
    Boolean debug = false;
    Integer combinaisonLength = 4;

    Settings() {
        try {
            InputStream input = getClass().getResourceAsStream("/game.properties");
            properties = new Properties();
            properties.load(input);

            turnLimit = Integer.parseInt(properties.getProperty("turn-limit"));
            combinaisonLength = Integer.parseInt(properties.getProperty("combinaison-length"));
            debug = Boolean.parseBoolean(properties.getProperty("debug"));

        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
