package NumbersBased;

	public class CountNumberOfDigits {
	
	public static void main(String[] args) {
	int num=1234; int count=0;
	System.out.println("before");
	while(num>0) {
	    num=num/10;
		count++;
	}
	System.out.println("Number of digists in given number "+count);
		}
	
	}