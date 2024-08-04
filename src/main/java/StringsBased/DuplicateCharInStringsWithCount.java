package StringsBased;

import java.util.HashMap;
import java.util.Map;

public class DuplicateCharInStringsWithCount {

	public static void main(String[] args) {
	String str="hjfhjfhjfhjfhj";
	DuplicateCharInStringsWithCount.countDuplicate(str);
	 }
public static void countDuplicate(String str) {
	Map<Character,Integer> map=new HashMap<Character,Integer>();
	char[] charArr=str.toCharArray();
	for(char keys : charArr) {
		if(map.containsKey(keys)) {
			map.put(keys, map.get(keys)+1); }
			else {
				map.put(keys, 1);
			}
		} System.out.print(map);
	}
	

	}


//output - {b=1, s=1, d=3, e=1, f=2, v=1, w=1, j=2}