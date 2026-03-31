import java.awt.*;
import java.awt.event.*;
import java.util.Arrays;
import javax.swing.*;
import javax.swing.border.LineBorder;

public class Calculator {
    int boardwidth = 360;
    int boardheight = 540;

    Color custom_lightGrey = new Color(193, 204, 202);
    Color custom_DrakGray = new Color(80,80,80);
    Color custom_Black = new Color(28,28,28);
    Color custom_Orange = new Color(255,149,0);

    String[] buttonvalues = {
            "AC", "+/-", "%", "+",
            "7", "8", "9", "x",
            "4", "5", "6", "-",
            "1", "2", "3", "÷",
            "0", ".", "√", "="
    };
    String[] rightSymbols = {"+", "x", "-", "÷"};
    String[] equal = {"="};
    String[] topSymbols = {"AC", "+/-", "%"};

    JFrame frame = new JFrame("Calculater");
    JLabel displayLable = new JLabel();
    JPanel displeyPanel = new JPanel();
    JPanel buttonPanel = new JPanel();

    //A+b ,A-B, A*b, A/B
    String A = "0";
    String operator = null;
    String B = null;

    Calculator(){
        //frame.setVisible(true);
        frame.setSize(boardwidth,boardheight);
        frame.setLocationRelativeTo(null);
        //frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new BorderLayout());


        displayLable.setBackground(custom_Black);
        displayLable.setForeground(Color.WHITE);
        displayLable.setFont(new Font("Arial",Font.PLAIN,80));
        displayLable.setHorizontalAlignment(JLabel.RIGHT);
        displayLable.setText("0");
        displayLable.setOpaque(true);

        displeyPanel.setLayout(new BorderLayout());
        displeyPanel.add(displayLable);
        frame.add(displeyPanel, BorderLayout.NORTH);

        buttonPanel.setLayout(new GridLayout(5,4));
        buttonPanel.setBackground(custom_Black);
        frame.add(buttonPanel);

        for (int i =0;i< buttonvalues.length;i++) {
            JButton button = new JButton();
            String buttonValue = buttonvalues[i];
            button.setFont(new Font("Arial", Font.PLAIN, 30));
            button.setText(buttonValue);
            button.setFocusable(false);
            button.setBorder(new LineBorder(custom_Black));
            if (Arrays.asList(topSymbols).contains(buttonValue)) {
                button.setBackground(Color.BLACK);
                button.setForeground(new Color(202, 187, 187));
            } else if (Arrays.asList(rightSymbols).contains(buttonValue)) {
                button.setBackground(Color.black);
                button.setForeground(custom_Orange);
            }else if(Arrays.asList(equal).contains(buttonValue)){
                button.setBackground(custom_Orange);
                button.setForeground(Color.WHITE);
            }
            else {
                button.setBackground(Color.black);
                button.setForeground(custom_DrakGray);
            }
            buttonPanel.add(button);

            button.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    JButton button = (JButton) e.getSource();
                    String buttonValue = button.getText();
                    if (Arrays.asList(rightSymbols).contains(buttonValue)) {
                        if(buttonValue=="="){
                            if(A!= null){
                                B = displayLable.getText();
                                double numA = Double.parseDouble(A);
                                double numB = Double.parseDouble(B);
                                if(operator=="+"){
                                    displayLable.setText(removeZeroDecimal(numA+numB));
                                }
                                else if(operator=="-"){
                                    displayLable.setText(removeZeroDecimal(numA-numB));
                                }else if(operator=="x"){
                                    displayLable.setText(removeZeroDecimal(numA*numB));
                                }else if(operator=="÷"){
                                    displayLable.setText(removeZeroDecimal(numA/numB));
                                }
                                clearAll();
                            }
                        }else if("+-x÷=".contains(buttonValue)){
                            if(operator==null){
                                A = displayLable.getText();
                                displayLable.setText("0");
                                B="0";
                            }
                            operator = buttonValue;
                        }
                    } else if (Arrays.asList(topSymbols).contains(buttonValue)) {
                        if (buttonValue == "AC") {
                            //clearAll();
                            displayLable.setText("0");
                        } else if (buttonValue == "+/-") {
                            double numDisplay = Double.parseDouble(displayLable.getText());
                            numDisplay *=-1;
                            displayLable.setText(removeZeroDecimal(numDisplay));
                        } else if (buttonValue == "%") {
                            double numDisplay = Double.parseDouble(displayLable.getText());
                            numDisplay /=100;
                            displayLable.setText(removeZeroDecimal(numDisplay));
                        }
                    } else { //digit or .
                        if (buttonValue == ".") {
                            if (!displayLable.getText().contains(buttonValue)) {
                                displayLable.setText(displayLable.getText() + buttonValue);
                            }
                        }else if(buttonValue == "√"){
                            double numDisplay = Double.parseDouble(displayLable.getText());
                            numDisplay =Math.sqrt(numDisplay);
                            displayLable.setText(removeZeroDecimal(numDisplay));
                        }
                        else if ("0123456789".contains(buttonValue)) {
                            if (displayLable.getText() == "0") {
                                displayLable.setText(buttonValue);
                            } else {
                                displayLable.setText(displayLable.getText() + buttonValue);
                            }
                        }
                    }
                }
            });
            frame.setVisible(true);
        }

    }
    void clearAll(){
        A ="0";
        operator = null;
        B = null;
    }

    String removeZeroDecimal(double numDisplay){
        if(numDisplay % 1 ==0){
            return Integer.toString((int) numDisplay);
        }
        return Double.toString(numDisplay);
    }
}
