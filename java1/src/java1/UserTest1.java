package java1;

public class UserTest1
{
    int a=3;
  
    void change(int a) {
    	this.a=a;
    }
    void change(UserTest1 ut1) {
    	ut1.a=30;
    }
    void change(UserTest1 ut1,UserTest1 ut3)
    {
    	
    	//ut1=ut3;
    	ut3=ut1;
    	ut3.a=100;
    	
    }
    public static void main(String[] args)
	{
		int a=2;
		UserTest1 ut1=new UserTest1();
		//System.out.println("-------"+ut1.a+"\n-------"+a);//3 , 2
		/*ut1.change(a);
		//System.out.println("--------"+a+"\n--------"+ut1.a);//2 , 2
		  ut1.change(ut1.a);
		  System.out.println("--------"+ut1.a);//2
		*/
		
		/*
		ut1.change(ut1);
		System.out.println("--------"+ut1.a+"\n---------"+a);//30 , 2
		*/
		
		UserTest1 ut2=new UserTest1();
		//System.out.println("--------"+ut2.a);//3
		ut2.change(ut1,ut2);
		System.out.println("--------"+ut1.a+"\n--------"+ut2.a);//3 , 100 
		
	}
}
