package _array_1;

import java.util.Arrays;

public class D_2_Arrays {

	public static void main(String[] args) {
	// Two dimensional arrays 
		String k [][]= new String [2][2];

		
		//0         c1 c2;
		//1         c1 c2;
		
		k[0][0] = "User1";
		k[0][1] = "Pass1";
		
		k[1][0] = "User2";
		k[1][1] = "Pass2";
		System.out.println(Arrays.deepToString(k));
	}

}
