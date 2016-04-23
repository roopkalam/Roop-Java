package Assignments;

public class OddEvenNumbers {
	
	public static void main(String[] args)
	{
		int oddArray[] = new int[100];
		int evenArray[] = new int[100];
		int oddCount = 0;
		int evenCount = 0;
		int totalOdd = 0;
		int totalEven = 0;
		String newLine = System.getProperty("line.separator");
		
		for(int i=1; i<=100; i++)
		{
		  
			if(i%2 == 0) 
				{
				evenArray[evenCount] = i;
				totalEven = totalEven + i;
				evenCount = evenCount + 1;
				}
			 else 
				{
				 oddArray[oddCount] = i;
				 totalOdd = totalOdd + i;
				 oddCount = oddCount + 1;
				}
		}	
		//Print Even numbers
		System.out.println("Even Numbers:");
	   	for(int l=0;l<evenCount;l++)
		{
		System.out.print(evenArray[l]+", ");
		}
	   	System.out.println(newLine);
	   	System.out.print("Total of evenArray: "+totalEven);
		//Print Odd numbers
	   	System.out.println(newLine);
	   	System.out.println(""+"Odd Numbers:");
		for (int l=0;l<oddCount;l++) 
		{
		System.out.print(oddArray[l]+", ");
		}
		System.out.println(newLine);
		System.out.print("Total of oddArray: "+totalOdd);
	}
}
