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
public class Sotrongdoan{
    public static int FirstPos(int a[], int n, int x){
        int l = 0, r = n - 1, ans = -1;
        while(l <= r){
            int mid = (l + r) / 2;
            if(a[mid] >= x){
                ans = mid;
                r = mid - 1;
            }
            else{
                l = mid + 1;
            }
        }
        return ans;
    }
    public static int LastPos(int a[], int n, int x){
        int l = 0, r = n - 1, ans = -1;
        while(l <= r){
            int mid = (l + r) / 2;
            if(a[mid] <= x){
                ans = mid;
                l = mid + 1;
            }
            else{
                r = mid - 1;
            }
        }
        return ans;
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
            int l = sc.nextInt(), r = sc.nextInt();
            int p1 = FirstPos(a,n,l);
            int p2 = LastPos(a,n,r);
            System.out.println(p2 - p1 + 1);
        }
    }
}
/*
 9
 14 14 0 8 2 0 13 2 8
 5
 2 10
 6 6
 1 5
 3 4
 1 3
 */