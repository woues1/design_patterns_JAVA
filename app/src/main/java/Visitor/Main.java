package Visitor;

public class Main {
    public static void main(String[] args) {
        Directory root = new Directory("root");
        Directory home = new Directory("home");
        Directory user = new Directory("user");
        Directory temp = new Directory("temp");

        File a = new File("a.txt", 1);
        File b = new File("b.txt", 2);
        File c = new File("c.log", 3);
        File d = new File("d.txt", 4);
        File e = new File("e.log", 5);
        File f = new File("f.txt", 6);
        File g = new File("g.log", 7);
        File h = new File("h.txt", 8);
        File i = new File("i.log", 9);
        File j = new File("j.txt", 10);

        root.add(home);
        home.add(user);
        root.add(temp);
        home.add(a);
        home.add(b);
        home.add(c);
        user.add(d);
        user.add(e);
        user.add(f);
        user.add(g);
        temp.add(h);
        temp.add(i);
        temp.add(j);

        // Calculate total size
        SizeCalculatorVisitor sizeCalculator = new SizeCalculatorVisitor();
        root.accept(sizeCalculator);
        System.out.println("Total size: " + sizeCalculator.getTotalSize() + " MB");

        // Search for files with ".txt" extension
        SearchVisitor searchVisitor = new SearchVisitor(".txt");
        //root.accept(searchVisitor);
        home.accept(searchVisitor);
        System.out.println("Files with '.txt' extension:");
        for (File file : searchVisitor.getMatchingFiles()) {
            System.out.println(file.getName());
        }

    }
}