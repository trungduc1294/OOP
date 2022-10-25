import javax.swing.*;

//y = ax + b
public class FirstDegreeEquation {
    public static void main(String[] args) {
        String strA, strB;

        strA = JOptionPane.showInputDialog(null,
                "Please input number a: ", "input number a:",
                JOptionPane.INFORMATION_MESSAGE);

        strB = JOptionPane.showInputDialog(null,
                "Please input number b: ", "input number b:",
                JOptionPane.INFORMATION_MESSAGE);

        double a = Double.parseDouble(strA);
        double b = Double.parseDouble(strB);

        if (a == 0) {
            JOptionPane.showMessageDialog(null, "y = " + strB);
        } else if (a != 0) {
            double result = b/a;
            String strResult = String.valueOf(result);
            JOptionPane.showMessageDialog(null, "y = " + strResult);
        }
        System.exit(0);
    }
}
