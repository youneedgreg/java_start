// Using java dialog window, write a java program for computing real roots of quadratic equation
import javax.swing.JOptionPane;
public class RootsJavaDialog {
    public static void main(String[] args) {
        double a = Double.parseDouble(JOptionPane.showInputDialog("Enter the value of a:"));
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


