package java2;

public class Rectangle
{
	
	int width;//��
	
	int length;//��
	
	int area;//���
	
	int per;//�ܳ�
	
	public int getArea() {//����һ������ļ��㷽��
		return area= width*length;}//���ؼ�����
    public int getPer() {//����һ���ܳ��ļ��㷽��
    	return per= (width+length)*2;//���ؼ�����
    	
	}
    
    public void showAll() {//����һ��û�з���ֵ�ķ������ؼ���void
    	System.out.println(area);//��ӡ���
    	System.out.println(per);//��ӡ�ܳ�
    	System.out.println(width);//��ӡ��
    	System.out.println(length);//��ӡ��
	} 
	
	Rectangle(int width,int length){//����ͬ���ķ����й��캯��
		this.width=width;//this�ǵ�ǰ����˭���þ�ָ��˭
		this.length=length;
		//System.out.println();
	}
	
	public static void main(String[] args)
	{
		Rectangle re=new Rectangle(10,20);//�������󲢴�ֵ�����캯��
		
		
		re.getArea();//�����������
		re.getPer();//�����ܳ�����
		re.showAll();//����showAll����
	}

}
