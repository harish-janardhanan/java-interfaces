import java.util.ArrayList;
import java.util.List;

public class CoinChange {

    public static void main(String[] args) {
        int[] array = {1, 2, 3};
        int n = 4;

        int[] array1 = {2, 5, 3, 6};
        int n1 = 10;

        List<int[]> combinationList = new ArrayList<>();
        List<int[]> combinationList1 = new ArrayList<>();

        combinationList1 = getCoinCombination(array, n);

        combinationList = getCoinCombination(array1, n1);

        System.out.println(combinationList.toString());

    }

    public static List<int[]> getCoinCombination(int[] array, int n) {
        List<int[]> combinationList = new ArrayList<>();
        for (int i = 0; i < array.length; ++i) {
            int sum = 0;
            List<Integer> newList = new ArrayList<>();
            for (int p = 0; p <= i; ++p) {
                newList.clear();
                newList.add(array[i]);
                sum += array[i];
                sum += array[p];
                if (sum <= n) {
                    newList.add(array[p]);
                    int balance = n - sum;
                    if (balance % array[p] == 0) {
                        for (int j = 0; j < balance / array[p]; ++j) {
                            newList.add(array[p]);
                            sum += array[p];
                        }
                    } /*else {
                        newList.add(array[p]);
                        sum += array[p];
                    }*/
                }
                if (sum == n) {
                    int[] temp = new int[newList.size()];
                    for (int q = 0; q < temp.length; ++q) {
                        temp[q] = newList.get(q);
                    }
                    combinationList.add(temp);
                    sum = 0;
                }

            }
        }


        return combinationList;
    }
}
