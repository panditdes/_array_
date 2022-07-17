
public class revision_class_prim {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [] k = {7,8,13,16,23,3,17};
		for (int i=0; i<k.length;i++)
		{
			int count = 0;
			for (int j=k[i]; j>=1;j--)
			{
				int p = k[i]%j;
				if (p == 0)
				{
					count++;
				}
				if (count > 2)
				{

				}
				else
				{
					System.out.println(k[i] + "is a prime number");
				}
			}
		}

	}

}
