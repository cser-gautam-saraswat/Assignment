package edu.jecrc.sdt_java.practice;

public class VerifierService {

    
    public void numberVerifier(int num) {

        if (num == 0) {
            System.out.println("Number is Zero");
        } 
        else {
            String sign = (num > 0) ? "Positive" : "Negative";
            String type = (num % 2 == 0) ? "Even" : "Odd";

            System.out.println(sign + " " + type);
            System.out.println();
        }
    }
    
    public void characterVerifier(char ch) {
    	if(Character.isDigit(ch)) {
    		System.out.println("It's a Digit");
    	}else if(Character.isAlphabetic(ch)){
    		if(Character.isUpperCase(ch)) {
    			if(isVowel(ch)) {
    				System.out.println("UpperCase and Vowel");
    			}else {
    				System.out.println("UpperCase and Consonant");
    			}
    		}else {
    			if(isVowel(ch)) {
    				System.out.println("LowerCase and Vowel");
    			}else {
    				System.out.println("LowerCase and Consonant");
    			}
    		}
    	}else {
    		System.out.println("It's a Symbol");
    	}
    }
    
    public static boolean isVowel(char ch) {

    	if(ch == 'a' || ch == 'e'||ch=='i'||ch=='o'||ch=='u') {
    		return true;
    	}
    	return false;
    }

    
}
