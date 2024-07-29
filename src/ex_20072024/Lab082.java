package ex_20072024;
import java.util.Scanner;


public class Lab082 {
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in );
        System.out.println("Enter your age");
        int age=sc.nextInt();
        //System.out.println(age);
        if (age>=18) {
            System.out.println("allow to vote");
        }
        else {
            System.out.println("dont allow for vote");
        }




    }




}
