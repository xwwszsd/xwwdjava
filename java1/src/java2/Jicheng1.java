package java2;

public class Jicheng1 extends Jicheng
{
	//子类构造函数必须依赖父类。
	/*Jicheng1()
	{
		System.out.println("you");
	}*/
	/*Jicheng1(int a)
	{
		super(10);
	}
	*/
	Jicheng1(){
		this("100");//这里的this(),是指调用本类的构造函数，必须写在第一行。
	}
	
	Jicheng1(String s){
		//super(10); //super(参数列表) 访问父类 提供的构造函数 必须在第一行，所以，this和super不能共存。
	}

	public static void main(String[] args)
	{
		Jicheng1 jc = new Jicheng1();
		
		//jc.setName("徐韦韦");
		
		//System.out.println(jc.getName());
		
	}
}
