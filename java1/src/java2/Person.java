package java2;

public class Person
{
   String name;//定义姓名
   double height;//定义身高
   double weight;//定义体重
   
   public void sayHello() {
	   System.out.println("hello,my name is "+name+"，体重是："+weight+"kg"+",身高是："+height+"m");
   }
   public void setName(String name) {
	   this.name=name;
   }
   public String getName() {
	   return this.name;
   }
   public void setHeight(double height) {
	   this.height=height;
   }
   public double getHeight() {
	   return this.height;
   }
   public void setWeight(double weight) {
	   this.weight=weight;
   }
   public double getWeight() {
	   return this.weight;
   }
   
}
