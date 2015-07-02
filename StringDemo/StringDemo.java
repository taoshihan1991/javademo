/*
String类的特点:
字符串对象一旦被初始化就不会被改变
*/

public class StringDemo{
	public static void main(String[] args){
		String s="abc";//"abc"存储在字符串常量池中
		//s="nba";//这是两个对象
		String s1="abc";//常量池中有,就直接指过来
		System.out.println(s==s1);//true

		stringDemo1();
	}
	/*
	演示字符串定义的第二种方式,
	*/
	private static void stringDemo1(){
		String s=new String("abc");//创建一个字符串对象在常量池中
		String s1=new String("abc");//这里是两个对象,没用常量池 new一个字符串对象在堆内存中
		System.out.println(s==s1);//false

		/*
		String类中的equals复写了Object类的方法
		其实就是比较字符串内容
		*/
		System.out.println(s.equals(s1));//true 对象比较
	}

}