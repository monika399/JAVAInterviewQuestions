package NumbersBased;

public class ReverseANumber {

	public static void main(String[] args) {
		int num=456; int rev=0;
		        //400+50+6=456
				//654=600+50+4;
		while(num>0) {
			rev=rev+num/10;
			num=num/10;
		}
System.out.println("Reverse of a number is - "+rev);
	}

}
