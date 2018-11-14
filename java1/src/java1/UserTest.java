package java1;

public class UserTest
{
	// 生命周期2
	String name;

	UserTest()
	{

	}

	UserTest(String name)
	
	{
		//
		this.name = name;
	}

	// 静态方法也可以重载。
	public static int add(int a, int b)
	{
		return a + b;
	}

	public static void add(int a, String b)
	{
		System.out.println(a + b);
	}

	public static void main(String[] args)
	{
		UserTest ut = new UserTest();
		UserTest ut1 = new UserTest("徐韦韦");// 重载按照参数列表进行调用
		System.out.println(ut1.name);

		System.out.println(UserTest.add(10, 10) + "\n");
		UserTest.add(10, "10");

	}
}
