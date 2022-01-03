import java.util.Scanner;
class Percentage
{
	public static void main(String args[])
	{
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter Maximum Marks : ");
		float MaximumMarks = scan.nextFloat();
		float MarksObtained=0;
		float MaximumMarks_Total=0;
		
		int yes=1;
		// Marks obtained in subjects
		while(yes<=5){
		System.out.print("Enter Marks : ");
		float x= scan.nextFloat();
		MarksObtained  = MarksObtained + x;
		MaximumMarks_Total = MaximumMarks_Total + MaximumMarks;
		yes++;
		}

		
		
		float result = ((MarksObtained/MaximumMarks_Total)/100)*10;
		System.out.println("Required percentage is : ");
		System.out.println(result);
	}
};	
		 