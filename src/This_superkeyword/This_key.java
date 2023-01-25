package This_superkeyword;

public class This_key {
	
	int a=10;//global var
	public void test()
	{
		int b=20;//local var
		System.out.println(b);//20
		//now i want to print global var from same class
		System.out.println(this.a);
	 
	}

}
