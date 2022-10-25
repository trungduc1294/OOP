import javax.swing.*;

public class MathProgram {
    public static void main(String[] args) {
        String strNum1, strNum2;

        strNum1 = JOptionPane.showInputDialog(null,
                "Please input the first number: ", "Input the first number: ",
                JOptionPane.INFORMATION_MESSAGE);
        double num1 = Double.parseDouble(strNum1);

        strNum2 = JOptionPane.showInputDialog(null,
                "Please input the second number: ", "Input the second number: ",
                JOptionPane.INFORMATION_MESSAGE);
        double num2 = Double.parseDouble(strNum2);

        String sum = String.valueOf(num1 + num2);
        String diferences = String.valueOf(num1 - num2);
        String product = String.valueOf(num1 / num2);
        String qoutient = String.valueOf(num1*num2);

        JOptionPane.showMessageDialog(null,
                "sum = " + sum + "\n"
                + "diferences = " + diferences + "\n"
                + "product = " + product + "\n"
                + "qoutient = " + qoutient);
    }
}
