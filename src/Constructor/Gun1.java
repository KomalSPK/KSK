package Constructor;

public class Gun1 
{
	String gunName;
	int noOfBullet;
	public Gun1(String gunName, int noOfBullet)
	{
		this.gunName=gunName;
		this.noOfBullet=noOfBullet;
	}
	
	public void shoot()
	{
		for(int i=1;i<=noOfBullet;i++)
		{
			System.out.println("Deshkew");
	    }

    }
}