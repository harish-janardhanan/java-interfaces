package hackerrank;


import java.util.Scanner;

public class DateDifference {

    private static final Scanner scanner = new Scanner(System.in);


    public static void main(String[] args) {

        Integer recDay = Integer.valueOf(scanner.next());
        Integer recMonth = Integer.valueOf(scanner.next());
        Integer recYear = Integer.valueOf(scanner.next());

        Integer aDay = Integer.valueOf(scanner.next());
        Integer aMonth = Integer.valueOf(scanner.next());
        Integer aYear = Integer.valueOf(scanner.next());
        if (recYear < aYear) {
            System.out.println("0");
        } else if (recYear.equals(aYear)) {
            if (recMonth < aMonth) {
                System.out.println("0");
            } else if (recMonth.equals(aMonth)) {
                if (recDay < aDay || recDay.equals(aDay)) {
                    System.out.println("0");
                } else {
                    System.out.println(Math.abs(aDay - recDay) * 15);
                }
            } else {
                System.out.println(Math.abs(aMonth - recMonth) * 500);
            }
        } else {
            System.out.println(Math.abs(aYear - recYear == 11 ? 1: (aYear-recYear)) * 10000);
        }


    }
}
