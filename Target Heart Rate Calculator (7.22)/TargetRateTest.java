import java.util.Scanner;
public class TargetRateTest {

	
	public static void main(String args[])
	{
		int birthDay;		//variables that stores users info to initialize object of type HeartRates
		int birthYear;
		int birthMonth;
		String firstName;
		String lastName;
		
		Scanner input = new Scanner(System.in); //Scanner object takes user input
		
		
		
		
		System.out.printf("Please enter your first name: ");
		firstName= input.next();
		System.out.printf("Please enter last name: ");
		lastName= input.next();
		System.out.printf("What is your birth year? :");
		birthYear= input.nextInt();
		System.out.printf("What is your birth month? :");
		birthMonth= input.nextInt();
		System.out.printf("What day were you born in? " );
		birthDay= input.nextInt();
		
		HeartRates person1 = new HeartRates(firstName,lastName,birthDay,birthMonth,birthYear);
		
		System.out.printf("%s%s%s%s%n","Name: ",person1.getFirst()," ", person1.getLast());
		System.out.printf("%s%d%s%d%s%d%n", "Birthday: ", person1.getMonth(),"/",person1.getDay(),"/",person1.getYear() );
		System.out.printf("%s%d%n","Age: ",person1.getAge());
		
		System.out.print("Max heart rate: ");
		System.out.println(person1.getMaxRate());
		System.out.print("Target Heart Rate: ");
		System.out.print(person1.getTargetRate());
		
		
		
		
		
	}
	
	
	
	
	
}
