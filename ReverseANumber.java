package Assignments;
/*@author Roopkala 
 *@Program to reverse a number
 */
//import java.util.Scanner;

public class ReverseANumber {
 public static void main(String args[])
 {
	 int num;
     int reversenum = 0;
     System.out.println("Input your number");
     
	 // Scanner in = new Scanner(System.in);
     // num = in.nextInt();
     
     num = Integer.parseInt(args[0]);
     while( num != 0 )
     {
         reversenum = reversenum * 10;
         reversenum = reversenum + num%10;
         num = num/10;
     }

     System.out.println("Reverse of input number is: "+reversenum);

 }
}
