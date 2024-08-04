package NumbersBased;
import java.util.LinkedList;

public class AddOfTwoNumberLL {

	public static void main(String[] args) {
		int[] l1= {2,4,3}; 
		int[] l2= {5,6,4};
		int[] l3 = new int[3];
		
		for(int i=0;i<l1.length;i++) {
			l3[i]= l1[i]+l2[i];
			System.out.println(l3[i]);
		}

		/*Input: l1 = [2,4,3], l2 = [5,6,4]
				Output: [7,0,8]
				Explanation: 342 + 465 = 807.	*/
 
	}

}
