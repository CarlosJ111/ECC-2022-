import java.util.Scanner;

public class WaterPark {

	static final double PARK_TAX= .07;   						//constant of type double for the Park tax
	
	public static void main(String args[])
	{
		Scanner cin = new Scanner(System.in);
		int family []= new int [3];  //Array of size 3 named Family will group members into 3 different categories
									// First element will represent kids, second Regulars, and third Seniors
		int sentinel;				//Used to determine when the do-while loop ends by user input
		int age;					//temporarily stores the age in a variable, then count for appropriate age group goes up in array
		int numPeople;				// numPeople determines how many iterations for loop will do
		
		do
		{	
		System.out.println("Welcome to Mt.Olympus Water Park!");
		System.out.print("How many guests are checking in today? ");
		numPeople=cin.nextInt();
		
		for(int i=0;i<numPeople;i++)											//for-loop iterations control by numPeople so appropriate number of ages can be entered
		{
			System.out.println();
			System.out.printf("%s%d%s", "Please enter guests ", i+1, " age ");
			age=cin.nextInt();
			 if(age<=0)															//If an age of 0 or -1 is entered, user will prompted "invalid age" until valid age is entered
			 {
				 do
				 {
					 System.out.print("Invalid age! Please enter a valid age: ");
					 age=cin.nextInt();
					 System.out.println();
				 }while(age<=0);
			 }
			 System.out.println();

			
			if(age<=12)																//if the age is less than or equal to 12, then the element that represents kids goes up by one
			{
				family[0]++;
			}
			else if(age>=12 && age<=55)												//if the age is greater than or equal to 12 and less than or equal to 55, then regular ticket (element 2) goes up by one
			{
				family[1]++;
			}
			else																	//anything else is considered a senior 
			{
				family[2]++;
			}
			
		}
		showTickets(family);														//method main call to showTickets using family array as parameter
		System.out.print("Please press any number other than -1 to let the next customer purchase tickets or -1 if park is closed ");
		sentinel=cin.nextInt();
		family[0]=0;							//resets the arrays before next iteration
		family[1]=0;
		family[2]=0;
		
		
		}while(sentinel!=-1);	
	}
	
	public static void showTickets (int tickets[])								//method of type void named showTickets prints out the tickets the customer needs to purchase and price
	{
		int child= tickets[0];													//child integer receives number of children in the family array(first element)
		int regular= tickets[1];												// regular integer receives number of regular tickets in the family array (second element)
		int senior= tickets[2];													// senior tickets receives number of regular tickets in the family array (third element)
		double total = (((double)child*12.5)+((double)regular*18.25)+((double)senior*15));  // double integer named total stores total cost of all tickets, all integer values are casted to double for calculation accuracy
		
		
		System.out.println("You have: ");
		System.out.printf("%d%s%n ", child, " Child Tickets" );
		System.out.printf("%d%s%n ", regular, " Regular Tickets");
		System.out.printf("%d%s%n ",senior, " Senior Tickets"  );
		System.out.printf( "%s%.2f%s%.2f%s%n"   ,"For Purchase, with a total of ", total, "$ before tax and after tax is: ", total+(total*PARK_TAX),"$"); // prints out total for tickets before and after tax, uses global constant integer PARK_TAX
		
		
	}
	
	
}
