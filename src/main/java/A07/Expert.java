package A07;

public class Expert extends Level {

    public Expert(Player player){
        super(player);
    }

    @Override
    public void action(){
        switch (this.getPlayer().play()){
            case "T":
                this.getPlayer().gainExp();
                if (this.getPlayer().getExp() >= 60){
                    System.out.println("Level up!");
                    this.getPlayer().setLevel(new Master(this.getPlayer()));
                }
                break;
            case "M":
                this.getPlayer().gainHp();
                break;
            case "F":
                this.getPlayer().combat();
                if (this.getPlayer().getHp() <= 0){
                    System.out.println("You died.");
                    this.getPlayer().setGameOver(true);
                }
                if (this.getPlayer().getExp() >= 60){
                    this.getPlayer().setLevel(new Master(this.getPlayer()));
                }
        }
    }
}
