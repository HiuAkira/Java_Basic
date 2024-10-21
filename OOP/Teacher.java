public class Teacher extends Covatro {
    private String khoa;
    private int luong;
    public Teacher(String khoa, int luong, String ma, String ten, String ngaySinh, String diaChi){
    super(ma, ten, ngaySinh, diaChi);
    this.khoa = khoa;
    this.luong = luong;
    @Override
    public String toString(){
        return super.toString() + " " + khoa + " " + luong;
    }
}