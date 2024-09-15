package A07;

public class Intermediate extends Level {

    public Intermediate(Player player){
        super(player);
    }

    @Override
    public void action(){
        switch (this.getPlayer().play()){
            case "T":
                this.getPlayer().gainExp();
                if (this.getPlayer().getExp() >= 30){
                    System.out.println("Level up!");
                    this.getPlayer().setLevel(new Expert(this.getPlayer()));
                }
                break;
            case "M":
                this.getPlayer().gainHp();
                break;
            default:
                System.out.println("Level too low.");
        }
    }

}
