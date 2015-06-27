/*
static关键字 静态方法

常见错误:
无法在静态上下文中使用非静态变量
1. 静态方法只能访问静态变量
2.静态中不可以使用this或者super

所有的错误都是因为静态方法的时候没有对象凡是和对象沾边的东西都不能用 
main函数是静态函数所有有可能出各种错误
*/
class  Person2{
	String name="";
	static String country="CN";
	public static void show(){
		System.out.println(":"+country);
	}
}
public class staticDemo2{
	public static void main(String[] args){
		test();
		System.out.println("staticDemo");
	}
	public static void test(){
		System.out.println("test方法");
	}
}