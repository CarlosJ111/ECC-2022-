import java.util.ArrayList;
import java.util.Scanner;


public class menu {

	public static void main(String args[])
	{
		
		int	numItems;
		Scanner cin= new Scanner(System.in);
		ArrayList<String> stringItems= new ArrayList<String>();
		
		System.out.print("How many items would you like to add to the list? ");
		numItems= cin.nextInt();
		System.out.print("Enter items: ");
		getItems(stringItems,numItems);
		System.out.println("Items are: ");
		showItems(stringItems, numItems);
		System.out.println();
		System.out.printf("%s%d%s%n","You have entered ", stringItems.size()," Items");
		System.out.println("If the last item is taken out then the list is: ");
		stringItems.remove(numItems-1);
		for(String item:stringItems)
		{
			System.out.println(item);
		}
		
		
		
		
		
		
		
		
		
		
	}

	public static void getItems(ArrayList<String>items, int numItem)
	{
		Scanner cin = new Scanner (System.in);
		
		
		for(int i=0;i<numItem;i++)
		{
			items.add(i,cin.next());
		}
		
	}

		public static void showItems(ArrayList<String>items,int numItem)
		{
			for(int i=0; i<numItem;i++)
			{
				System.out.println(items.get(i));
			}
		}
	
}
