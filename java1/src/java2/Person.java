package java2;

public class Person
{
   String name;//��������
   double height;//�������
   double weight;//��������
   
   public void sayHello() {
	   System.out.println("hello,my name is "+name+"�������ǣ�"+weight+"kg"+",����ǣ�"+height+"m");
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
