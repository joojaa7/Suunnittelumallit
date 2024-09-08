package A04;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        WeatherStation weatherStation = new WeatherStation();
        WeatherObserver kissa = new WeatherObserver("Kissa");
        WeatherObserver koira = new WeatherObserver("Koira");
        WeatherObserver kani = new WeatherObserver("Kani");

        weatherStation.addObserver(kissa);
        weatherStation.addObserver(koira);
        weatherStation.addObserver(kani);


        weatherStation.start();
        Thread.sleep(10000);
        weatherStation.removeObserver(koira);
    }
}
