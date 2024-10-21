import javax.swing.Action;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class LapTrinhGiaoDien {
    public static void main(String[] args) {
        JFrame frame = new JFrame("New Form"); 
        frame.setSize(300, 400); // size
        frame.setLocationRelativeTo(null); // Hien thi form nam o giua man hinh
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Giup cho chuong trinh dong
        frame.setLayout(null); // set cai frame ko theo cai Layout nao
        frame.setVisible(true); // hien thi cai form day len 

        JButton btn = new JButton("Click!");
        frame.add(btn);
        btn.setBounds(30, 30, 100, 30); // khoang cach, chieu dai va chieu cao
        btn.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                System.out.println("Love you");
            }
        }); 

        JTextField jtf = new JTextField();
        frame.add(jtf);
        jtf.setBounds(140, 30, 120, 30);
        btn.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                System.out.println(jtf.getText());
                jtf.setText("Java programming");
            }
        }); 

    }
}