package NumbersBased;
import java.util.LinkedList;
import java.util.Scanner;

public class Palindrome {
//static String str;
	/*public static void main(String[] args) {
		System.out.println("Enter the word to check the palindrome");
		//Scanner sc = new Scanner(System.in);
		//String str=sc.nextLine();
		String str="more";
		boolean isPalindrome=isPalindrome(str);
		System.out.println("Is the string a palindrome - " +isPalindrome);
	}
public static boolean isPalindrome(String str) {
	int first=0;int last = str.length()-1;
		while(first<last) {
		if(str.charAt(last)!=str.charAt(first)) {
			return false;
		}
		first++;
		last--;
		
		}
		return true;
	}*/
	
	public static void main(String[] args) {
		String str="namanik"; 
		boolean status=false;
		String rev="";
		for(int i=str.length()-1;i>=0;i--) {
			rev=rev+str.charAt(i);
		}
		if(str.equals(rev)) {
			status=true;
			System.out.println("Yes");
		}
		else {
			System.out.println("No");
		}
		}
		


}


