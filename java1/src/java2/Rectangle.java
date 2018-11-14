package java2;

public class Rectangle
{
	
	int width;//宽
	
	int length;//长
	
	int area;//面积
	
	int per;//周长
	
	public int getArea() {//定义一个面积的计算方法
		return area= width*length;}//返回计算结果
    public int getPer() {//定义一个周长的计算方法
    	return per= (width+length)*2;//返回计算结果
    	
	}
    
    public void showAll() {//定义一个没有返回值的方法，关键字void
    	System.out.println(area);//打印面积
    	System.out.println(per);//打印周长
    	System.out.println(width);//打印宽
    	System.out.println(length);//打印长
	} 
	
	Rectangle(int width,int length){//与类同名的方法叫构造函数
		this.width=width;//this是当前对象，谁调用就指向谁
		this.length=length;
		//System.out.println();
	}
	
	public static void main(String[] args)
	{
		Rectangle re=new Rectangle(10,20);//创建对象并传值给构造函数
		
		
		re.getArea();//调用面积方法
		re.getPer();//调用周长方法
		re.showAll();//调用showAll方法
	}

}
