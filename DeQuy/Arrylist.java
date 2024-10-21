import java.util.Scanner;
import java.util.ArrayList;
public class Arrylist{
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> arr = new ArrayList<>();
        /*arr.add(3);
        arr.add(1);
        arr.add(2);
        arr.add(4);
        System.out.println(arr.size());
        for(int i = 0; i < arr.size(); i++)
        {
            System.out.println(arr.get(i) + " ");
        }*/
        int n = sc.nextInt();
        for(int i = 0; i < n; i++)
        {
            int tmp = sc.nextInt();
            arr.add(tmp); // cho cac ptu vao arry
        }
        for(int x : arr)
        {
            System.out.print(x + " ");
        }
        System.out.println(arr.contains(3)); // ktra ptu co trong mang khong
        arr.remove(1); // xoa theo chi so index
        arr.remove((Object)(3)); // xoa phan tu theo gia tri chi xoa ptu dau tien
    }
}
