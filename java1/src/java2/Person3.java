package java2;

public class Person3
{
	 String name;//定义姓名
	 double height;//定义身高
	 double weight;//定义体重
	 
	 Person3(String name,double height,double weight){//构造函数 
		 this.name=name;
		 this.height=height;
		 this.weight=weight;
	 }
	 public void sayhello() {
		System.out.println("hello,my name is "+name+"，体重是："+weight+"kg"+",身高是："+height+"m");
	 }
  
}
