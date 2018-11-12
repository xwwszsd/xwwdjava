package java1;

public class Dog
{
	String dogcolor;
	
	public static void eat()
	{
	   System.out.println("狗其实是喜欢吃肉的");
	}
	//设置对象的值。
	public void setDogcolor(String dogcolor) {
		this.dogcolor=dogcolor;
	}
	//返回对象的值。
	public String getDogcolor() {
		return this.dogcolor;
	}
	
	public static void main(String[] args)
	{
		Dog dog=new Dog();
		//给对象赋值。
		dog.setDogcolor("黄色");
		
		System.out.println("狗的颜色是:"+dog.getDogcolor());
		dog.eat();
	}
}
