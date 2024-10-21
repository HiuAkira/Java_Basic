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
public class Difference{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        TreeSet<Integer> set1 = new TreeSet<>();
        HashSet<Integer> set2 = new HashSet<>();
        int n = sc.nextInt(), m = sc.nextInt();
        int a[] = new int[1000001];
        int b[] = new int[1000001];
        for(int i = 0; i < n; i++)
        {
            set1.add(sc.nextInt());
        }
        for(int i = 0; i < m; i++)
        {
            set2.add(sc.nextInt());
        }
        for(int x : set1){ // xuat hien o mang 1 ma ko xuat hien o mang 2
            if(set2.contains(x) == false){
                System.out.print(x + " ");
            }
        }
    }
}
