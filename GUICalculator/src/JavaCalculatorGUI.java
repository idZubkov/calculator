import javax.swing.*;
import java.awt.*;

public class JavaCalculatorGUI {
    private double total1 = 0.0;
    private double total2 = 0.0;
    private char mathOperator;

    private JPanel JavaCalculator;
    private JTextField textDisplay;
    private JButton btnEqual;
    private JButton btnPlus;
    private JButton btnMinus;
    private JButton btnMultiply;
    private JButton btnSqrtRoot;
    private JButton btnClear;
    private JButton btnSeven;
    private JButton btnFour;
    private JButton btnOne;
    private JButton btnPM;
    private JButton xSqrt;
    private JButton btnEight;
    private JButton btnFive;
    private JButton btnTwo;
    private JButton btnZero;
    private JButton btnDivide;
    private JButton btnNine;
    private JButton btnSix;
    private JButton btnThree;
    private JButton btnPoint;

    private void getOperator(String btnText) {
        mathOperator = btnText.charAt(0);
        total1 += Double.parseDouble(textDisplay.getText());
        textDisplay.setText("");
    }

    private JavaCalculatorGUI() {
        btnOne.addActionListener(e -> {
            String btnOneText = textDisplay.getText() + btnOne.getText();
            textDisplay.setText(btnOneText);
        });

        btnTwo.addActionListener(e -> {
            String btnTwoText = textDisplay.getText() + btnTwo.getText();
            textDisplay.setText(btnTwoText);
        });

        btnThree.addActionListener(e -> {
            String btnThreeText = textDisplay.getText() + btnThree.getText();
            textDisplay.setText(btnThreeText);
        });
        btnFour.addActionListener(e -> {
            String btnFourText = textDisplay.getText() + btnFour.getText();
            textDisplay.setText(btnFourText);
        });
        btnFive.addActionListener(e -> {
            String btnFiveText = textDisplay.getText() + btnFive.getText();
            textDisplay.setText(btnFiveText);
        });
        btnSix.addActionListener(e -> {
            String btnSixText = textDisplay.getText() + btnSix.getText();
            textDisplay.setText(btnSixText);
        });


        btnSeven.addActionListener(e -> {
            String btnSevenText = textDisplay.getText() + btnSeven.getText();
            textDisplay.setText(btnSevenText);
        });

        btnEight.addActionListener(e -> {
            String btnEightText = textDisplay.getText() + btnEight.getText();
            textDisplay.setText(btnEightText);
        });

        btnNine.addActionListener(e -> {
            String btnNineText = textDisplay.getText() + btnNine.getText();
            textDisplay.setText(btnNineText);
        });

        btnZero.addActionListener(e -> {
            String btnZeroText = textDisplay.getText() + btnZero.getText();
            textDisplay.setText(btnZeroText);
        });
        btnPoint.addActionListener(e -> {
            if (textDisplay.getText().equals("")) {
                textDisplay.setText("0.");
            } else if (textDisplay.getText().contains(".")) {
                btnPoint.setEnabled(false);
            } else {
                String btnPointText = textDisplay.getText() + btnPoint.getText();
                textDisplay.setText(btnPointText);
            }
            btnPoint.setEnabled(true);
        });

        btnEqual.addActionListener(e -> {
            switch (mathOperator) {
                case '+':
                    total2 = total1 + Double.parseDouble(textDisplay.getText());
                    break;
                case '-':
                    total2 = total1 - Double.parseDouble(textDisplay.getText());
                    break;
                case '/':
                    total2 = total1 / Double.parseDouble(textDisplay.getText());
                    break;
                case '*':
                    total2 = total1 * Double.parseDouble(textDisplay.getText());
                    break;
            }
            textDisplay.setText(Double.toString(total2));
            total1 = 0;
        });
        btnClear.addActionListener(e -> {
            total2 = 0;
            textDisplay.setText("");
        });
        btnPM.addActionListener(e -> {
            double btnText = Double.parseDouble(textDisplay.getText()) * -1;
            textDisplay.setText(String.valueOf(btnText));
        });
        xSqrt.addActionListener(e -> {
            double multiplier = Double.parseDouble(textDisplay.getText());
            double btnText = multiplier * multiplier;
            textDisplay.setText(String.valueOf(btnText));
        });
        btnSqrtRoot.addActionListener(e -> {
            double btnText = Math.sqrt(Double.parseDouble(textDisplay.getText()));
            textDisplay.setText(String.valueOf(btnText));
        });
        btnPlus.addActionListener(e -> {
            String btnText = btnPlus.getText();
            getOperator(btnText);

        });
        btnMinus.addActionListener(e -> {
            String btnText = btnMinus.getText();
            getOperator(btnText);
        });
        btnMultiply.addActionListener(e -> {
            String btnText = btnMultiply.getText();
            getOperator(btnText);
        });
        btnDivide.addActionListener(e -> {
            String btnText = btnDivide.getText();
            getOperator(btnText);
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Калькулятор");
        frame.setContentPane(new JavaCalculatorGUI().JavaCalculator);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
        frame.setSize(450, 600);
        frame.setLocationRelativeTo(null);
        frame.setIconImage(Toolkit.getDefaultToolkit().getImage(JavaCalculatorGUI.class.getResource("calc_icon.png")));
    }
}