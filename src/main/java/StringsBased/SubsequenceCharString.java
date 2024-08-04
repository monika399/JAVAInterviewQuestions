package StringsBased;

public class SubsequenceCharString {

	public static void printSubsequenceChar(String input) {
		input=input.replaceAll("\\s","");
		System.out.println(input);
    for(int i=0;i<input.length();i++) {
		for(int j=0;j<input.length();j++) {
			if(input.charAt(i)!=input.charAt(j)){
				System.out.println(input.charAt(i)+" "+input.charAt(j));
			}
		}
	}}

	
public static void main(String[] args) {
	String input="I love dogs";
	printSubsequenceChar(input);
	
}
}


//output= Il Io Iv Ie ......