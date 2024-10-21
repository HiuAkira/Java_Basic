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
public class Binarysearch{
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
    public static int firstPos(int a[], int n, int x){
        int l = 0, r = n - 1, ans = -1;
        while(l <= r){
            int mid = (l + r) / 2;
            if(a[mid] == x){
                ans = mid;
                r = mid - 1;
            }
            else if(a[mid] < x){
                l = mid + 1;
            }
            else{
                r = mid - 1;
            }
        }
        return ans;
    }
    public static int LastPos(int a[], int n, int x){
        int l = 0, r = n - 1, ans = -1;
        while(l <= r){
            int mid = (l + r) / 2;
            if(a[mid] == x){
                ans = mid;
                l = mid + 1;
            }
            else if(a[mid] < x){
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
        int n = sc.nextInt(), x = sc.nextInt();
        int a[] = new int [n];
        for(int i = 0; i < n; i++){
            a[i] = sc.nextInt();
        }
        for(int i = 0; i < n; i++){
            if(Binary(a, n, x))
            {
                System.out.print("YES");
                break;
            }
            else {
                System.out.print("NO");
                break;
            }
        }
        System.out.println("");
        System.out.println(firstPos(a, n, x));
        System.out.println(LastPos(a,n,x));
    }
}
/*
 16 9
0 1 2 3 3 3 7 7 8 8 11 11 12 12 15 15
10 3
1 1 1 2 2 2 3 3 3 3
 */