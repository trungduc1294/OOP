import javax.swing.*;

public class ShowTwoNumbers {
    public static void main(String[] args) {
        String strNum1, strNum2;
        String strnotification = "You have just enter:";

        strNum1 = JOptionPane.showInputDialog(null,
                "Please input the first number: ", "Input the first number: ",
                JOptionPane.INFORMATION_MESSAGE);
        strnotification += strNum1 + " and ";

        strNum2 = JOptionPane.showInputDialog(null,
                "Please input the second number: ", "Input the second number: ",
                JOptionPane.INFORMATION_MESSAGE);
        strnotification += strNum2;

        JOptionPane.showMessageDialog(null, strnotification,
                "Show two numbers", JOptionPane.INFORMATION_MESSAGE);
        System.exit(0);
    }
}
