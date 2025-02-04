import java.util.Scanner;

public class Switchgrades {
    public static void main(String[] args) throws Exception{
        System.out.println("Grade Score");
        Scanner obj = new Scanner(System.in);
        
        System.out.println("Enter the score:");
        int a = obj.nextInt();

        
        if (a > 100 || a < 0) {
            System.out.println("Invalid score");
            System.exit(0);
        }

        int grade = a / 10;

        switch (grade) {
            case 10, 9:
                System.out.println(a + "Grade A");
                break;
            case 8:
                System.out.println(a + "Grade B");
                break;
            case 7:
                System.out.println(a + "Grade C");
                break;
            case 6:
                System.out.println(a + "Grade D");
                break;
            default:
                System.out.println(a + "Grade F");
        }
        //case 10, 9 -> System.out.println(x: "A")
        obj.close();
    }
}
