package A07;

public abstract class Level {

    private Player player;

    public Level(Player player){
        this.player = player;
    }

    public Player getPlayer(){
        return player;
    }


    abstract void action();

}
