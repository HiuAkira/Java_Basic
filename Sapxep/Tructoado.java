
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
public class Tructoado{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[][] = new int [n][2];
        for(int i = 0; i < n; i++){
            a[i][0] = sc.nextInt();
            a[i][1] = sc.nextInt();
        }
        Arrays.sort(a, new Comparator<int []>() {
            @Override
            public int compare(int o1[], int o2[]){
                int kc1 = o1[0] * o1[0] + o1[1] * o1[1];
                int kc2 = o2[0] * o2[0] + o2[1] * o2[1];
                if(kc1 != kc2) return kc1 - kc2;
                else if(o1[0] != o2[0]) return o1[0] - o2[0];
                return o1[1] - o2[1];
            }
        });
        for(int i = 0; i < n; i++){
            System.out.println(a[i][0] + " " + a[i][1]);
        }
    }   
}
/* 
13
-42 -76
47 43
12 7
-62 31
7 64
42 -92
-89 60
45 41
3 54
-41 40
20 -24
88 42
0 12
 */