package hackerrank.hashtables;

import javax.persistence.criteria.CriteriaBuilder;
import java.util.*;
import java.util.Map.Entry;
import java.util.stream.Collectors;

public class CostOfIceCream {

    // Complete the whatFlavors function below.
    static void whatFlavors(int[] cost, int money) {
        Map<Integer, Integer> costMap = new HashMap<>();

        boolean costfound = false;

        for (int i = 1; i <= cost.length; ++i)
            costMap.put(i,cost[i-1]);



        for (int i = 1; i <= costMap.size() ; ++i ){
                if (money - costMap.get(i) == 0)
            }


    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int t = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int tItr = 0; tItr < t; tItr++) {
            int money = scanner.nextInt();
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            int n = scanner.nextInt();
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            int[] cost = new int[n];

            String[] costItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int i = 0; i < n; i++) {
                int costItem = Integer.parseInt(costItems[i]);
                cost[i] = costItem;
            }

            whatFlavors(cost, money);
        }

    }
}
