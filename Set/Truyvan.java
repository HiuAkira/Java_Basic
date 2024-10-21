import java.util.Scanner;
import java.util.HashSet;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;
import java.util.TreeSet;
import java.util.Map;
public class Truyvan{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashMap<Integer, Integer> map = new HashMap<>();
        int n = sc.nextInt();
        // dem tan so xuat hien trong mang
        for(int i = 0; i < n; i++)
        {
            int x = sc.nextInt();
            if(map.containsKey(x)){
                map.put(x, map.get(x) + 1);
            }
            else{
                map.put(x,1);
            }
        }
        int q = sc.nextInt();
        for(int i = 0; i < q; i++)
        {
            int tt = sc.nextInt(), x = sc.nextInt();
            if(tt == 1){
                if(map.containsKey(x)){
                    map.put(x, map.get(x) + 1);
                }
                else{
                    map.put(x,1);
                }
            }
            else if(tt == 2){
                if(map.containsKey(x)){
                    map.put(x, map.get(x) - 1);
                    if(map.get(x) == 0){
                        map.remove(x);
                    }
                }
            }
            else{
                if(map.containsKey(x)) System.out.println("YES");
                else System.out.println("NO");
            }
        }
    }
}
