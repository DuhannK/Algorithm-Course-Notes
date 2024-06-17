
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class z_NotHesapla {

    public static void main(String[] args) {
        JFrame jf = new JFrame("Not Hesapla");

        JLabel lb1 = new JLabel("Vize");
        lb1.setBounds(50, 50, 50, 30);
        jf.add(lb1);

        JLabel lb2 = new JLabel("Final");
        lb2.setBounds(50, 100, 50, 30);
        jf.add(lb2);

        JTextField tf = new JTextField();
        tf.setBounds(100, 50, 50, 30);
        jf.add(tf);

        JTextField tf1 = new JTextField();
        tf1.setBounds(100, 100, 50, 30);
        jf.add(tf1);

        JButton btn = new JButton("Ortalama Hesapla");
        btn.setBounds(125, 150, 150, 20);
        jf.add(btn);

        JLabel lb3 = new JLabel("Vize");
        lb3.setBounds(110, 200, 100, 30);
        jf.add(lb3);

        JLabel lb4 = new JLabel("Final");
        lb4.setBounds(110, 250, 100, 30);
        jf.add(lb4);

        jf.setLayout(null);
        jf.setSize(400, 500);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Pencereyi kapatma ayarı
        jf.setVisible(true);

        btn.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent e) {
                int v, f;
                double ort;

                v = Integer.parseInt(tf.getText());
                f = Integer.parseInt(tf1.getText());

                ort = v * 0.4 + f * 0.6;
                lb3.setText("Sonuç : " + Double.toString(ort));
                
                if(ort < 50 || f < 50){
                    lb4.setText("Kaldı");
                }
                else {
                    lb4.setText("Geçti");
                }
            }
        });
    }
}
