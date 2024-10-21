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
public class Sufquery{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        TreeSet<Integer> set1 = new TreeSet<>();
        HashSet<Integer> set2 = new HashSet<>();
        int n = sc.nextInt();
        int a[] = new int[1000001];
        for(int i = 0; i < n; i++)
        {
            a[i] = sc.nextInt();
        }
        int f[] = new int[1000001];
        HashSet<Integer> set = new HashSet<>();
        for(int i = n - 1; i >= 0; i--){
            set.add(a[i]);
            f[i] = set.size();
        }
        int t = sc.nextInt();
        for(int i = 0; i < t; i++){
            int x = sc.nextInt();
            System.out.println(f[x]);
        }
    }
}
