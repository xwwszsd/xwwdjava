package java1;

public class UserTest
{
	// ��������2
	String name;

	UserTest()
	{

	}

	UserTest(String name)
	
	{
		//
		this.name = name;
	}

	// ��̬����Ҳ�������ء�
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
		UserTest ut1 = new UserTest("��ΤΤ");// ���ذ��ղ����б���е���
		System.out.println(ut1.name);

		System.out.println(UserTest.add(10, 10) + "\n");
		UserTest.add(10, "10");

	}
}
