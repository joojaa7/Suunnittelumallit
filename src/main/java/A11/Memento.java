package A11;

import java.util.Date;

public class Memento implements IMemento {
    private final int[] options;
    private final boolean isSelected;
    private final Date creationDate;

    public Memento(int[] options, boolean isSelected) {
        this.options = options.clone(); // Copy options array
        this.isSelected = isSelected;
        creationDate = saveTime();
        System.out.println("Memento created");
    }

    public int[] getOptions() {
        return options.clone(); // Return a copy of options array
    }

    public boolean isSelected() {
        return isSelected;
    }

    private Date saveTime(){
        long creationTime = System.currentTimeMillis();
        return new Date(creationTime);
    }

    @Override
    public Date getCreationDate() {
        return creationDate;
    }

    @Override
    public String getParsedOptions(){
        StringBuilder string = new StringBuilder();
        for (int colour : options){
            switch (colour){
                case 0:
                    string.append(" Red");
                    break;
                case 1:
                    string.append(" Blue");
                    break;
                case 2:
                    string.append(" Yellow");
                    break;
                default:
                    throw new IllegalArgumentException("Woopsie");
            }
        }
        string.deleteCharAt(0);
        return string.toString();
    }

}
