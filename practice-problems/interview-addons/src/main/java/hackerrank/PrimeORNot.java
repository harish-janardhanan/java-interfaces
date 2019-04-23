package hackerrank;

import java.util.Scanner;

public class PrimeORNot {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        int numer = scanner.nextInt();

        for (int j = 0 ; j < numer; ++j) {
            int integer = scanner.nextInt();
            boolean prime = true;
            if (integer == 1){

                prime = false;
            }

            for (int i = 2; i <= integer / 2; ++i) {

                if (integer % i == 0) {
                    prime = false;
                    break;
                }
            }
            if(prime)
                System.out.println("Prime");
            else
                System.out.println("Not prime");
        }
    }
}
