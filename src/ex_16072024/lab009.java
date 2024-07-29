package ex_16072024;
import java.util.Scanner ;
public class lab009 {
    public static void main(String[] args) {
//        System.out.println("9x1=9");
//        System.out.println("9x2=18");
//        System.out.println("9x10=90");
        Scanner sc=new Scanner( System.in );


         int num = sc.nextInt() ;
         System.out.println("Enter the number for which table u want to print");

        for (int i=1;i<=10;i++)
        {
            int table = num*i;
            System.out.println( num +" x " + i +" = " + table );
         sc.close();

        }

    }
}
