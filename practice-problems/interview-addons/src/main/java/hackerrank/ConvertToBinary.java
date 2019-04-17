package hackerrank;

import java.util.*;

public class ConvertToBinary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int integer = scanner.nextInt();

        String binary = "";

        while (integer > 0){
            binary+= integer%2;
            integer = integer/2;
        }

        List<Integer> countList = new ArrayList<>();

        int counter =0;
        for (int i =binary.length()-1; i >=0  ; --i){
            if (String.valueOf(binary.charAt(i)).equalsIgnoreCase("1") && counter==0 ) {
                counter++;
            }else
            if (String.valueOf(binary.charAt(i)).equalsIgnoreCase("1") &&
                    String.valueOf(binary.charAt(i+1)).equalsIgnoreCase("1") )
                counter++;
            else {
                countList.add(counter);
                counter = 0;
            }
        }
        countList.add(counter);


        Collections.sort(countList);
        System.out.println(countList.get(0));

    }

    static int divideAndConquer(int i){
        return i%2;
    }
}
