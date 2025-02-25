package Builder;

import java.util.ArrayList;
import java.util.List;

public class Computer {
    private List<Part> parts;

    public Computer(){ this.parts = new ArrayList<>(); }

    public void addPart(Part part){ this.parts.add(part); }

    public String getTotalPrice(){
        double total = 0;
        for(Part part : parts){
            total += part.getPrice();
        }
        return "Total: " + total;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (Part part : parts) {
            sb.append(part.getName());
            sb.append(":  ");
            sb.append(part.getPrice()).append("€");
            sb.append("\n");
        }
        sb.append(this.getTotalPrice()).append("€");
        return sb.toString();
    }
}
