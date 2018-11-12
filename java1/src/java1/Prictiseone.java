package java1;

public class Prictiseone
{

	String catname;
	String catcolor;

	// 定义一个非静态方法,this只能用在非静态方法中。
	public void catshuxing()
	{
        System.out.println("猫的名字为："+this.catname+"\n猫的颜色是："+this.catcolor);
	}
	
	public static void main(String[] args)
	{
		Prictiseone p1=new Prictiseone();
		p1.catname="大黄";
		p1.catcolor="黄色";
		p1.catshuxing();
		System.out.println("--------------");
		
		Prictiseone p2=new Prictiseone();
		p2.catname="小黑";
		p2.catcolor="黑色";
		p2.catshuxing();
	}

}
