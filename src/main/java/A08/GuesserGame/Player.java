package A08.GuesserGame;

public class Player {

    private int correctGuesses;

    private int wrongGuesses;

    private String id;

    public Player(String name){
        this.id = name;
    }

    public int getCorrectGuesses() {
        return correctGuesses;
    }

    public void setCorrectGuesses() {
        this.correctGuesses++;
    }

    public void setWrongGuesses(){
        this.wrongGuesses++;
    }

    public int getWrongGuesses() {
        return wrongGuesses;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
