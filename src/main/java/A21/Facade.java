package A21;

import java.io.IOException;

public class Facade {

    private final JokeClient jokeClient;

    public Facade(){
        this.jokeClient = new JokeClient();
    }

    public String getAttributeValueFromJson(String urlString, String attributeName)
        throws IllegalArgumentException, IOException {

        String joke;

        try {
            joke = jokeClient.getRandomJoke(urlString, attributeName);
        }
        catch (Exception e){
            throw new IOException("Url not found.");
        }

        if (joke == null){
            throw new IllegalArgumentException("Attribute not found.");
        }
        return joke;
    }

}
