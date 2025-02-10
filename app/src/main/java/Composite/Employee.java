package Composite;

public class Employee extends OrganizationComponent {
    private double salary;

    public Employee(String name, double salary) {
        super(name);
        this.salary = salary;
    }

    @Override
    public double getSalary() {
        return salary;
    }

    @Override
    public void printXml(StringBuilder builder, int indent) {
        builder.append("  ".repeat(indent)).append("<Employee name=\"").append(name).append("\" salary=\"").append(salary).append("\"/>\n");
    }
}