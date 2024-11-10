package A15;

import java.util.Calendar;
import java.util.Random;

public class Main {

    public static void main(String[] args){

        Calendar calendar = Calendar.getInstance();
        CalendarToNewDateAdapter newCalendar = new CalendarToNewDateAdapter(calendar);
        Random random = new Random();

        System.out.println("Tämän päivän päivämäärä on " + newCalendar.getDay() + "." + newCalendar.getMonth() + "." + newCalendar.getYear() + ".");

        newCalendar.advanceDays(555);
        System.out.println("Uuden päivän päivämäärä on " + newCalendar.getDay() + "." + newCalendar.getMonth() + "." + newCalendar.getYear() + ".");

        newCalendar.setDay(random.nextInt(1, 32));
        newCalendar.setMonth(random.nextInt(1, 13));
        newCalendar.setYear(random.nextInt(1970, 2100));

        System.out.println("Satunnaisen päivän päivämäärä on " + newCalendar.getDay() + "." + newCalendar.getMonth() + "." + newCalendar.getYear() + ".");



    }

}
