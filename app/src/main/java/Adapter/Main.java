package Adapter;

public class Main {
    public static void main(String[] args) {
        NewDateInterface date = new CalendarToNewDateAdapter();

        date.setDay(19);
        date.setMonth(5);
        date.setYear(2001);

        System.out.println("Initial Date: " + date.getDay() + "/" + date.getMonth() + "/" + date.getYear());

        date.advanceDays(10);

        System.out.println("New Date: " + date.getDay() + "/" + date.getMonth() + "/" + date.getYear());


    }
}
