package java1;

public class Le
{
	// ȫ�־�̬������������main������ֱ�ӵ��á�
	static String schoolname;
	static int count;
	// ȫ�ֱ�������Ҫ��main������ʵ��������֮����á�
	String stuname;
	byte age;
	double salary;
	
	void addsalary()
	{
		// �ֲ���������ʱ���Բ���ֵ����ʹ��ʱ���븳ֵ��
		int salary1 = 100; // double�ǰ���int�ģ��������ﶨ��ΪInt�ǿ��Ե�.
		salary += salary1;
		System.out.println("ѧ��" + stuname + "���ʼӽ���" + salary);

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
		
		//schoolname��ȫ�־�̬������һ���ı䣬ȫ���ı䡣
		le1.schoolname="hahahah";
		System.out.println(le.stuname + "\n" + le.age+"\n"+le.schoolname);
		
		Le le2 = new Le();
		le2.stuname="xww";
		le2.salary=500;
		System.out.println("ѧ���Ĺ���Ϊ��"+le2.salary);
		le2.addsalary();
		
		

	}

}
