package java1;

public class Prictiseone
{

	String catname;
	String catcolor;

	// ����һ���Ǿ�̬����,thisֻ�����ڷǾ�̬�����С�
	public void catshuxing()
	{
        System.out.println("è������Ϊ��"+this.catname+"\nè����ɫ�ǣ�"+this.catcolor);
	}
	
	public static void main(String[] args)
	{
		Prictiseone p1=new Prictiseone();
		p1.catname="���";
		p1.catcolor="��ɫ";
		p1.catshuxing();
		System.out.println("--------------");
		
		Prictiseone p2=new Prictiseone();
		p2.catname="С��";
		p2.catcolor="��ɫ";
		p2.catshuxing();
	}

}
