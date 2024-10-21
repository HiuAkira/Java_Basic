import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.HashMap;
import java.util.TreeMap;
public class Timxau {
    public static int check(String s){
        String res = "python";
        int i = 0;
        for(char x : s.toCharArray()){
            if(x == res.charAt(i)){
                i++;
            }
            if(i == 6) return 1;
        }
        return 0;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        if(check(s) == 1){
            System.out.println("YES");
        }
        else{
            System.out.println("NO");
        }
    }
}
