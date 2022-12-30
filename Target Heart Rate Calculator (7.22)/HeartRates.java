




public class HeartRates {
	public final int CURRENT_DAY= 26;						//constant instance variables of type integers are used to determine age 
	public final int CURRENT_MONTH= 3;
	public final int CURRENT_YEAR = 2022;
	public final double TARGET_CONSTANT= 0.67;				//Average constant of what target heart rate should be, in this case 67% of max heart rate
	
	private String firstName;								//Strings hold first and last name of object
	private String lastName;
	private int birthDay;									//integers hold birthday of object
	private int birthMonth;
	private int birthYear;
	private int age;										//instance variable holds the age of the object
	public HeartRates(String fName,String lName,int bDay,int bMonth,int bYear)		//Constructor that initializes instance variables
	{
		firstName=fName;
		lastName= lName;
		birthDay= bDay;
		birthMonth= bMonth;
		birthYear= bYear;
	}
	
	public void setName(String fName,String lname)						//method of type void sets the name for the object
	{
		firstName= fName;
		lastName= lname;
	}
	
	public String getFirst()											//String method that returns first name
	{
		return firstName;
	}
	
	public String getLast()												//String method that returns last name
	{
		return lastName;
	}
	
	public void setDay(int bDay)										//void method that sets birthday Day
	{
		birthDay= bDay;
	}
	
	public int getDay()													//Method that returns birthDay integer
	{
		return birthDay;
	}
	
	public void setMonth(int bMonth)									//Method that sets birth Month
	{
		birthMonth= bMonth;
	}
	
	public int getMonth()												//Method that returns birth Month
	{
		return birthMonth;
	}
	
	public void setYear(int bYear)										//Method that sets birth Year
	{
		birthYear= bYear;
	}

	public int getYear()
	{
		return birthYear;
	}
	
	public int getAge()													//Method that calculates and returns persons age
	{
		
		
		
		age= CURRENT_YEAR-birthYear;
		if(birthDay>CURRENT_DAY||birthMonth>CURRENT_MONTH)	//if the persons birthday hasn't passed yet this year, then the age goes down by 1
		{
			age--;
		}
		
		return age;
		
		
		
	}
	
	public int getMaxRate()							//Method that returns max heart rate using formula from book
	{
		
		return (220-age);
	}
	

	public double getTargetRate()
	{
		return ((220-(double)age)*TARGET_CONSTANT);	//Method that returns target heart rate using TARGET_CONSTANT to determine percent of max hear rate used
	}


	

}



