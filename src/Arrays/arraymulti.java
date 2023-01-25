package Arrays;



public class arraymulti {
	public static void main(String[] args) {
		int al[][]=new int[2][2];
		al[0][0]=10;
		al[0][1]=20;
		al[1][0]=30;
		al[1][1]=40;
		//System.out.println(al[1][1]);
		//System.out.println(al[0][0]);
		for(int i=0;i<=1;i++) {
			for(int j=0;j<=1;j++) {
				System.out.println(al[i][j]+"");
			}
			System.out.println();
		}
	}

}
