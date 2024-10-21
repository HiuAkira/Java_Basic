import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Sxmavagpas {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Sxmavagpa a[] = new Sxmavagpa[n];
        for(int i = 0; i < n; i++){
            String masv = String.format("%03d", i + 1); // i = 1 : 002
            masv = "SV" + masv;
            sc.nextLine();
            a[i] = new Sxmavagpa(masv, sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextDouble());
            a[i].chuanHoa();
        }
        Arrays.sort(a, new Comparator<Sxmavagpa>() {
            public int compare(Sxmavagpa x, Sxmavagpa y){
                if(x.getGpa() != y.getGpa()){
                    if( (x.getGpa()) > (y.getGpa()) ) return -1;
                    else return 1;
                }
                else{
                    return x.getMasv().compareTo(y.getMasv());
                }
            }
        });
        for(Sxmavagpa x : a){
            System.out.println(x);
        }
    }
}