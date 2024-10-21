public class Sxmavagpa {

    private String masv, ten, ngaySinh, lop;
    private double gpa;
    public Sxmavagpa(String masv, String ten, String lop, String ngaySinh, double gpa){
        this.masv = masv;
        this.ten = ten;
        this.ngaySinh = ngaySinh;
        this.lop = lop;
        this.gpa = gpa;
    }
    public void chuanHoa(){
        String a[] = ten.trim().split("\\s+");
        String name = "";
        for(String x : a){
            name += Character.toUpperCase(x.charAt(0));
            for(int i = 1; i < x.length(); i++){
                name += Character.toLowerCase(x.charAt(i));
            }
            name += " ";
        }
        ten = name.trim();
        StringBuilder sb = new StringBuilder(ngaySinh);
        if(sb.charAt(1) == '/') sb.insert(0, "0");
        if(sb.charAt(4) == '/') sb.insert(3, "0");
        ngaySinh = sb.toString();
    }
    public String getMasv(){
        return masv;
    }
    public double getGpa(){
        return gpa;
    }
    public String toString(){
        return masv + " " + ten + " " + lop + " " + ngaySinh + " " + String.format("%.2f", gpa);
    }
}