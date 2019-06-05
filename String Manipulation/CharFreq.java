/*
 * Given a String print each character and it's frequency 
 * input : aabcddee
 * output: a2b1c1d1e2
 */
import java.util.*;

public class CharFreq {
	
	public static void main(String args[]) {
		String str = "aabcdee";
		
		int len = str.length();
		HashMap<Character, Integer> table = new HashMap<>();
		for(int i=0; i<len; i++) {
			if (table.containsKey(str.charAt(i))) {
				table.put( str.charAt(i), table.get(str.charAt(i))+1 );
			}
			else {
				table.put(str.charAt(i), 1);
			}
		}
		
		int  i = 0;
		while(i<len) {
			int freq = table.get(str.charAt(i));
			System.out.print(""+str.charAt(i)+freq);
			i = i+freq;
		}
		
	}
}
