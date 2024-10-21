
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
public class Sapxephieu{
    public static int chan(int n){
        if(n == 0) return 1;
        int cnt = 0;
        while(n != 0){
            if(n % 2 == 0) ++cnt;
            n /= 10;
        }
        return cnt;
    }
    public static int le(int n){
        int cnt = 0;
        while(n != 0){
            if(n % 2 != 0) ++cnt;
            n /= 10;
        }
        return cnt;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), x = sc.nextInt();
        Integer a[] = new Integer[n];
        Integer b[] = new Integer[n];
        for(int i = 0; i < n; i++){
            a[i] = sc.nextInt();
            b[i] = a[i];
        }
        Arrays.sort(a, new Comparator<Integer>(){
            @Override
            public int compare(Integer o1, Integer o2){
                if(Math.abs(o1 - x) != Math.abs(o2 - x)) return Math.abs(o1 - x) - Math.abs(o2 - x);
                else return o1 - o2;
            }
        });
        for(int i = 0; i < n; i++){
            System.out.print(a[i] + " ");
        }
        Arrays.sort(b, new Comparator<Integer>(){
            @Override
            public int compare(Integer o1, Integer o2){
                int r1 = o1 % 2, r2 = o2 % 2;
                if(r1 == 0 && r2 == 0) return o1 - o2;
                else if(r1 == 1 && r2 == 1) return o2 - o1;
                else if(r1 == 0 && r2 == 1) return -1;
                else return 1;
            }
        });
        System.out.println("");
        for(int i = 0; i < n; i++){
            System.out.print(b[i] + " ");
        }
    }   
}
/*14 26
83 86 49 15 31 81 33 10 77 38 49 86 71 28*/