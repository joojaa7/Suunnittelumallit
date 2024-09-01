package A03;

public class Employee extends Component{

    public Employee(String name, int salary) {
        super(name, salary);
    }

    @Override
    public void printData() {
        System.out.println("        <employee>");
        System.out.println("            <name>" + this.name + "</name>");
        System.out.println("            <salary>" + this.salary + "</salary>");
        System.out.println("        </employee>");
    }

    @Override
    public void add(Component component){
        throw new UnsupportedOperationException("Not supported.");
    }

    @Override
    public void remove(Component component){
        throw new UnsupportedOperationException("Not supported.");
    }

    @Override
    public Component getChild(int index){
        throw new UnsupportedOperationException("Not supported.");
    }

    @Override
    public int getSalaries() {
        throw new UnsupportedOperationException("Not supported.");
    }
}
