import java.util.Scanner;

public class NumbersDisplayFor {
    int a;
    int b;
    public void getValues() {
        Scanner obj = new Scanner(System.in);
        System.out.println("displaying numbers using for loop.");
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
        for (int i = a; i <= b; i++) {
            System.out.println(i);
        }
    }

    public static void main(String[] args) throws Exception{
        NumbersDisplayFor obj = new NumbersDisplayFor();
        obj.getValues();
        obj.performTask();
    }
    
}
