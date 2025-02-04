import java.util.Scanner;

public class GeneratedAmount {
    //Write a java program to compute amount generated for a number of years using the following formular a=p(1+r)n where a is the amount, p is the principal amount, r is the interest rate and n is the number of years to invest. Ensure you use the for loop to display the results
    double p;
    double r;
    int n;
    double a;
    public void getValues() {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter the principal amount:");
        p = obj.nextDouble();
        System.out.println("Enter the interest rate in percentage:");
        r = obj.nextDouble();
        System.out.println("Enter the number of years:");
        n = obj.nextInt();
    }
    public void calculateAmount() {
        for (int i = 1; i <= n; i++) {
            a = p * Math.pow((1 + (r/100)), i);
            System.out.printf("Amount generated after %d years: %.2f%n", i, a);
        }
    }
    public static void main(String[] args) throws Exception{
        GeneratedAmount obj = new GeneratedAmount();
        obj.getValues();
        obj.calculateAmount();
    }


    
}
