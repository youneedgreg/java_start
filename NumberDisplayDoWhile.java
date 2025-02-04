public class NumberDisplayDoWhile {
    int a;
    int b;
    public void getValues() {
        java.util.Scanner obj = new java.util.Scanner(System.in);
        System.out.println("displaying numbers using do while loop.");
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
        do {
            System.out.println(a);
            a++;
        } while (a <= b);
    }

    public static void main(String[] args) throws Exception{
        NumberDisplayDoWhile obj = new NumberDisplayDoWhile();
        obj.getValues();
        obj.performTask();
    }
    
}
