import java.util.Scanner;
public class NhapXuat_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = 1000, b = 300;
        int tong = a + b;
        int hieu = a - b;
        int tich = a * b;
        int thuong = a / b;
        int du = a % b;
        System.out.println(tong + " " + hieu + " " + tich + " " + thuong + " " + du);
        float thuong = (float)a / b; // 1.0f* a / b;
        
        System.out.printf("%.2f", thuong);
    }
}