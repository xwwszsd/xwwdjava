package java1;

public class Userday
{
	//生命周期函数
	//调用顺序：静态代码块---构造（匿名）代码块---构造函数---其他的按上下顺序依次执行
     static {
    	 System.out.println("这是一个静态代码块，只执行一次,不用在入口函数中调用，最先执行");
     }
     {
    	 System.out.println("这是构造(匿名)代码块，创建（实例化）一次对象执行一次");
     }
     public void one() {
    	 System.out.println("这个是(void)实例方法，不能return");
    	 
     }
     
     public static void two() {
    	 System.out.println("这是静态方法，要用：类型.方法名  进行调用");
     }
     
     Userday(){
    	 System.out.println("这是构造函数，创建对象时直接隐式执行。");
     }
     {
    	 System.out.println("这是构造代码块，创建（实例化）一次对象执行一次,按上下顺序执行。");
     }
     
     public String add(int a,String b) {
    	 return a+b;
     }
     
     public static void main(String[] args)
	{
    	 Userday usd=new Userday();
    	 usd.one();
    	 Userday.two();
    	 
	}
}
