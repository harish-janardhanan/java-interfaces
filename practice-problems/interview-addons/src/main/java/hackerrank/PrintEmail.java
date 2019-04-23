package hackerrank;

import java.util.*;

public class PrintEmail {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int N = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

       List<String> emailDir = new ArrayList<>();

        for (int NItr = 0; NItr < N; NItr++) {
            String[] firstNameEmailID = scanner.nextLine().split(" ");

            String firstName = firstNameEmailID[0];

            String emailID = firstNameEmailID[1];

            if (firstName.matches("[a-z]+") && emailID.matches("[a-z]+[.]+[a-z]+@gmail.com+")){
                emailDir.add(firstName);
            }
        }
        emailDir.stream().sorted().forEach(x-> System.out.println(x));

        scanner.close();
    }
}
