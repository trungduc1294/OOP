import javax.swing.*;

// a.x^2 + b.x + c = 0
public class SecondDegreeEquation {
    public static void main(String[] args) {
        String strA, strB, strC;

        strA = JOptionPane.showInputDialog(null,
                "Nhap vao so a:",
                "Nhap a: ",
                JOptionPane.INFORMATION_MESSAGE);

        strB = JOptionPane.showInputDialog(null,
                "Nhap vao so b:",
                "Nhap b: ",
                JOptionPane.INFORMATION_MESSAGE);

        strC = JOptionPane.showInputDialog(null,
                "Nhap vao so c:",
                "Nhap c: ",
                JOptionPane.INFORMATION_MESSAGE);
        
        double a = Double.parseDouble(strA);
        double b = Double.parseDouble(strB);
        double c = Double.parseDouble(strC);
        
        if (a == 0 && b == 0 && c != 0) {
            JOptionPane.showMessageDialog(null, "PT vo nghiem");
        } else if (a == 0 && b == 0 && c == 0) {
            JOptionPane.showMessageDialog(null, "PT co vo so nghiem");
        } else if (a == 0 && b != 0) {
            double result = -c/a;
            String strResult = String.valueOf(result);
            JOptionPane.showMessageDialog(null, "x =" + strResult);
        } else if (a != 0 && b <= 0) {
            double x1 = Math.sqrt(-b);
            double x2 = -Math.sqrt(-b);
            String strX1 = String.valueOf(x1);
            String strX2 = String.valueOf(x2);
            JOptionPane.showMessageDialog(null, "x1 = " + strX1 + "\n" + "x2 = " + strX2);
        } else if (a !=0 && b != 0 && c!= 0) {
            double delta = b*b - 4*a*c;
            if (delta < 0) {
                JOptionPane.showMessageDialog(null, "Phuong trinh vo nghiem");
            } else if (delta > 0) {
                double result1 = (-b + Math.sqrt(delta))/2*a;
                double result2 = (-b - Math.sqrt(delta))/2*a;
                String strResult1 = String.valueOf(result1);
                String strResult2 = String.valueOf(result2);
                JOptionPane.showMessageDialog(null, "x1 = " + strResult1);
                JOptionPane.showMessageDialog(null, "x2 = " + strResult2);
            } else if (delta == 0) {
                double result = (-b/2*a);
                String strResult = String.valueOf(result);
                JOptionPane.showMessageDialog(null, "x1 = " + strResult);
            }
        }
        System.exit(0);
    }
}
