package java1;

public class Prictisetwo
{
	String name;
	int age;
	static String cityname;
    private String uname;
    private int uage;
    
    //����Ƿ�װ�����Լ򵥵���ֹ�����������ݵ��޸ġ�
    public String getUname()
	{
		return uname;
	}

	public void setUname(String uname)
	{
		
		this.uname = uname;
	}

	public int getUage()
	{
		if(this.uage>0 && this.uage<120)
		{
			//this ��ʾ��ǰ����˭����������������this����˭.
			return this.uage;
		}
		else {
			return 0;
			
		}
	}

	public void setUage(int uage)
	{
		if(uage>0 && uage<120)
		{
			this.uage=uage;
		}
		else {
			System.out.println("����������䲻�Ϸ�");
			
		}
	
	}

	
    
	public static void main(String[] args)
	{
		//��ͬһ�����п���ֱ�ӵ���˽���ֶΡ�
		Prictisetwo p1=new Prictisetwo();
		p1.uname="��ΤΤ";
		p1.uage=20;
		System.out.println("������֣�"+p1.uname+"\n�������:"+p1.uage);
	}
}
