/*
object ������ĸ���
toString���һ��Ḳ�ǵ�
*/
class  Person{
	private int age;
	Person(int age){
		this.age=age;
	}

}
public class objectDemo2{
	public static void main(String[] args){
		Person p=new Person(2);
		System.out.println(p.toString());//Person@1315d34
	}
}