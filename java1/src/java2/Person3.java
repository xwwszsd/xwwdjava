package java2;

public class Person3
{
	 String name;//��������
	 double height;//�������
	 double weight;//��������
	 
	 Person3(String name,double height,double weight){//���캯�� 
		 this.name=name;
		 this.height=height;
		 this.weight=weight;
	 }
	 public void sayhello() {
		System.out.println("hello,my name is "+name+"�������ǣ�"+weight+"kg"+",����ǣ�"+height+"m");
	 }
  
}
