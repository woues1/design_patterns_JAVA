// OrganizationComponent.java
package Composite;

public abstract class OrganizationComponent {
    protected String name;

    public OrganizationComponent(String name) {
        this.name = name;
    }

    public void add(OrganizationComponent component) {
        throw new UnsupportedOperationException();
    }

    public void remove(OrganizationComponent component) {
        throw new UnsupportedOperationException();
    }

    public String getName() {
        return name;
    }

    public abstract double getSalary();

    public abstract void printXml(StringBuilder builder, int indent);
}