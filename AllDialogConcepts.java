import javax.swing.JOptionPane;

public class AllDialogConcepts {
    public static void main(String[] args) {
        double p,r,n,a;
        p = Double.parseDouble(JOptionPane.showInputDialog("Enter the principal amount:"));
        r = Double.parseDouble(JOptionPane.showInputDialog("Enter the interest rate:"));
        n = Double.parseDouble(JOptionPane.showInputDialog("Enter the number of years:"));
        for (int i = 0; i <= n; i++) {
            a = p * Math.pow(1 + r, i);
            JOptionPane.showMessageDialog(null, "The amount after " + i + " years is " + a);
        }
        
        
        a = Double.parseDouble(JOptionPane.showInputDialog("Enter the value of a:"));
        double b = Double.parseDouble(JOptionPane.showInputDialog("Enter the value of b:"));
        double c = Double.parseDouble(JOptionPane.showInputDialog("Enter the value of c:"));
        double discriminant = Math.pow(b, 2) - 4 * a * c;
        if (discriminant > 0) {
            double root1 = (-b + Math.sqrt(discriminant)) / (2 * a);
            double root2 = (-b - Math.sqrt(discriminant)) / (2 * a);
            JOptionPane.showMessageDialog(null, "The roots are " + root1 + " and " + root2);
        } else if (discriminant == 0) {
            double root = -b / (2 * a);
            JOptionPane.showMessageDialog(null, "The root is " + root);
        } else {
            JOptionPane.showMessageDialog(null, "The equation has no real roots");
        }
    }
    
}
