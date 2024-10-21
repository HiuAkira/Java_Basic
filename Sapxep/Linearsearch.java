import java.util.Scanner;
import java.util.HashSet;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.Map;
public class Linearsearch{
    public static boolean Lisearch(int a[], int n, int x){
        for(int i = 0; i < n; i++){
            if(a[i] == x) return true;
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), x = sc.nextInt();
        int a[] = new int [n];
        for(int i = 0; i < n; i++){
            a[i] = sc.nextInt();
        }
        for(int i = 0; i < n; i++){
            if(Lisearch(a, n, x))
            {
                System.out.println("YES");
                break;
            }
            else {
                System.out.println("NO");
                break;
            }
        }

    }
}
