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
public class Lonnhohai{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        TreeSet<Integer> set = new TreeSet<>();
        int n = sc.nextInt();
        for(int i = 0; i < n; i++)
        {
            set.add(sc.nextInt());
        }
        System.out.println(set.size());
        System.out.println(set.last() + " " + set.first());
        System.out.println(set.lower(set.last()) + " " + set.higher(set.first()));
    }
}
