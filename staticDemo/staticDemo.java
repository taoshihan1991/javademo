/*
static关键字demo 数据共享
static 修饰的可以直接 类名.变量名 调用不用对象了
*/
class  Person{
	String name="";
	static String country="CN";
	public void show(){
		System.out.println(name+":"+country);
	}
}
public class staticDemo{
	public static void main(String[] args){
		Person p=new Person();
		p.name="taoshihan";
		p.country="HA";//这里一修改,整个类里面的country都跟着变了
		p.show();
		System.out.println("staticDemo"+Person.country);
	}
}