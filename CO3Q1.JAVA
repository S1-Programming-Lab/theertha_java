import java.until.Scanner;
public class CO3Q1
	{
	void area(int r1)
		{
		double Area_val=3.14*r1*r1;
		System.out.println("/nArea of circle is Radius"+r1"="+Area_val);
		}
	void area(int a1,int b1)
		{
		int Area_val=a1*b1;
		System.out.println("/nArea of Rectangle is with diamensions"+a1"+"X"+b1+"="+Area_val);
		}
	void area(int a1,int b1,int c1)
		{
		int Area_val=a1*b1*c1;
		System.out.println("/nArea of Cuboid is with diamensions"+a1"+"X"+b1+"X"+c1"="+Area_val);
		}
	public static void main(String[] args)
		{
		Scanner sc=new Scanner(System.in);
		System.out.println("/nEnter the Length");
		int l=sc.nextInt();
		System.out.println("/nEnter the Breadth");
		int b=sc.nextInt();
		System.out.println("/nEnter the Height");
		int h=sc.nextInt();
		System.out.println("/nEnter the Radius");
		int r=sc.nextInt();
		CO3Q1 obj1=new CO3Q1();
		obj1.area(r);
		obj1.area(i,b);
		obj1.area(i,b,h);
	}
}



