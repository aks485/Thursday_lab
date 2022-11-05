package basicprogram;

import java.util.Scanner;
public class SumOfEvenNumbers {
	public static void main(String[]args)
	{
       Scanner sc = new Scanner(System.in);
       int i, num, sum=0;
       System.out.println(" enter no.s ");
       num = sc.nextInt();
       
       for(i=0;i<=num;i+=2)
       {
    	   sum+=i;
       }
       System.out.println(" the sum of even numbers is =" +sum);
       

		
}	
}