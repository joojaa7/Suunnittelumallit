package A07;

public class Master extends Level {

    public Master(Player player){
        super(player);
        System.out.println("Game completed.");
    }

    @Override
    public void action(){
        this.getPlayer().setGameOver(true);
        System.out.println("Final stats: ");
        System.out.println("Name:" + this.getPlayer().getName());
        System.out.println("Level:" + this.getClass());
        System.out.println("Hitpoints: " + this.getPlayer().getHp());
        System.out.println("Experience: " + this.getPlayer().getExp());

    }

}
