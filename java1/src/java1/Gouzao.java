package java1;

public class Gouzao
{
	String host;
	String uname;
	String upwd;
	String url;

	Gouzao()
	{
        System.out.println("���ǵ�һ�����캯��");
	}
	public Gouzao(String host,String uname,String upwd,String url)
	{
		this.host=host;
		this.uname=uname;
		this.upwd=upwd;
		this.url=url;
        System.out.println("����ģ������DB���캯��");
	}
	
	public static void main(String[] args)
	{
		//���캯�������� ͬһ������������ͬ��ʵ�ֽ����
		Gouzao gz1=new Gouzao("127.0.0.1","xww","123456","http://www.bai.com");
		//������ʽ����
		Gouzao gz=new Gouzao();
		//������ʾ���� gz.Gouzao()
		
		//���һ�����ж�����캯������ô�͸����������ṩ�˶�����ʻ��ơ�
		//һ���������û�ж��幹�캯�������������Զ��ṩһ����ʽ���캯���Թ�ʹ�á�
		
		
	}

}
