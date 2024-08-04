package StringsBased;

public class CountSpecificCharFromGIvenString {

	public static void main(String[] args) {
		
String str= "shaancricketacademy";
char givenChar='a';
int count=0;
for(int i=0;i<str.length();i++) {
if(str.charAt(i)==givenChar) {
	count++;
}}
if(count>0){ System.out.println("Number of occurance of "+givenChar+" is "+count);
}else {
	System.out.println(givenChar+" is not found in the given array");
}
	}

}
