package java1;

public class Dog
{
	String dogcolor;
	
	public static void eat()
	{
	   System.out.println("����ʵ��ϲ�������");
	}
	//���ö����ֵ��
	public void setDogcolor(String dogcolor) {
		this.dogcolor=dogcolor;
	}
	//���ض����ֵ��
	public String getDogcolor() {
		return this.dogcolor;
	}
	
	public static void main(String[] args)
	{
		Dog dog=new Dog();
		//������ֵ��
		dog.setDogcolor("��ɫ");
		
		System.out.println("������ɫ��:"+dog.getDogcolor());
		dog.eat();
	}
}
