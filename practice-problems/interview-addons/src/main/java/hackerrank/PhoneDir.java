package hackerrank;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class PhoneDir {

    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        Map<String,Integer> directory = new HashMap<>();
        for(int i = 0; i < n; i++){
            String name = in.next();
            int phone = in.nextInt();
            directory.put(name,phone);
        }
        while(in.hasNext()){
            String s = in.next();
            try {
                String phone = directory.get(s).toString();
                System.out.println(s + "=" +phone);
            }catch (NullPointerException b){
                System.out.println("Not Found");
            }
        }
        in.close();
    }
}
