package _array_1;

import java.util.Arrays;
public class Revese_each_word_in_his_position {
	public static void main(String[] args) {
		//reverse each word in his original position in given string	
		String s = "i am live in my sweet home";
	//ans-->i ma evil ni ym teews emoh
	String array1[] = s.split(" ");  //we are spilting given string in each word and storing in array
		System.out.println(Arrays.toString(array1)); //printing array
		//===========================================================================================
		for(int i =0;i<array1.length;i++)
		{
			char array2[] = array1[i].toCharArray();
		for(int j = 0; j<(array2.length/2);j++) 
		{
			char k = array2[(array2.length-1)-j];
			{
					array2[(array2.length-1)-j] = array2[j];
					array2[j] = k;
				}
				System.out.println(Arrays.toString(array2));

				String l = "";
				for(int j1=0;j1<array2.length;j1++)
				{
					l = l + array2[j1];
					System.out.println(l);
				}
				array1[i]=l;
			}
			System.out.println(Arrays.toString(array1));
			//==========================================================================================
			String t = "";
			for(int i1=0;i1<array1.length;i1++)
			{
				t = t +array1[i1]+" ";
				System.out.println(t);
			}

		}
		
		
//		     	Q. REVERSE THE GIVEN STRING
//				String a = "i am live in latur";
//				//answer:rutal ni evil ma i
//				
//				//last index = size -1;
//				for(int i=(a.length()-1);i>=0;i--)
//				{
//					char b1 = a.charAt(i);
//					System.out.print(b1);
//				}
				                      
		
		
		
		
		
		
		
	}

}
