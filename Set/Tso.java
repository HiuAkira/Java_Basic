import java.util.Scanner;
import java.util.HashSet;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.Map;
public class Tso{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[1000001];
        int dem[] = new int[1000001];
        for(int i = 1; i <= n; i++){
            a[i] = sc.nextInt();
            dem[a[i]]++;
        }
        for(int i = 1; i <= n; i++){
            if(dem[a[i]] != 0) System.out.print(dem[a[i]] + " ");
        }
    }
}
