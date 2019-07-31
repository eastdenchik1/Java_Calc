package main;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CalcGUI extends JFrame {


    private JPanel panel1;
    private JButton a1Button;
    private JButton a4Button;
    private JButton a7Button;
    private JButton button4;
    private JButton a2Button;
    private JButton a5Button;
    private JButton a8Button;
    private JButton a0Button;
    private JButton a3Button;
    private JButton a6Button;
    private JButton a9Button;
    private JButton button12;
    private JTextField textField1;
    private JButton button1;
    private JButton button2;
    private JButton button3;
    private JButton enterButton;

    public CalcGUI() {
        super("Калькулятор на Java");
        setBounds(100,100,300,300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        setResizable(false);
        setContentPane(panel1);
        UIManager.getSystemLookAndFeelClassName();

        a0Button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                textField1.setText("0");
            }
        });
        a1Button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                textField1.setText("1");
            }
        });
        a2Button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                textField1.setText("2");
            }
        });
        a3Button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                textField1.setText("3");
            }
        });
        a4Button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                textField1.setText("4");
            }
        });
        a5Button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                textField1.setText("5");
            }
        });
        a6Button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                textField1.setText("6");
            }
        });
        a7Button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                textField1.setText("7");
            }
        });
        a8Button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                textField1.setText("8");
            }
        });
        a9Button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                textField1.setText("9");
            }
        });
    }

    public static void main(String[] args) {
        new CalcGUI();
    }

}
