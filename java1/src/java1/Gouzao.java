package java1;

public class Gouzao
{
	String host;
	String uname;
	String upwd;
	String url;

	Gouzao()
	{
        System.out.println("这是第一个构造函数");
	}
	public Gouzao(String host,String uname,String upwd,String url)
	{
		this.host=host;
		this.uname=uname;
		this.upwd=upwd;
		this.url=url;
        System.out.println("这是模仿链接DB构造函数");
	}
	
	public static void main(String[] args)
	{
		//构造函数的重载 同一个方法名，不同的实现结果。
		Gouzao gz1=new Gouzao("127.0.0.1","xww","123456","http://www.bai.com");
		//属于隐式调用
		Gouzao gz=new Gouzao();
		//不能显示调用 gz.Gouzao()
		
		//如果一个类有多个构造函数，那么就给创建对象提供了多个访问机制。
		//一个类中如果没有定义构造函数，编译器会自动提供一个隐式构造函数以供使用。
		
		
	}

}
