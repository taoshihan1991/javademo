/*
object ������ĸ���
object�ķ���equalsʹ��,����֮�����ܱȽ�,����Ϊ���е�ַ
*/
class  Person{
	private int age;
	Person(int age){
		this.age=age;
	}
	/*��������*/
	public boolean equals(Object obj){//Object obj=p2 ����ת��
		if(!(obj instanceof Person)) return false;
		Person p=(Person)obj;
		return this.age==p.age;
	}
}
public class objectDemo{
	public static void main(String[] args){
		Person p1=new Person(2);
		Person p2=new Person(2);

		System.out.println(p1.equals(p2));
	}
}