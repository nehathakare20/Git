package day1;

import java.util.Scanner;
public class addition_of_two_nos {

	public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
     
	int num1, num2, sum;
     char ch1,  ch2;
     
     System.out.println("Enter first number:");
     num1 = sc.nextInt();
     
     System.out.println("Enter second number:");
     num2 = sc.nextInt();
     
     sum = num1 + num2;
     System.out.println("addition of two numbers:" +sum);
     
     System.out.println("Enter first character:");
     ch1 = sc.next().charAt(0);
     
     System.out.println("Enter second character:");
     ch2 = sc.next().charAt(0);
      System.out.println("addition of char="+ ch1+ch2);
}

}
