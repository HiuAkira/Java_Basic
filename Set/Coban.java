import java.util.Scanner;
import java.util.HashSet;
import java.util.ArrayList;
public class Coban{
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashSet<Integer> set = new HashSet<>();
        // set chi luu nhung ptu co gia tri khac nhau
        set.add(1);set.add(3);set.add(1);set.add(2);set.add(2);
        System.out.println(set.size());
        for(int x : set) {
            System.out.print(x + " ");
        }
        set.remove(2); // xoa ptu
        set.contains(2); // ktra xem x co nam trong set khong
    }
}
