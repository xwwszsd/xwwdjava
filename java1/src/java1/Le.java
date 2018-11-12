package java1;

public class Le
{
	// 全局静态变量，可以在main方法中直接调用。
	static String schoolname;
	static int count;
	// 全局变量，需要在main方法中实例化对象之后调用。
	String stuname;
	byte age;
	double salary;
	
	void addsalary()
	{
		// 局部变量定义时可以不赋值，但使用时必须赋值。
		int salary1 = 100; // double是包含int的，所以这里定义为Int是可以的.
		salary += salary1;
		System.out.println("学生" + stuname + "工资加奖金：" + salary);

	}

	public static void main(String[] args)
	{
		schoolname = "nananan";
		Le le = new Le();
		le.stuname = "lalala";
		le.age = 15;
		System.out.println(le.stuname + "\n" + le.age+"\n"+le.schoolname);
		// System.out.println(le.age);
		//System.out.println(le.schoolname);
		Le le1 = new Le();
		
		//schoolname是全局静态变量，一个改变，全部改变。
		le1.schoolname="hahahah";
		System.out.println(le.stuname + "\n" + le.age+"\n"+le.schoolname);
		
		Le le2 = new Le();
		le2.stuname="xww";
		le2.salary=500;
		System.out.println("学生的工资为："+le2.salary);
		le2.addsalary();
		
		

	}

}
