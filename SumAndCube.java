//Write a java program that use a for loop to generate ANY sum of numbers as well as cube of numbers as show below:Number	Sum	Cube
// 1	1	1
// 2	4	8
// 3	9	27
// 4	16	64
// 5	25	125
// 6	36	216
// 7	49	343
// 8	64	512
// 9	81	729
// 10	100	1000
// 55	385	3025
public class SumAndCube {

    public static void main(String[] args) throws Exception{
        System.out.println("Number\tSum\tCube");
        for (int i = 1; i <= 10; i++) {
            int sum = i * i;
            int cube = i * i * i;
            System.out.println(i + "\t" + sum + "\t" + cube);
        }
        int sum = 0;
        int cube = 0;
        for (int i = 1; i <= 55; i++) {
            sum += i;
            cube += i * i * i;
        }
        System.out.println("55\t" + sum + "\t" + cube);
    }
}
