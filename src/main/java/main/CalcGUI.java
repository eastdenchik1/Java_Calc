package main;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

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
    private JButton clearButton;
    private JButton button5;
    private JButton button6;

    public CalcGUI() {
        super("Калькулятор на Java");
        setBounds(100,100,300,300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        setResizable(false);
        setContentPane(panel1);


        a0Button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                textField1.setText(textField1.getText() + "0");
            }
        });
        a1Button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                textField1.setText(textField1.getText() + "1");
            }
        });
        a2Button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                textField1.setText(textField1.getText() + "2");
            }
        });
        a3Button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                textField1.setText(textField1.getText() + "3");
            }
        });
        a4Button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                textField1.setText(textField1.getText() + "4");
            }
        });
        a5Button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                textField1.setText(textField1.getText() + "5");
            }
        });
        a6Button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                textField1.setText(textField1.getText() + "6");
            }
        });
        a7Button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                textField1.setText(textField1.getText() + "7");
            }
        });
        a8Button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                textField1.setText(textField1.getText() + "8");
            }
        });
        a9Button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                textField1.setText(textField1.getText() + "9");
            }
        });

        final List<String> operations = new ArrayList<String>(
                Arrays.asList("/","*","-","+","%","(",")")
        );



        clearButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                textField1.setText("");
            }
        });
        button1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                textField1.setText(textField1.getText() + " + ");
            }
        });
        button2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                textField1.setText(textField1.getText() + " - ");
            }
        });
        button3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                textField1.setText(textField1.getText() + " * ");
            }
        });
        button12.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                textField1.setText(textField1.getText() + " / ");
            }
        });
        button4.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                textField1.setText(textField1.getText() + " % ");
            }
        });

        button5.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                textField1.setText(textField1.getText() + " ( ");
            }
        });
        button6.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                textField1.setText(textField1.getText() + " ) ");
            }
        });
        enterButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String text = textField1.getText();

                List<String> textList = new ArrayList<String>(
                        Arrays.asList(text.split(" "))
                );
                List<Integer> nums = new ArrayList<Integer>();
                List<String> opers = new ArrayList<String>();


                if (!text.equals("")) {

                    for (String elem: textList) {
                        if (!operations.contains(elem)){
                            nums.add(Integer.parseInt(elem));
                        } else {
                            opers.add(elem);
                        }
                    }

                    if (opers.size() >= nums.size()) {
                        textField1.setText("Error! Wrong equation.");
                    }

                    long res = 0;
                    for (int i = 1; i < nums.size(); i++) {
                        res += new Ariphmetic().add(nums.get(i - 1), nums.get(i));
                    }
                    textField1.setText("= " + res);


                } else {
                    textField1.setText("Error! U don't enter values.");
                }

            }
        });
    }

    public static void main(String[] args) {
        new CalcGUI();
    }

}
