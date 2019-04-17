package hackerrank;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class StringAndLoop {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = scanner.nextInt();
        int a = 3, b = 5;
        for (int i =0; i < number ; ++i){
            String odd ="";
            Stack<String> newStack = new Stack<>();
            ArrayDeque<String> newQueue = new ArrayDeque<>();
            String even = "";


            String s = scanner.next();
            for (int j = 0 ; j < s.length(); ++j){

                if (j == 0)
                    even+= s.substring(0,1);
                else if (j % 2 ==0){
                    even+=s.substring(j, j+1);
                }
                else
                    odd+= s.substring(j,j+1);
            }
            System.out.println(even + " " + odd);

        }
    }
}
