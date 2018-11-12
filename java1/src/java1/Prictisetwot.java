package java1;

public class Prictisetwot
{
    public static void main(String[] args)
	{
    	//没有定义为私有字段时可以调用Prictisetwo类中的属性，并修改，所以不安全。
    	/*Prictisetwo p2=new Prictisetwo();
    	p2.name="徐韦韦";
    	p2.age=100;
    	System.out.println("姓名："+p2.name+"\n年龄:"+p2.age);*/
    	
    	//这样就会出错，因为前面的类中设有私有字段。
    	/*
    	Prictisetwo p3=new Prictisetwo();
    	p3.uname="xww";
    	p3.age=100;
    	System.out.println("姓名："+p3.name+"\n年龄:"+p3.age);
    	*/
    	
    	//使用这种方法是可以调用私有方法的。
    	Prictisetwo p4=new Prictisetwo();
    	p4.setUname("徐韦韦");
    	
    	p4.setUage(25);
    	
    	System.out.println("你的名字是:"+p4.getUname()+"\n你的年龄是："+p4.getUage());
	}
}
