public class Covatro {
    private String ma, ten, ngaySinh, diaChi;
    public Covatro(String ma, String ten, String ngaySinh, String diaChi){
        this.ma = ma;
        this.ten = ten;
        this.ngaySinh = ngaySinh;
        this.diaChi = diaChi;
    }
    public Covatro(){
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
    @Override
    public String toString(){
        return ma + " " + ten + " " + ngaySinh + " " + diaChi;
    }
}