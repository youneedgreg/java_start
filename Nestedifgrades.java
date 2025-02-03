import java.util.Scanner;

public class Nestedifgrades {
    public static void main(String[] args) throws Exception{
        System.out.println("Grade Score");
        int a;
        Scanner obj= new Scanner(System.in);
        System.out.println("Enter the score");
        a=obj.nextInt();
        if (a > 100 || a < 0) {
            System.out.println("Invalid score");
            System.exit(0);
            
        }
        if(a>=90)
            System.out.println("Grade A");
        else if(a>=80)
            System.out.println("Grade B");
        else if(a>=70)
            System.out.println("Grade C");
        else if(a>=60)
            System.out.println("Grade D");
        else
            System.out.println("Grade F");
    }
    
}
