import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;


public class z_Login {
    public static void main(String[] args) {
        JFrame jf = new JFrame("GİRİŞ");
        
        JLabel lb1 = new JLabel("K adı");
        lb1.setBounds(50, 50, 50, 30);
        jf.add(lb1);
        
        JLabel lb2 = new JLabel("Parola");
        lb2.setBounds(50, 100, 50, 30);
        jf.add(lb2);
        
        JTextField tf = new JTextField();
        tf.setBounds(100, 50, 50, 30);
        jf.add(tf);
        
        JTextField tf1 = new JTextField();
        tf1.setBounds(100, 100, 50, 30);
        jf.add(tf1);
        
        JButton bt = new JButton("Giriş");
        bt.setBounds(110, 150, 100, 20);
        jf.add(bt);
        
        JLabel lb = new JLabel("Hoşgeldiniz");
        
        jf.setLayout(null);
        jf.setSize(400, 500);
        jf.setVisible(true);
    }
}
