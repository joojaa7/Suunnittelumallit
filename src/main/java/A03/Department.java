package A03;

import java.util.ArrayList;
import java.util.List;

public class Department extends Component{

    private final List<Component> children = new ArrayList<>();

    public Department(String name){
        super(name);
    }

    @Override
    public void printData() {
        System.out.println("<Department>");
        System.out.println("    <Department name>" + this.name + "</Department name>");
        for (Component c : children) {
            c.printData();
        }
        System.out.println("</Department>");
    }

    @Override
    public void add(Component component) {
        this.children.add(component);
    }

    @Override
    public void remove(Component component) {
        this.children.remove(component);
    }

    @Override
    public Component getChild(int index){
        return this.children.get(index);
    }

    @Override
    public int getSalaries() {
        int salaries = 0;
        for (Component component : children) {
            if (component instanceof Employee) {
                salaries += component.salary;
            } else {
                salaries += component.getSalaries();
            }
        }
        return salaries;
    }

}
