package java1;

public class Userday
{
	//�������ں���
	//����˳�򣺾�̬�����---���죨�����������---���캯��---�����İ�����˳������ִ��
     static {
    	 System.out.println("����һ����̬����飬ִֻ��һ��,��������ں����е��ã�����ִ��");
     }
     {
    	 System.out.println("���ǹ���(����)����飬������ʵ������һ�ζ���ִ��һ��");
     }
     public void one() {
    	 System.out.println("�����(void)ʵ������������return");
    	 
     }
     
     public static void two() {
    	 System.out.println("���Ǿ�̬������Ҫ�ã�����.������  ���е���");
     }
     
     Userday(){
    	 System.out.println("���ǹ��캯������������ʱֱ����ʽִ�С�");
     }
     {
    	 System.out.println("���ǹ������飬������ʵ������һ�ζ���ִ��һ��,������˳��ִ�С�");
     }
     
     public String add(int a,String b) {
    	 return a+b;
     }
     
     public static void main(String[] args)
	{
    	 Userday usd=new Userday();
    	 usd.one();
    	 Userday.two();
    	 
	}
}
