import java.util.Scanner;

public class NumberDisplayWhile {

    public static void main(String[] args) throws Exception{
        System.out.println("displaying numbers using while loop.");
        System.out.println("input two numbers first one smaller than the last.");
        int a;
        int b;
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter the first number:");
        a = obj.nextInt();
        System.out.println("Enter the second number:");
        b = obj.nextInt();
        if (a > b) {
            System.out.println("Invalid input");
            System.exit(0);
        }
        
        while (a <= b) {
            System.out.println(a);
            a++;
        }
    }
    
}
