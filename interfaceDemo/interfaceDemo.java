/*
interface demo �ӿ�
��������:
�ӿڷ������ܴ��з�����
*/
interface  Person{
	public void show();
}
class PersonDemo implements Person{
	public void show(){
		System.out.println("ʵ�ֽӿں���");
	}
}

public class interfaceDemo{
	public static void main(String[] args){
		PersonDemo p = new PersonDemo();
		p.show();
	}
}