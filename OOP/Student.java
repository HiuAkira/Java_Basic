public class Student extends Covatro {
    private String lop;
    private double gpa;
    public Student(String lop, double gpa, String ma, String ten, String ngaySinh, String diaChi){
        super(ma, ten, ngaySinh, diaChi);
        this.lop = lop;
        this.gpa = gpa;
    }
    @Override
    public String toString(){
        return super.toString() + " " + lop + " " + String.format("%.2f", gpa);
    }
}