package java2;

public class Jicheng1 extends Jicheng
{
	//���๹�캯�������������ࡣ
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
		this("100");//�����this(),��ָ���ñ���Ĺ��캯��������д�ڵ�һ�С�
	}
	
	Jicheng1(String s){
		//super(10); //super(�����б�) ���ʸ��� �ṩ�Ĺ��캯�� �����ڵ�һ�У����ԣ�this��super���ܹ��档
	}

	public static void main(String[] args)
	{
		Jicheng1 jc = new Jicheng1();
		
		//jc.setName("��ΤΤ");
		
		//System.out.println(jc.getName());
		
	}
}
