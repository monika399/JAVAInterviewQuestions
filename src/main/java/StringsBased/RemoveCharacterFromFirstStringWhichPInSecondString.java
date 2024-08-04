package StringsBased;

public class RemoveCharacterFromFirstStringWhichPInSecondString {
	//remove characters from the first String which are present in the second String
	public static void main(String[] args) {
		String str1="my name is king khan";
		String str2="in";
		removeCharactersFromFirstString(str1,str2);

	}
	
/* 1. converting string into string builder so that we can use deleteCharAt() method 
 * and then converting it back to string by using toString() in the end.
 * 2. iterating the for loop on str1 and with str1 taking the char at the particular index and saving it in ch variable
 * and with StringBuilder object of (sb of str1) taking index of ch by using IndexOf() method and storing it in int index
 */
public static void removeCharactersFromFirstString(String str1,String str2) {
StringBuilder sb=new StringBuilder(str1);
char str2Array[] = populateSecondStringArray(str2);	 
//char str2Array[]=str2.toCharArray();
for(int i=0;i<str1.length();i++) {
	 char ch=str1.toLowerCase().charAt(i);
	 int index=sb.toString().indexOf(ch);
	 
	 if(str2Array[ch]==ch) {
		 sb.deleteCharAt(index); 
	 }} System.out.println(sb.toString());
 }
/*creating array of 256 char and iterating the for loop upto the  length of str2 
 * in the maskArray of chars,assigning the char at index i to str2Array
 */
static char[] populateSecondStringArray(String str2) {
	char[] str2Array=new char[256];
	for(int i=0;i<str2.length();i++) {
		str2Array[str2.charAt(i)]=str2.charAt(i);
	}
	return str2Array;
	
}}
/*
public static void removeCharactersFromFirstString(String str1,String str2){
    StringBuilder sb = new StringBuilder(str1.toLowerCase());
    char maskArray[] = populateMaskArray(str2);
    for(int i=0;i<str1.length();i++){
        char ch = str1.toLowerCase().charAt(i);
        int index = sb.toString().indexOf(ch);
        if(maskArray[ch] == ch) {
            sb.deleteCharAt(index);
        }
    }
    System.out.println(sb.toString());
}}


static char[] populateMaskArray(String mask) {
    char[] array = new char[256];
    for(int i = 0; i < mask.length(); i++) {
        array[mask.charAt(i)] = mask.charAt(i);
    }
    return array;
}

public static void main(String[] args) {
    String str1 = "India is country";
    String str2 = "in";
    removeCharactersFromFirstString(str1,str2);

} */
























