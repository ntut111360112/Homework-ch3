package whch3;

public class sample3_25
{
	public static void main(String[] args)
	{
		Car25[] car1;
		car1= new Car25[3];
		for(int i=0; i<car1.length ;i++)
		{
			car1[i]=new Car25();
		}
		car1[0].setCar25(1234,20.5);
		car1[1].setCar25(2345,30.5);
		car1[2].setCar25(3456,40.5);
		
		for(int i=0; i<car1.length ;i++)
		{
			car1[i].show();
		}
	}
}
class Car25
{
	int num;
	double gas;
	public Car25()
	{
		num=0;
		gas=0.0;
		System.out.println("生產了車子");
	}
	public void setCar25(int n, double g)
	{
		num=n;
		gas=g;
		System.out.println("將車號設為"+num+"汽油量為"+gas);
	}
	public void show()
	{
		System.out.println("車號是"+num);
		System.out.println("汽油量是"+gas);
	}
}