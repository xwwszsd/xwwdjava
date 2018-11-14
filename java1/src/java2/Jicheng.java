package java2;

public class Jicheng
{
	String name;
	double salay;
	static int a;

	public void setName(String name)
	{
		this.name = name;
	}

	public String getName()
	{
		return name;
	}

	Jicheng()
	{
       System.out.println("¿ÕµÄ");
	}
	
	
	Jicheng(int a){
		 System.out.println("----------"+a);
	}
	
	public int a() {
		a++;
		return a;
	}
     
	public static void main(String[] args)
	{
		Jicheng jc=new Jicheng();
		jc.a();
		System.out.println(jc.a());
	}
}
