//Using an example of your choice, write a java program to illustrate while, do while, for, if selection, nested it, switch, if.
public class AllControlStructures {
    public static void main(String[] args) {
        int i = 1;
        while (i <= 5) {
            System.out.println("While loop: " + i);
            i++;
        }

        i = 1;
        do {
            System.out.println("Do-while loop: " + i);
            i++;
        } while (i <= 5);

        for (i = 1; i <= 5; i++) {
            System.out.println("For loop: " + i);
        }

        if (i == 6) {
            System.out.println("If selection: " + i);
        }

        if (i == 6) {
            System.out.println("If selection: " + i);
        } else {
            System.out.println("Else selection: " + i);
        }

        if (i == 6) {
            System.out.println("If selection: " + i);
        } else if (i == 7) {
            System.out.println("Else if selection: " + i);
        } else {
            System.out.println("Else selection: " + i);
        }

        for (i = 1; i <= 5; i++) {
            if (i == 3) {
                System.out.println("Nested if: " + i);
            }
        }

        switch (i) {
            case 1:
                System.out.println("Switch: " + i);
                break;
            case 2:
                System.out.println("Switch: " + i);
                break;
            case 3:
                System.out.println("Switch: " + i);
                break;
            case 4:
                System.out.println("Switch: " + i);
                break;
            case 5:
                System.out.println("Switch: " + i);
                break;
            default:
                System.out.println("Switch: " + i);
        }
    }
    
}
