import java.util.Scanner;
	public class IT24100719Lab7Q1A
	{
		public static void main(String []args)
		{
			Scanner input = new Scanner(System.in);
			
	
			
			int tot = 0;
			for (int num=1; num<5; num++)
			{
				System.out.print("Enter subject Mark "+num+": ");
				int mark=input.nextInt();
				tot+=mark;
			}
			
			System.out.println();
			
			double average= tot/4;
			System.out.println("Average is : "+average);
			
			if(average>=75)
				{System.out.println("Overall Grade is Distinction");}
			else if(average>=50)
				{System.out.println("Overall Grade is Credit");}
			else
				{System.out.println("Overall Grade is Fail");}
			
			
		}
	}