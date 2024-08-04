package NumbersBased;

public class FibonacciSeries {

	public static void main(String[] args) {
		int num1=0;
		int num2=1;
		int num=9;
		System.out.println("Printing fibonacci series");
		System.out.println(num1);
		System.out.println(num2);
		//System.out.println("0,1");
		for(int i=0;i<=num;i++)
		{
			int num3=num1+num2;
			num1=num2;
			num2=num3;
			System.out.println(+num3);}}}
