package java1;

public class Prictisetwot
{
    public static void main(String[] args)
	{
    	//û�ж���Ϊ˽���ֶ�ʱ���Ե���Prictisetwo���е����ԣ����޸ģ����Բ���ȫ��
    	/*Prictisetwo p2=new Prictisetwo();
    	p2.name="��ΤΤ";
    	p2.age=100;
    	System.out.println("������"+p2.name+"\n����:"+p2.age);*/
    	
    	//�����ͻ������Ϊǰ�����������˽���ֶΡ�
    	/*
    	Prictisetwo p3=new Prictisetwo();
    	p3.uname="xww";
    	p3.age=100;
    	System.out.println("������"+p3.name+"\n����:"+p3.age);
    	*/
    	
    	//ʹ�����ַ����ǿ��Ե���˽�з����ġ�
    	Prictisetwo p4=new Prictisetwo();
    	p4.setUname("��ΤΤ");
    	
    	p4.setUage(25);
    	
    	System.out.println("���������:"+p4.getUname()+"\n��������ǣ�"+p4.getUage());
	}
}
