import java.util.*;
class complex
	{
	int r,i;
	complex()
	{
	}
complex(int real,int img)
	{
	r=real;
	i=img;
	}
complex addcomplex(complex input1,complex input2)
	{
	complex obj=new complex();
	obj.r=input1.r+input2.r;
	obj.i=input1.i+input2.i;
	return obj;
	}
}
class comp
{
	public static void main(String[] args)
	{
	complex input1=new complex(15,24);
	System.out.println("The first complex number is defined as:"+input1.r+"+i"+input1.i);
	complex input2=new complex(3,7);
	System.out.println("The second complex number is defined as:"+input2.r+"+i"+input2.i);
	complex obj2=new complex();
	obj2=obj2.addcomplex(input1,input2);
	System.out.println("The sum of complex number is :"+obj2.r+"+i"+obj2.i);
	}
}


