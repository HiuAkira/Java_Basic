public class Persons {

    private String ten, ngaySinh, diaChi;
    public Persons(String ten, String ngaySinh, String diaChi){
        this.ten = ten;
        this.ngaySinh = ngaySinh;
        this.diaChi = diaChi;
    }
    public Persons(){
        ten = "";
        ngaySinh = "";
        diaChi = "";
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
    public String sxName(){
        String a[] = ten.split("\\s+");
        String res = a[a.length - 1];
        for(int i = 0; i < a.length - 1; i++){
            res += a[i] + " ";
        }
        return res.trim();
    }
    @Override
    public String toString(){
        return ten + " " + ngaySinh + " " + diaChi;
    }
}