/*
interface demo 接口
常见错误:
接口方法不能带有方法体
*/
interface  Person{
	public void show();
}
class PersonDemo implements Person{
	public void show(){
		System.out.println("实现接口函数");
	}
}

public class interfaceDemo{
	public static void main(String[] args){
		PersonDemo p = new PersonDemo();
		p.show();
	}
}