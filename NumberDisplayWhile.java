import java.util.Scanner;

public class NumberDisplayWhile {
    int a;
    int b;
    public void getValues() {
        Scanner obj = new Scanner(System.in);
        System.out.println("displaying numbers using while loop.");
        System.out.println("input two numbers first one smaller than the last.");
        System.out.println("Enter the first number:");
        a = obj.nextInt();
        System.out.println("Enter the second number:");
        b = obj.nextInt();
        if (a > b) {
            System.out.println("Invalid input");
            System.exit(0);
        }
    }
    public void performTask(){
        while (a <= b) {
            System.out.println(a);
            a++;
        }
    }

    public static void main(String[] args) throws Exception{
        NumberDisplayWhile obj = new NumberDisplayWhile();
        obj.getValues();
        obj.performTask();
    }
    
}
