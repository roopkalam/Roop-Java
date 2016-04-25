package Assignments;

public class OuterLoopAssignment {
	public static void main(String[] args) {
		
		String fruits[] = {"apple","banana","kiwi"};
		String sports[] = {"football","baseball","cricket"};
		String laptops[] = {"mac","lenovo","ibm"};
		
		String goods[][] = {fruits,sports,laptops}; // new String[3][3];

		outerLoop: 
		for(int i = 0 ; i < goods.length; i++)
		{
			String eachGood[] = goods[i];
			for(int j = 0 ; j < eachGood.length; j++)
			{
				String value = goods[i][j];
				if(value.equals("cricket"))
				{					
					break outerLoop;
				}
				System.out.println(value);
			}
			System.out.println("Length is "+ eachGood.length);
		}
	}
}
