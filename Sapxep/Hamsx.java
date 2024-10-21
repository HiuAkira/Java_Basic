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
public class Hamsx{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a[] = {3, 1, 2, 4, 5, 9, 10, 8, 7, 6};
        Arrays.sort(a);
        for(int x : a){
            System.out.print(x + " ");
        }
    }
}
