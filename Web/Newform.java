import javax.swing.JFrame;

public class Newform extends JFrame {
    public Newform(){
        this.setTitle("Bangmoi");
        this.setSize(300, 400); // size
        this.setLocationRelativeTo(null); // Hien thi form nam o giua man hinh
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Giup cho chuong trinh dong
        this.setLayout(null); // set cai frame ko theo cai Layout nao
        this.setVisible(true); // hien thi cai form day len
    }
    public static void main(String[] args) {
        new Newform();
    }
}