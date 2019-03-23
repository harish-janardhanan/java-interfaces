
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;
import java.util.stream.Collectors;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class HackerRankPractice {

    public static void main(String[] args) {
        List<Integer> chocolateBar = new ArrayList<>();

        chocolateBar.add(4);
/*        chocolateBar.add(1);
        chocolateBar.add(1);
        chocolateBar.add(1);
        chocolateBar.add(1);*/

        int[][] array = new int[6][6];
        try {
            Files.readAllBytes(Paths.get(new URI("file:///c:/repositories/java-practice-repository/codePractice/src/main/resources/testData.txt")));
        }
        catch (URISyntaxException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }


        int a[] = {2,4,6,8,3};
        rotate(a,4);
    }

    static void insertionSort1(int n, int[] arr) {
        List<Integer> list = new ArrayList<>();

        for (int i : arr){
            list.add(i);
        }
        int unordered = list.get(n-1);
        for (int i = n -2; i >=0 ; --i){
            if (unordered < list.get(i)){
                list.set(i +1 , list.get(i));
                System.out.println(list.toString().replace(",", "")
                .replace("[", "")
                .replace("]",""));
            }
            else
                list.set(i+1, unordered);
        }

        System.out.println(list.toString().replace(",", "")
                .replace("[", "")
                .replace("]",""));

    }

    static int[] rotate(int[] a, int d){
        List<Integer> list = new ArrayList<>();
        for (int i1 : a) {
            list.add(i1);
        }

        Collections.rotate(list, list.size()-d);

        int[] b = new int[list.size()];

        for (int i = 0 ; i < list.size();++i ){
            b[i] = list.get(i);
        }
          System.out.println(list.toString().replace(",","")
         .replace("[","").replace("]",""));
        return b;

    }

    static int convertToInt(String number){
        //your code goes here. You should implement an integer parser
        Map<String,Integer> newMap = new HashMap<>();
        List<Integer> newList = new ArrayList<>();
        boolean isNegative = false;

        newMap.put("0",0);
        newMap.put("1",1);
        newMap.put("2",2);
        newMap.put("3",3);
        newMap.put("4",4);
        newMap.put("5",5);
        newMap.put("6",6);
        newMap.put("7",7);
        newMap.put("8",8);
        newMap.put("9",9);


        for ( int i =0; i < number.length() ; ++i){
            if(String.valueOf(number.charAt(i)).equals("-")){
                isNegative = true;
                continue;
            }
            newList.add(newMap.get(String.valueOf(number.charAt(i))));
        }

        int j = newList.size() -1;
        System.out.println(newList);
        int integer =0;

        for (Integer integer1 : newList) {
            integer += Math.pow(10, j) * integer1;
            j--;
        }
        return isNegative ? integer * -1 : integer;
    }

    static void minimumBribes(int[] a){
     //   Map<Integer,Integer> swapMap= new HashMap<>();
        List<Integer> list = new ArrayList<>();
        for (int i1 : a) {
            list.add(i1);
       //     swapMap.put(i1,0);
        }
        int swapCounter = 0;
        boolean isChaotic = false;

        for (int i = 0 ; i < list.size(); ++i){
            for (int j = i ; j < list.size();++j){
                if (list.get(i) > list.get(j)){
                    Collections.swap(list,i,j);
                 //   int personCounter = swapMap.get(list.get(j)) + 1;
                   // swapMap.put(list.get(j),personCounter);
                    swapCounter++;
                }

            }
        }

        if(isChaotic)
            System.out.println("Too chaotic") ;
        else
            System.out.println(swapCounter);

    }


    static int hourglassSum(int[][] arr) {
        List<Integer> sumSet = new ArrayList<>();


        for (int i = 0; i < 4; ++i) {
            for (int j = i; j < 4; ++j) {

                sumSet.add(arr[i][j] + arr[i][j + 1] + arr[i][j + 2] + arr[i + 1][j + 1] + arr[i + 2][j + 1] + arr[i + 2][j + 2] + arr[i + 2][j + 2]);
            }
        }
        sumSet = sumSet.stream().sorted().collect(Collectors.toList());

        return sumSet.get(0);

    }

    public static void addDataTypes(){


        }

    static List<Integer> compareTriplets(List<Integer> a, List<Integer> b) {
        Integer alicePoints = 0;
        Integer bobPoints = 0;
        List<Integer>  pointsList = new ArrayList<>();


        for (int i = 0 ; i < a.size(); ++i){
            if (a.get(i) > b.get(i))
                alicePoints++;
            else if (a.get(i) < b.get(i))
                bobPoints++;
        }

        pointsList.add(alicePoints);
        pointsList.add(bobPoints);
        return pointsList;
    }

    static int birthday(int[] ints, int d, int m) {
        List<Integer> s = new ArrayList<>();
        for(int i=0 ; i< ints.length; ++i ){
            s.add(ints[i]);
        }
        int count = 0;

        for (int i = 0; i < s.size(); ++i) {
            int sum = 0;
            int month = m;
            for (int j = i; j < s.size(); ++j) {
                sum = sum + s.get(j);
                month--;
                if (month == 0) {
                    if (sum == d) {
                        count++;
                        break;
                    }
                    break;
                }
            }
        }

        return count;
    }


}
