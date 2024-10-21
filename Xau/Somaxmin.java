import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.HashMap;
import java.util.TreeMap;
import java.util.TreeSet;
public class Somaxmin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt(), s = sc.nextInt();
        if(s > 9  * m || (s == 0 && m > 1)){
            System.out.println("NOT FOUND");
        }
        else{
            int x[] = new int[m];
            int y[] = new int[m];
            int t = s;
            for(int i = 0; i < m; i++){
                if(s >= 9){
                    x[i] = 9;
                    s -= 9;
                }
                else{
                    x[i] = s;
                    s = 0;
                }
            }
            --t;
            for(int i = m - 1; i > 0; i--){
                if(t >= 9){
                    y[i] = 9;
                    t -= 9;
                }
                else {
                    y[i] = t;
                    t = 0;
                }
            }
            y[0] = t + 1;
            for(int v : y){
                System.out.print(v);
            }
            System.out.println("");
            for(int u : x){
                System.out.print(u);
            }
        }
    }
}
