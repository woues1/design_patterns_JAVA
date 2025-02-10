// Department.java
package Composite;

import java.util.ArrayList;
import java.util.List;

public class Department extends OrganizationComponent {
    private List<OrganizationComponent> components = new ArrayList<>();

    public Department(String name) {
        super(name);
    }

    @Override
    public void add(OrganizationComponent component) {
        components.add(component);
    }

    @Override
    public void remove(OrganizationComponent component) {
        components.remove(component);
    }

    @Override
    public double getSalary() {
        return components.stream().mapToDouble(OrganizationComponent::getSalary).sum();
    }

    @Override
    public void printXml(StringBuilder builder, int indent) {
        builder.append("  ".repeat(indent)).append("<Department name=\"").append(name).append("\">\n");
        for (OrganizationComponent component : components) {
            component.printXml(builder, indent + 1);
        }
        builder.append("  ".repeat(indent)).append("</Department>\n");
    }
}