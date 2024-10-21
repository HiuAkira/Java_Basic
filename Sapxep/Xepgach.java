import java.util.Scanner;
import java.util.HashSet;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.Map;
public class Xepgach{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Integer a[] = new Integer[n];
        for(int i = 0; i < n; i++){
            a[i] = sc.nextInt();
        }
        Arrays.sort(a, Collections.reverseOrder());
        int dem = 1, docung = a[0];
        for(int i = 1; i < n; i++){
            if(docung <= 0) break;
            ++dem;
            docung = Math.min(a[i],docung - 1);
        }
        System.out.println(dem);
    }   
}
