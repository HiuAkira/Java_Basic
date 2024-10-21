import java.util.Scanner;

public class Nhanvatxly {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();
        String s2 = sc.nextLine();
        String s3 = sc.nextLine();
        boolean alive = true;
        if(s3.equals("DEAD")) alive = false;
        Nhanvat n = new Nhanvat(Integer.parseInt(s1.substring(8)), Integer.parseInt(s2.substring(8)), alive);
        int m = sc.nextInt();
        sc.nextLine();
        for(int i = 0; i < m; i++){
            String s = sc.nextLine();
            if(s.charAt(0) == 'p'){
                n.pea();
            }
            else if(s.charAt(0) == 'm'){
                n.mushroom();
            }
            else if(s.charAt(0) == 's'){
                n.soldier(Integer.parseInt(s.substring(8)));
            }
            else{
                n.witch(Integer.parseInt(s.substring(6)));
            }
            System.out.println(n);
        }
    }
}