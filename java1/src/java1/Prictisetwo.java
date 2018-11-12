package java1;

public class Prictisetwo
{
	String name;
	int age;
	static String cityname;
    private String uname;
    private int uage;
    
    //这个是封装，可以简单的阻止别的类进行数据的修改。
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
			//this 表示当前对象，谁调用这个方法，这个this就是谁.
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
			System.out.println("你输入的年龄不合法");
			
		}
	
	}

	
    
	public static void main(String[] args)
	{
		//在同一个类中可以直接调用私有字段。
		Prictisetwo p1=new Prictisetwo();
		p1.uname="徐韦韦";
		p1.uage=20;
		System.out.println("你的名字："+p1.uname+"\n你的年龄:"+p1.uage);
	}
}
