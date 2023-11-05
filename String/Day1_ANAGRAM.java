package String;

import java.util.Arrays;

public class Day1_ANAGRAM {

	public static void main(String[] args) {
	
		String str1 = "TAND";
		String str2 = "DTNA";
		
	char [] arr1 = str1.toCharArray();
	char [] arr2 = str2.toCharArray();
	
	Arrays.sort(arr1);
	Arrays.sort(arr2);
	
	boolean anagram = Arrays.equals(arr1, arr2);
	
	if(anagram)
	{
		System.out.println("yes");
	}
	else
		System.out.println("no");
	}

}
