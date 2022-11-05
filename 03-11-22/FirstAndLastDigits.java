package basicprogram;

public class FirstAndLastDigits {
	public static void main(String[]args)
	{
		int number= 3456;
		int firstno = 3;
		int lastno = 6;
		
		lastno = number%10;
		System.out.println(" Last digit :" +lastno);
		while(number!=0)
		{
			firstno = number%10;
			number /=10;
		}
		System.out.println("First digit :" +firstno);
	}

}
