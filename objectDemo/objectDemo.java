/*
object 所有类的根类
object的方法equals使用,对象之所以能比较,是因为都有地址
*/
class  Person{
	private int age;
	Person(int age){
		this.age=age;
	}
	/*函数覆盖*/
	public boolean equals(Object obj){//Object obj=p2 向上转型
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