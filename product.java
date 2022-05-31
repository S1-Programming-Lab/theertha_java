public class product
{
	int pcode,price;
	String pname;
	product(int a,int b,String S)
	{
		this.pcode=a;
		this.price=b;
		this.pname=S;
	}
public static void main(String args[])
{
	product p=new product(101,5,"tea");
	product m=new product(102,10,"coffee");
	product n=new product(111,200,"biscuits");if((p.price<m.price)&&(p.price<n.price))
	System.out.println("Product wit low price : "+p.pname);
	else if(m.price<n.price)
	System.out.println("Product wit low price : "+m.pname);
	else
	System.out.println("Product wit low price : "+n.pname);
	}
}
