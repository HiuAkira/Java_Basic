import java.util.ArrayList;
import java.util.Scanner;

public class Covatroxuly {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Student> a1 = new ArrayList<>();
        ArrayList<Giaovien> a2 = new ArrayList<>();
        for(int i = 0; i < n; i++)
        {
            String ma, ten, ngaySing, diaChi, khoa, lop;
            double gpa;
            int luong;
            sc.nextLine();
            ma = sc.nextLine();
            if(ma.charAt(0) == 'G'){
                ten = sc.nextLine();
                ngaySinh = sc.nextLine();
                diaChi = sc.nextLine();
                khoa = sc.nextLine();
                luong = sc.nextInt();
                Giaovien u = new Giaovien(khoa, luong, ma, ten, ngaySing, diaChi);
                u.chuanHoa();
                a2.add(u);
            }
            else{
                ten = sc.nextLine();
                ngaySinh = sc.nextLine();
                diaChi = sc.nextLine();
                lop = sc.nextLine();
                gpa = sc.nextDouble();
                Student v = new Student(lop, gpa, ma, ten, ngaySing, diaChi);
                v.chuanHoa();
                a1.add(v);
            }
        }
        System.out.println("DANH SACH GIAO VIEN :");
        for(Giaovien x : a2){
            System.out.println(x);
        }
        System.out.println("Danh SACH SINH VIEN :");
        for(Student x : a1){
            System.out.println(x);
        }
    }
}