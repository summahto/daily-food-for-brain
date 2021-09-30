package com.string.manipulation;

public class Pangram {

	public static void main(String[] args) {
		
		String s = "thequickbrownfoxjumpsoverthelazydog";
		System.out.println(checkIfPangram(s));
		
	}
	
	public static boolean checkIfPangram(String sentence) {
        int seen = 0;
        for(char c : sentence.toCharArray()) {
            int ci = c - 'a';
            seen = seen | (1 << ci);
        }
        return seen == ((1 << 26) - 1);
    }

}
