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
public class Xuathienyn{
    public static boolean Binary(int a[], int n, int x){
        int l = 0, r = n - 1;
        while(l <= r){
            int mid = ( l + r ) / 2;
            if(a[mid] == x) return true;
            else if(a[mid] < x){
                l = mid + 1;
            }
            else{
                r = mid - 1;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int [n];
        for(int i = 0; i < n; i++){
            a[i] = sc.nextInt();
        }
        Arrays.sort(a);
        int q = sc.nextInt();
        for(int i = 0; i < q; i++){
            int x = sc.nextInt();
            boolean ok = false;
            for(int j = 0; j < n; j++){
                if(Binary(a, n, x))
                {
                    ok = true;
                    break;
                }
            } 
            if(ok == true) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}