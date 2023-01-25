package Arrays;

public class multidimensional {//multi dimensional arry
	public static void main(String[] args)
	{
		int ar[][]=new int[2][2];
		ar[0][0]=10;
		ar[0][1]=20;
		ar[1][0]=30;
		ar[1][1]=40;
		for(int i=0;i<=1;i++)//outer for loop used for rows
		{
			for (int j=0;j<=1;j++)//inner for loop written in outer for loop
			{
			System.out.print(ar[i] [j]+" ");
			}
			System.out.println();
		}
		
	}

}

