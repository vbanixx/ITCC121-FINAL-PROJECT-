import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class log_in extends JFrame{
    private JButton button1;
    private JPanel mainP;
    private JTextField textField1;
    private JTextField textField2;

    public log_in() {
        setTitle("SIGN IN");
        setSize(500,500);
       setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setContentPane(mainP);

        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new main().setVisible(true);

                String name = textField1.getText();
                String lname = textField2.getText();

                JOptionPane.showMessageDialog(log_in.this,
                        "Welcome ma'am/sir " + name +" "+ lname +"\n" + "This is our final project for ITCC121" );

            }
        });
    }

    public static void main(String[] args) {
        new log_in().setVisible(true);
    }
}
