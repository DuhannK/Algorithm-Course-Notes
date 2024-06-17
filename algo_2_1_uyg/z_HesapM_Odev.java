import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class z_HesapM_Odev extends JFrame implements ActionListener {
    private JTextField ekran; // Ekran alanı
    private String operator; // İşlemci (toplama, çıkarma vb.)
    private double ilkSayi, ikinciSayi; // İşlem yapılacak sayılar

    public z_HesapM_Odev() {
        setTitle("Hesap Makinesi");
        setSize(400, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        ekran = new JTextField();
        ekran.setEditable(false);
        ekran.setHorizontalAlignment(SwingConstants.RIGHT);
        ekran.setFont(new Font("Arial", Font.BOLD, 30));
        add(ekran, BorderLayout.NORTH);

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(4, 4, 10, 10));

        String[] butonlar = {
                "7", "8", "9", "/",
                "4", "5", "6", "*",
                "1", "2", "3", "-",
                "0", "C", "=", "+"
        };

        for (String text : butonlar) {
            JButton buton = new JButton(text);
            buton.setFont(new Font("Arial", Font.BOLD, 20));
            buton.addActionListener(this);
            panel.add(buton);
        }

        add(panel);

        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String komut = e.getActionCommand();

        if (komut.charAt(0) == 'C') {
            ekran.setText("");
        } else if (komut.charAt(0) == '=') {
            ikinciSayi = Double.parseDouble(ekran.getText());
            switch (operator) {
                case "+":
                    ekran.setText(Double.toString(ilkSayi + ikinciSayi));
                    break;
                case "-":
                    ekran.setText(Double.toString(ilkSayi - ikinciSayi));
                    break;
                case "*":
                    ekran.setText(Double.toString(ilkSayi * ikinciSayi));
                    break;
                case "/":
                    ekran.setText(Double.toString(ilkSayi / ikinciSayi));
                    break;
            }
        } else if ("+-*/".contains(komut)) {
            operator = komut;
            ilkSayi = Double.parseDouble(ekran.getText());
            ekran.setText("");
        } else {
            ekran.setText(ekran.getText() + komut);
        }
    }

    public static void main(String[] args) {
        new z_HesapM_Odev();
    }
}
