package java2;

public class Constructor extends Person3
{
	Constructor(String name,double height,double weight){//���캯��
		super("zhangsan",1.73,55);//super���������ഫֵ
		
	}
	Constructor(){
		super("lisi",1.80,65);
	}
	public static void main(String[] args)
	{
		Constructor pc=new Constructor("zhangsan",1.73,55);
		pc.sayhello();
		Constructor pc1=new Constructor();
		pc1.sayhello();
	}
}
