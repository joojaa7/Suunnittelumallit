package A04;

public class WeatherObserver implements Observer{


    private String name;

    public WeatherObserver(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public void update(int temp){
        System.out.println("Observer " + name + " updated the temperature to: " + temp + ".");
    }

}
