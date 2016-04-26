package Assignments;

public class IndexofAnArray {
		
	public static void main(String[] args) {
		
		int[] list = {2,3,4,5};
	    int index = -1;

	    for (int i = 0; (i < list.length) && (index == -1); i++) {
	        if (list[i] == Integer.parseInt(args[0])) {
	            index = i;
	        }
	    }
	    System.out.println(index);
	  }
}
