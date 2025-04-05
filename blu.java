import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class blu extends JFrame {
    private JTextField textField1;
    private JTextField textField2;
    private JTextField textField3;
    private JTextField textField5;
    private JTextField textField6;
    private JTextField textField7;
    private JTextField textField8;
    private JTextField textField9;
    private JButton CONFIRM;
    private JTextField textField10;
    private JTextField textField11;
    private JTextField textField12;
    private JLabel result;
    private JPanel mainP2;
    private JButton Calculate;
    private JButton BACKButton;

    public blu() {
        setTitle("BLUE SECUSANA RECORD");
        setSize(500,500);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setContentPane(mainP2);

        CONFIRM.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String name = textField1.getText();
                String section = textField2.getText();
                String Course = textField3.getText();

                JOptionPane.showMessageDialog(blu.this,
                        "Name: " + name + "\n" +
                                "Section:  " + section + "\n" +
                                "Course: " + Course + "\n" );
                add();
                double average = Double.parseDouble(result.getText());
                if(average <= 3.0){
                    new blu().setVisible(true);
                } else {
                    JOptionPane.showMessageDialog(blu.this,"Sorry, You failed to obtain the passing score " +"Mr."+ name );

                }
                double averag = Double.parseDouble(result.getText());
                if(averag >= 3.0){
                    new blu().setVisible(true);
                } else {
                    JOptionPane.showMessageDialog(blu.this,"Congrats, you pass this semester " +"Mr."+ name );

                }
new main().setVisible(true);

            }});

        Calculate.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cal();
            }});
        BACKButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new main().setVisible(true);
            }});}

    public void add() {
        try {
            double cc1 = Double.parseDouble(textField5.getText());
            double cc2 = Double.parseDouble(textField6.getText());
            double pe = Double.parseDouble(textField7.getText());
            double pc = Double.parseDouble(textField8.getText());
            double math = Double.parseDouble(textField9.getText());
            double eng = Double.parseDouble(textField10.getText());
            double ns1 = Double.parseDouble(textField11.getText());
            double nstp = Double.parseDouble(textField12.getText());

            Double sub = cc1 + cc2 + pe + pc + math + eng + ns1 + nstp;
            Double total = sub /8;
            result.setText(String.valueOf(total));
        } catch (NumberFormatException e) {
            result.setText("INVALID");
        }}
        public void cal(){
        try {
            double cc1 = Double.parseDouble(textField5.getText());
            double cc2 = Double.parseDouble(textField6.getText());
            double pe = Double.parseDouble(textField7.getText());
            double pc = Double.parseDouble(textField8.getText());
            double math = Double.parseDouble(textField9.getText());
            double eng = Double.parseDouble(textField10.getText());
            double ns1 = Double.parseDouble(textField11.getText());
            double nstp = Double.parseDouble(textField12.getText());

            Double sub = cc1 + cc2 + pe + pc + math + eng + ns1 + nstp;
            Double total = sub /8;
            result.setText(String.valueOf(total));
        } catch (NumberFormatException e) {
            result.setText("INVALID");
        }}
    public static void main(String[] args) {
        new blu().setVisible(true);
    }
}