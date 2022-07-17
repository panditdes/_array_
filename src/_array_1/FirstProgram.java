package _array_1;
public class FirstProgram {
	public static void main(String[] args) {
		int a [] = new int [5];       //defining array type-1 method
		a[0] = 10;   //initialise array
		a[1] = 20;   //initialise array
		a[2] = 50;   //initialise array
		a[3] = 30;   //initialise array
		a[4] = 60;   //initialise array
		System.out.println(a[3]);   //printing the value of (a[3])
		System.out.println(a.length);    //printing length of an array a
		int b[] = {20,52,58,62,48,47,35};  //defining array type-2 method
		System.out.println(b[4]);     //printing the value of (b[4])
		System.out.println(b.length);    //printing length of an array b
		System.out.println("============================================================"); //seperator to understand
		System.out.println("Array a");
		
		for(int i=0; i<a.length; i++)     // i<a.length-->means the value of i is less than array a length
		{
			System.out.println(a[i]);     //printing whole array
			
		}
		
		System.out.println("============================================================"); //seperator to understand
		System.out.println("Array b");
		
		for(int i=0; i<b.length; i++)      // i<b.length-->means the value of i is less than array b length
		{
			System.out.println(b[i]);      //printing whole array
			
		}	
	}
}
