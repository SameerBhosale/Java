class AbstractDemo
{
	public static void main(String arg[])
	{
		//Demo obj=new Demo();
		Demo obj;
		obj=new Hello();
		obj.fun();
		obj.gun();
		obj.sun();
		System.out.println(obj.i);
		System.out.println(obj.j);
	
}

abstract class Demo
{
	public int i,j;
	public Demo()
	{
		System.out.println("Inside constructor of Demo");
		i=10;
		j=20;
	}
	public void fun()
	{
		System.out.println("Inside fun of Demo");
	}
	public void gun()
	{
		System.out.println("Inside gun of Demo");
	}
	public abstract void sun();
	
}
class Hello extends Demo
{
	public int x,y;
	public Hello()
	{
		System.out.println("Inside constructor of Hello");
		x=10;
		y=20;
	}
	public void fun()
	{
		System.out.println("Inside fun of Hello");
	}
	public void sun()
	{
		System.out.println("Inside sun of Hello");
	}
}
