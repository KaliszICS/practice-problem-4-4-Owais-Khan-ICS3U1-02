/**
	* File: Lesson 4.4 - Boolean functions with loops
	* Author: Owais Ali Khan
	* Date Created: April 13, 2026
	* Date Last Modified: April 13, 2026
	*/

public class PracticeProblem {

	public static void main(String args[]) {

	}

	public static boolean hasCapital(String str) {
        String curr;
        for (int i = 0; i < str.length(); i++) {
            curr = str.substring(i, i+1);
            if (curr == curr.toUpperCase()) {
                return true;
            }
        }
        return false;
    }
    
    public static boolean isPrime(int num) {
        if (num == 1) {
            return false;
        }
        
        for (int i = 2; i < num; i++) {
            if (num%i==0) {
                return false;
            }
        }
        return true;
    }

}
