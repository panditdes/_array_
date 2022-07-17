package _array_1;

import java.util.Arrays;

public class Asending {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {-86,-64,12,45,0,12,741};   //delare,initiolization of array
		System.out.println(Arrays.toString(a));
		for (int i= 0;i<a.length;i++) 
		{
			for(int j=i+1;j<a.length;j++) 
			{
				if(a[j]<a[i])
				{
					int w = a[i];
					a[i]=a[j];
					a[j]=w;

				}
			}
		}
		System.out.println(Arrays.toString(a));
	}

}
