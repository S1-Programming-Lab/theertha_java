import java.util.Scanner;
class employee
	{
	int empid;
	String name;
	double salary;
	String address;
	employee(int no,String na,double sal,String add)
		{
		this.empid=no;
		this.name=na;
		this.salary=sal;
		this.address=add;
		}
	}
public class teacher extends employee
	{
	String dept;
	String subject;
	teacher(int no,String na,double sal,String dep,String sub)
		{
		super(no,na,sal,add);
		this.dept=dep;
		this.subject=sub;
		}
	void display()
		{
		System.out.println("Employee id:"+empid);
		System.out.println("Name :"+name);
 		System.out.println("Salary:"+salary);
		System.out.println("Address:"+add);
		System.out.println("Department:"+dep);
		System.out.println("Subject:"+sub);
		}
	public static void main(String args[])
		{
		System.out.println("Employee id:"+empid);
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		teacher arr[]=new teacher[num];
		for(int i=0;i<num;i++)
			{
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter Employee id:"+empid);
			int empid=sc.nextInt();
			System.out.println("Enter Employee name:");
			String name=sc.next();
			System.out.println("Enter slary:");
			double salary=sc.nextDouble();
			System.out.println("Enter Address:");
			String address=sc.next();
			System.out.println("Enter Department:");
			String dep=sc.next();
			System.out.println("Enter Subject:");
			String subject=sc.next();
			arr[]=new teacher(empid,name,salary,address,dep,subject);
			sc.close();
			}
		System.out.println("\n***********informations of all the employees***********");
		for(int i=0;i<num;i++)
		int j=i+1;
		System.out.println("\n"+j+").");
		arr[i].display();
		}
}
sc1.close();
}
}

			


