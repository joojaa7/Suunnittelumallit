package A03;

public class Main {

    public static void main(String[] args) {

        Department  department0 = new Department("Boring");

        Department department = new Department("Accounting");
        Department department1 = new Department("Billing");

        Department department2 = new Department("Legal");
        Department department3 = new Department("Standards and Practices");
        Department department4 = new Department("Censors");

        Employee employee = new Employee("Matias", 500);
        Employee employee1 = new Employee("Jippi", 2222);
        Employee employee2 = new Employee("Jappi", 33333);
        Employee employee5 = new Employee("Miikka", 55);
        Employee employee3 = new Employee("Lemon", 5);
        Employee employee4 = new Employee("Matias3", 5320);
        Employee employee6 = new Employee("Matias66", 32131);

        department.add(employee);
        department.add(employee1);
        department.add(department1);
        department1.add(employee2);

        department2.add(employee3);
        department2.add(department3);
        department2.add(department4);

        department3.add(employee4);
        department4.add(employee5);
        department4.add(employee6);

        department0.add(department);
        department0.add(department2);

        department0.printData();
        System.out.println("Total salary spending: " + department0.getSalaries());



    }

}
