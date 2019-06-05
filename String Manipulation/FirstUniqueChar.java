/*
 * Asked in Amazon(SDE1) phone screening, Amgen(Data Engineering Intern) final interview
 * Problem: Find first non-repeating character in a string
 */


import java.util.*;

class FirstUniqueChar{
	
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		System.out.println("Enter string");
		String str = s.next();

		char key = 0;
		int found = 0;
		str = str.toLowerCase();

		HashMap<Character, Integer> table = new HashMap<>();
		
		for(int i=0; i<str.length(); i++) {        // O(n) time complexity since the loop runs n times
			key = str.charAt(i);                     // O(1) complexity for charAt(), worst case O(n)
			if(table.containsKey(key)) {            //O(1) complexity for containsKey(), worst case O(n) [since it actually uses get() and throws away the value]
				table.put(key, table.get(key)+1 );    // O(1) complexity for get(), worst case O(n)
			}
			else {
				table.put(key,1); //O(1) complexity
			}
		}
		
		for(int i=0; i<str.length(); i++) {       //O(n) worst case complexity if the first non repeating char is at the end of the string.
			if(table.get(str.charAt(i)) == 1) { 
				System.out.println("First non-repeating char is:"+str.charAt(i));
				found = 1;
				break;
			}
		}
		if (found == 0) {
			System.out.println("No non-repeating char found");		
		}
		s.close();
	}
	
}
