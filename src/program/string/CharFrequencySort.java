package program.string;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

/**
 * 1. take user input
 * 2. Count the frequency of each character in the string
 * 3. Sort the character by frequency in descending order
 * 4. Display the character along frequency
 */
public class CharFrequencySort {
	public static void main(String[] args) {

		        Scanner sc = new Scanner(System.in);
		        System.out.print("Enter a string: ");
		        String str = sc.nextLine();

		        // Convert to lowercase (optional, for case-insensitive counting)
		        str = str.toLowerCase();

		        // 1. Count frequency of each character
		        Map<Character, Integer> freqMap = new HashMap<>();

		        for (int i = 0; i < str.length(); i++) {
		            char ch = str.charAt(i);
		            if (ch != ' ') { // ignore spaces
		                if (freqMap.containsKey(ch)) {
		                    freqMap.put(ch, freqMap.get(ch) + 1);
		                } else {
		                    freqMap.put(ch, 1);
		                }
		            }
		        }

		        // 2. Sort by frequency in descending order
		        List<Map.Entry<Character, Integer>> list = new ArrayList<>(freqMap.entrySet());
		        Collections.sort(list, new Comparator<Map.Entry<Character, Integer>>() {
		            public int compare(Map.Entry<Character, Integer> e1, Map.Entry<Character, Integer> e2) {
		                return e2.getValue().compareTo(e1.getValue());
		            }
		        });

		        // 3. Display the results
		        System.out.println("\nCharacter Frequency (sorted by frequency):");
		        for (Map.Entry<Character, Integer> entry : list) {
		            System.out.println(entry.getKey() + " = " + entry.getValue());
		        }

		        sc.close();
		    }
    }

}
