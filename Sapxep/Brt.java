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
public class Brt{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int [n];
        for(int i = 0; i < n; i++){
            a[i] = sc.nextInt();
        } 
        Arrays.sort(a);
        int ans = Integer.MAX_VALUE;
        int count = 0;
        for(int i = 1; i < n; i++){
            if(a[i] - a[i - 1] < ans){
                ans = a[i] - a[i - 1];
                count = 1;
            }
            else if(a[i] - a[i - 1] == ans){
                ++count;
            }
        }
        System.out.println(ans + " " + count);
    }
}
/*
 4
 6 -3 0 4
 */