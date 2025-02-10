// Using java dialog window, write a java program for computing investment. The program should display amount and year for all the years starting from year 0. Use the formula
// a=p(1+r)n
// where a is the amount, p is the principal amount , r is the interest rate and n is the number of years to invest
import javax.swing.JOptionPane;

public class Investment {
    
    public static void main(String[] args) {
        double p,r,n,a;
        p = Double.parseDouble(JOptionPane.showInputDialog("Enter the principal amount:"));
        r = Double.parseDouble(JOptionPane.showInputDialog("Enter the interest rate:"));
        n = Double.parseDouble(JOptionPane.showInputDialog("Enter the number of years:"));
        for (int i = 0; i <= n; i++) {
            a = p * Math.pow(1 + r, i);
            JOptionPane.showMessageDialog(null, "The amount after " + i + " years is " + a);
        }
    }
    
}
