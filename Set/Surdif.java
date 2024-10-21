import java.util.Scanner;
import java.util.HashSet;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.Map;
public class Surdif{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        TreeSet<Integer> set = new TreeSet<>();
        HashSet<Integer> set1 = new HashSet<>();
        HashSet<Integer> set2 = new HashSet<>();
        int n = sc.nextInt(), m = sc.nextInt();
        for(int i = 0; i < n; i++)
        {
            int x = sc.nextInt();
            set1.add(x);
            set.add(x);
        }
        for(int i = 0; i < m; i++)
        {
            int x = sc.nextInt();
            set2.add(x);
            set.add(x);
        }
        for(int x : set){
            if(set1.contains(x) == false || set2.contains(x) == false){
                System.out.print(x + " ");
            }
        }
    }
}
