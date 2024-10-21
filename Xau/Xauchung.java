import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.HashMap;
import java.util.TreeMap;
import java.util.TreeSet;
public class Xauchung {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine().toLowerCase();
        String t = sc.nextLine().toLowerCase();
        String a[] = s.split("\\s+");
        String b[] = t.split("\\s+");
        TreeSet<String> set1 = new TreeSet<>();
        TreeSet<String> set2 = new TreeSet<>();
        for(String x : a) {
            set1.add(x);
        }
        for(String x : b){
            set2.add(x);
        }
        for(String x : set1){
            if(set2.contains(x)){
                System.out.print(x + " ");
            }
        }
    }
}
