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
public class Nhohon{
    public static int LastPos(int a[], int n, int x){
        int l = 0, r = n - 1, ans = -1;
        while(l <= r){
            int mid = (l + r) / 2;
            if(a[mid] < x){
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
            int res = LastPos(b,m,a[i]);
            System.out.print(res + 1 + " ");
        }
    }
}
/*
5 8
2 8 7 2 8
9 3 7 1 0 4 1 5
 */