/**
 * 
 */
package com.bridgelabz;

/**
 * @author PAVITHRA C
 *
 */
public class MapMain {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String sentence = "To be or not to be";

		Map<String, Integer> map = new Map<>();
		String[] words = sentence.toLowerCase().split(" ");

		for (String elements : words) {
			System.out.println(elements);
		}

		for (String word : words) {
			Integer value = map.get(word);
			if (value == null)
				value = 1;
			else
				value = value + 1;
			map.add(word, value);
		}
		map.display();

	}
}
	