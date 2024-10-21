
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
public class Xuathien{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        for(int i = 0; i < n; i++){
            a[i] = sc.nextInt();
        }
        Arrays.sort(a);
        int cnt = 1, ans = 1, res = a[0];
        for(int i = 1; i < n; i++){
            if(a[i] == a[i - 1])
            {
                ++cnt;
            }
            else{
                if(cnt > ans){
                    ans = cnt;
                    res = a[i - 1];
                }
                cnt = 1;
            }
        }
        if(cnt > ans){
            ans = cnt;
            res = a[n - 1];
        }
        System.out.print(res + " " + ans);
    }   
}
/*14 26
83 86 49 15 31 81 33 10 77 38 49 86 71 28*/