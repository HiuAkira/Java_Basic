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
public class Capso{
    public static int FirstPos(int a[], int l, int r, int x){
        int ans = -1;
        while(l <= r){
            int mid = (l + r) / 2;
            if(a[mid] == x){
                ans = mid;
                r = mid - 1;
            }
            else if(a[mid] > x){
                r = mid - 1;
            }
            else{
                l = mid + 1;
            }
        }
        return ans;
    }
    public static int LastPos(int a[], int l, int r, int x){
        int ans = -1;
        while(l <= r){
            int mid = (l + r) / 2;
            if(a[mid] == x){
                ans = mid;
                l = mid + 1;
            }
            else if(a[mid] > x){
                r = mid - 1;
            }
            else{
                l = mid + 1;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), s = sc.nextInt();
        int a[] = new int [n];
        for(int i = 0; i < n; i++){
            a[i] = sc.nextInt();
        } 
        Arrays.sort(a);
        long ans = 0;
        for(int i = 0; i < n; i++){
            int p1 = FirstPos(a, i + 1, n - 1, a[i] + s);
            int p2 = LastPos(a, i + 1, n - 1, a[i] + s);
            if(p1 != - 1) ans += p2 - p1 + 1;
        }
        System.out.println(ans);
    }
}
/*
 10 2
 4 2 2 6 0 8 3 1 0 7
 */