package _array_1;

import java.util.Arrays;
import java.util.Scanner;

public class Highestnumber {
 //                         NOT WORKING THIS PROGRAM PLEASE TRY AGAIN...
	
	
	
	
	//printing the largest number of given arrays
	//----------------------------array defind by user-------------------------------------


	@SuppressWarnings("resource")
	public static void main(String[] args, int i) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		System.out.println("define the length of given array: ");
		int size = scn.nextInt();
		int a []= new int[size];
		for(i=0; i<size; i++) 
		{
			System.out.println("Enter" + i + " number: ");
			a[i]=scn.nextInt();
		}

		System.out.println(Arrays.toString(a));
	//	==============================================================================================
		int maxnumber = a[0];
		for(int j=0;j<(a.length-1);j++) 
		{
			if(a[j+1]>maxnumber) 
			{
				maxnumber = a[j+1];
			}
		}
		System.out.println("largest number: " +maxnumber);
		//==============================================================================================
	}

}
