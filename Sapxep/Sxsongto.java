
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
public class Sxsongto{
    public static int dem(int n){
        int ans = 0;
        while(n != 0){
            int r = n % 10;
            if(r == 2 || r == 3 || r == 5 || r == 7) ++ ans;
            n /= 10;
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), x = sc.nextInt();
        Integer a[] = new Integer[n];
        for(int i = 0; i < n; i++){
            a[i] = sc.nextInt();
        }
        Arrays.sort(a, new Comparator<Integer>(){
            @Override
            public int compare(Integer o1, Integer o2){
                return dem(o2) - dem(o1);
            }
        });
        for(int i = 0; i < n; i++){
            System.out.print(a[i] + " ");
        }
    }   
}
/* 
18
16501 5898 7388 26663 17330 15803 6865 3695 3495 20918 4244 580 29707 5410 11716 4765 12423 10073 
*/