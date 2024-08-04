package StringsBased;

import java.util.HashMap;
import java.util.Map;

public class PrintDuplicateCharOfString {

public static void main(String[] args) {
String str="ewtfdsfgdgdfg";	
Map<Character,Integer>map=new HashMap<Character,Integer>();
char[] chArr=str.toCharArray();
for(char keys:chArr) {
if(map.containsKey(keys)){
	map.put(keys,map.get(keys)+1);
}else {
	map.put(keys, 1);
}}
for (Map.Entry<Character,Integer> mapElement : map.entrySet()) {   //iterating through the unordered map 
    if (mapElement.getValue() > 1) {  //if the count of characters is greater than 1 then duplicate found
      System.out.println(mapElement.getKey());
     // System.out.println(mapElement.getKey() + ", count = " + mapElement.getValue());

  }
else {
	System.out.println("non repeating character : "+mapElement.getKey());
}}

}}

/*for (Map.Entry<Character,Integer> mapElement : count.entrySet()) {   //iterating through the unordered map 
    if (mapElement.getValue() > 1)   //if the count of characters is greater than 1 then duplicate found
      System.out.println(mapElement.getKey() + ", count = " + mapElement.getValue());
  }
}*/
