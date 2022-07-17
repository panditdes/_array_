package _array_1;

import java.util.Arrays;

public class Reverse_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
              //Reverse the given array
		
		String array [] = {"java","oracle","apple","samsung","oneplus"};
		
		//ans:--> ["oneplus","samsung","apple","oracle","java"]
		
		for(int i = 0;i<(array.length/2); i++) 
		{
			String k = array[(array.length-1)-i];  
			// we are storing oneplus in temporary variable in first iteration
			
			array[(array.length-1)-i] = array[i];
			//we are replacing "java" with "oneplus" in our firstt iteration
			array [i] = k;
			
		}
		
		System.out.println(Arrays.toString(array));  // printing whole array
	}

}
