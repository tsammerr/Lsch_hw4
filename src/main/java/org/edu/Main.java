package org.edu;

public class Main {

    public static void main(String[] args) {
        String[] days = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
        for (String day : days) {
            switch (day) {
                case "Monday", "Tuesday", "Wednesday", "Thursday", "Friday" -> System.out.println("Weekday");
                case "Saturday", "Sunday" -> System.out.println("Weekend day");
                default -> System.out.println("Invalid day");
            }
        }
    }
}
