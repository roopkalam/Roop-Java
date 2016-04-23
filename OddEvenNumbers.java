package Assignments;

public class OddEvenNumbers {
	
	public static void main(String[] args)
	{
		int oddArray[] = new int[100];
		int evenArray[] = new int[100];
		int oddCount = 0;
		int evenCount = 0;
		for(int i=1; i<=100; i++)
		{
		  
			if(i%2 == 0) 
				{
				evenArray[evenCount] = i;
				evenCount = evenCount + 1;
				}
			 else 
				{
				 oddArray[oddCount] = i;
				 oddCount = oddCount + 1;
				}
		}	
		//Print Even numbers
		System.out.println("Even Numbers:");
	   	for(int l=1;l<evenCount;l++)
		{
		System.out.print(evenArray[l]+", ");
		}
		//Print Odd numbers
	   	System.out.println("");
	   	System.out.println(""+"Odd Numbers:");
		for (int l=0;l<oddCount;l++) 
		{
		System.out.print(oddArray[l]+", ");
		}
		
	}
}
