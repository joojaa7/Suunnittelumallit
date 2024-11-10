package A14;

import java.util.HashMap;

public class Computer {


    private final HashMap<String, String> components;

    public Computer(){
        this.components = new HashMap<>();
    }

    public void addComponents(String component, String specs){
        components.put(component, specs);
    }

    @Override
    public String toString(){
        StringBuilder stringBuilder = new StringBuilder();
        components.forEach((key, value) -> {
            stringBuilder.append(key);
            stringBuilder.append(": ");
            stringBuilder.append(value);
            stringBuilder.append("\n");
        });
        return stringBuilder.toString();
    }

}
