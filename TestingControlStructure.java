import java.util.Scanner;
public class TestingControlStructure {
    public static void main(String[] args) throws Exception{
        // TODO code application logic here
        System.out.println("Example 1");
        System.out.print("Testing if selection control structure ");
        System.out.println("using largest of four numbers");
        int a,b,c,d,large;
        Scanner obj=new Scanner(System.in);
        System.out.println("Eenter Four numbers");
        a=obj.nextInt();
        b=obj.nextInt();
        c=obj.nextInt();
        d=obj.nextInt();
       large=a;
        if(b>large)
            large=b;
        
        if(c>large)
            large=c;
        
        if(d>large)
            large=d;
        
        System.out.println("The largest of "+a+ " and "+b+ " and "+c +" and "+d+" is "+ large);
        System.out.println("_______________________________________________________________________");

        Thread.sleep(5000);
       
        System.out.println("Example 2");
        System.out.println("Testing if /else selection control structure ");
        System.out.println("using largest of four numbers");
        System.out.println("enter Four Numbers");
        a=obj.nextInt();
        b=obj.nextInt();
        c=obj.nextInt();
        d=obj.nextInt();
        
        if(a>b)
            large=a;
        else
            large=b;
        
        if(c>large)
            large=c;
        
        if(d>large)
            large=d;
        
        System.out.println("The largest of "+a+ " and "+b+ " and "+c +" and "+d+" is "+ large);
        System.out.println("_______________________________________________________________________");
        
        Thread.sleep(5000);
        
        System.out.println("Example 3");
        System.out.println("Testing While loop control structure ");
        System.out.println("using Display of Numbers from 10 to 20");
        int n=10;
        while(n<=20){
            System.out.println(n);
            n++;
        }
        System.out.println("_______________________________________________________________________");
        
        Thread.sleep(5000);
        
        System.out.println("Example 4");
        System.out.println("Testing Do While loop control structure ");
        System.out.println("using Display of Numbers from 100 to 110");
        n=100;
        do{
            System.out.print(n+"  ");
            n++;
        }while(n<=110);
        
        System.out.println();
        System.out.println("_______________________________________________________________________");
        
        Thread.sleep(5000);
        
        System.out.println("Example 5");
        System.out.println("Testing For loop control structure ");
        System.out.println("using Display of Numbers from 50 to 60");
        for(n=50; n<=60; n++){
           System.out.println(n);
        }
    }
  }
