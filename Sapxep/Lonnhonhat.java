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
public class Lonnhonhat{
    public static int LastPos(int a[], int n, int x){
        int l = 0, r = n - 1, ans = -1;
        while(l <= r){
            int mid = (l + r) / 2;
            if(a[mid] <= x){
                ans = a[mid];
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
        int res = LastPos(a,n,x);
        if(res == -1) System.out.println("NOT FOUND");
        else System.out.println(res);
    }
}
/*
 10 3
 1 2 2 2 2 4 5 6 7 110
 */