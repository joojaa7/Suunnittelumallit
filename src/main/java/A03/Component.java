package A03;

public abstract class Component {

    protected String name;
    protected int salary;

    public Component(String name){
        this.name = name;
    }

    public Component(String name, int salary){
        this.name = name;
        this.salary = salary;
    }

    public abstract void printData();

    public abstract void add(Component component);

    public abstract void remove(Component component);

    public abstract Component getChild(int index);

    public abstract int getSalaries();

}
