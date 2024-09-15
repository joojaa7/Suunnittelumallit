package A07;

public class Novice extends Level {


    public Novice(Player player){
        super(player);
    }


    @Override
    public void action(){
        switch (this.getPlayer().play()) {
            case "T":
                this.getPlayer().gainExp();
                if (this.getPlayer().getExp() >= 10){
                    System.out.println("Level up!");
                    this.getPlayer().setLevel(new Intermediate(this.getPlayer()));
                }
                break;
            default:
                System.out.println("Level too low.");
        }
    }
}
