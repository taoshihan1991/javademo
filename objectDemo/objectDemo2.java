/*
object 所有类的根类
toString这个一般会覆盖掉
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