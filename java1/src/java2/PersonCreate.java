package java2;

public class PersonCreate extends Person
{
      
	public static void main(String[] args)
	{
		PersonCreate pe=new PersonCreate();
		pe.setName("zhangsan");
		pe.setHeight(1.73);
		pe.setWeight(55.0);
		pe.sayHello();
		
		
		PersonCreate pe1=new PersonCreate();
		pe1.setName("lisi");
		pe1.setHeight(1.81);
		pe1.setWeight(65.0);
		pe1.sayHello();
	}
}
