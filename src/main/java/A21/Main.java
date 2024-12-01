package A21;

import java.util.Arrays;

public class Main {

    public static void main(String[] args){

        Facade facade = new Facade();

        try {
            String joke = facade.getAttributeValueFromJson("https://api.fxratesapi.com/latest/", "rates");
            System.out.println(joke);
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }

        try {
            String joke = facade.getAttributeValueFromJson("https://api.chucknorris.io/jokes/random", "wrong_attribute");
            System.out.println(joke);
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }

        try {
            String joke = facade.getAttributeValueFromJson("https://api.chucknorris.io/jokes/random", "value");
            System.out.println(joke);
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }





    }

}
