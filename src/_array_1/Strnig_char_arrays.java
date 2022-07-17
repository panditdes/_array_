package _array_1;

import java.util.Arrays;

public class Strnig_char_arrays {

	public static void main(String[] args) {

		//to split the given charater in given sequence


//========================================================================================
		
		String k = "615 8465 is in katraj";
		String p[]=k.split(" ");
		System.out.println(Arrays.toString(p));
		
//========================================================================================
		char[] pp=k.toCharArray();
		
		System.out.println(Arrays.toString(pp));
	}

}
