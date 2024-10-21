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
public class Lonhon{
    public static int FirstPos(int a[], int n, int x){
        int l = 0, r = n - 1, ans = -1;
        while(l <= r){
            int mid = (l + r) / 2;
            if(a[mid] > x){
                ans = mid;
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
        int n = sc.nextInt(), m = sc.nextInt();
        int a[] = new int [n];
        int b[] = new int [m];
        for(int i = 0; i < n; i++){
            a[i] = sc.nextInt();
        }
        for(int i = 0; i < m; i++){
            b[i] = sc.nextInt();
        }
        Arrays.sort(b);
        for(int i = 0; i < n; i++){
            int res = FirstPos(b,m,a[i]);
            if(res == -1) System.out.print("0 ");
            else System.out.print(m - res + " ");
        }
    }
}
/*
13 8
6 2 0 2 2 9 2 7 0 9 8 7 7
7 7 3 4 6 3 0 8
 */