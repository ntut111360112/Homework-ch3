package whch3;

public class sample3_6 
{
	public static void main(String[] args)
	{
		Car6 car1;
		car1 = new Car6();
		
		car1.num = 1234;
		car1.gas = 20.5;
		
		car1.showCar();
	}
}

class Car6
{
	int num;
	double gas;
	
	void show()
	{
		System.out.println("車號是"+ this.num);
		System.out.println("汽油量是"+ this.gas);
	}
	void showCar()
	{
		System.out.println("開始顯示車子資料");
		this.show();
	}
}