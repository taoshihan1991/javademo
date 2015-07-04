/*
泛型
定义集合中的数据类型
在程序中只要用到了带有<E>的,就要明确数据类型
泛型技术是给编译器使用的技术,确保了类型的安全
运行时会将泛型去掉,生成的class文件是不带泛型的,这个称为泛型的擦除
*/
import java.util.ArrayList;
import java.util.Iterator;
public class genericDemo{
	public static void main(String[] args){
		//ArrayList al=new ArrayList();
		//method(al);

		method2();
	}
	public static void method(ArrayList al){
		al.add("abc1");
		al.add(4);
		Iterator it=al.iterator();
		while(it.hasNext()){
			String str=String.valueOf(it.next());
			System.out.println(str);
		}
	}
	public static void method2(){
		ArrayList<String> al=new ArrayList<String>();
		al.add("abc1");
		al.add("abc2");
		Iterator<String> it=al.iterator();
		while(it.hasNext()){
			String str=it.next();
			System.out.println(str);
		}
	}
}