package Composite;

public class Main {
    public static void main(String[] args) {
        Department root = new Department("Headquarters");

        Department sales = new Department("Sales");
        sales.add(new Employee("Alice", 50000));
        sales.add(new Employee("Bob", 60000));

        Department development = new Department("Development");
        development.add(new Employee("Charlie", 70000));
        development.add(new Employee("Dave", 80000));

        root.add(sales);
        root.add(development);

        System.out.println("Total Salary: " + root.getSalary());

        StringBuilder xmlBuilder = new StringBuilder();
        root.printXml(xmlBuilder, 0);
        System.out.println(xmlBuilder.toString());
    }
}