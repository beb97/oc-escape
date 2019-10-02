package main.java.com.escape.game;

import org.apache.log4j.Logger;

import java.io.InputStream;
import java.util.Properties;


public class Settings {

    static Logger logger = Logger.getLogger(Settings.class);

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
            logger.error("Erreur lors de l'import des settings : "+ex);
        }
    }

    @Override
    public String toString() {
        return "Settings{" +
                "turnLimit=" + turnLimit +
                ", debug=" + debug +
                ", combinaisonLength=" + combinaisonLength +
                '}';
    }
}
