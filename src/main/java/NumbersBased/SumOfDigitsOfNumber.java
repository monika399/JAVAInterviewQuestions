package NumbersBased;

public class SumOfDigitsOfNumber {

public static void main(String[] args) {
	int num=423;
	int sum=0;
	while(num>0) {
	 sum=sum+num%10;
	 System.out.println("before"+sum);
	    num=num/10;
	    System.out.println("After"+num);
	   
	}
	System.out.println("Sum of digists of a number - "+sum);}}
