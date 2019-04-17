package hackerrank;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class HourGlassSum {

    static List<Integer> hourGlassSumList = new ArrayList<>();
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int[][] arr = new int[6][6];

        for (int i = 0; i < 6; i++) {
            String[] arrRowItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int j = 0; j < 6; j++) {
                int arrItem = Integer.parseInt(arrRowItems[j]);
                arr[i][j] = arrItem;
            }
        }

        for (int i =0; i < 4 ; ++i){
            int hourGlassSum =0;
            for (int j = 0; j < 6 ; ++j){
                hourGlassSum = arr[i][j] + arr[i] [j+1] + arr[i][j+2] +
                                arr[i+1][j+1] +
                                arr[i+2][j] + arr[i+2][j+1] + arr[i+2][j+2];
            }
            hourGlassSumList.add(hourGlassSum);
        }

        Collections.sort(hourGlassSumList);

        System.out.println(hourGlassSumList.get(hourGlassSumList.size()-1));
    }
}
