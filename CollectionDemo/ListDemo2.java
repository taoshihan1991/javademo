/*
注意:定义集合的数据类型。
*/
import java.util.Collection;
import java.util.ArrayList;
import java.util.Iterator;
public class ListDemo2{

	public static void main(String[] args){
		Collection coll=new ArrayList();
		//show(coll);
		
		Collection c1=new ArrayList();
		Collection c2=new ArrayList();
		//show(c1,c2);

		show3(coll);
	}
	public static void show(Collection coll){
		//添加元素add
		coll.add("abc1");
		coll.add("abc2");
		coll.add("abc3");
		System.out.println(coll);//[abc1, abc2, abc3]
		//删除元素remove
		coll.remove("abc1");
		System.out.println(coll);//[abc2, abc3]
		//是否包含\
		System.out.println(coll.contains("abc2"));//true
		//清空集合
		coll.clear();
		System.out.println(coll);//[]
	}
	public static void show(Collection c1,Collection c2){
		c1.add("abc1");
		c1.add("abc2");

		c2.add("abc2");
		c2.add("abc3");
		c2.add("abc4");
		
		//集体添加
		//c1.addAll(c2);
		//System.out.println(c1);//[abc1, abc2, abc2, abc3, abc4]

		//交集删除
		//c1.removeAll(c2);
		//System.out.println(c1);

		//取交集
		c1.retainAll(c2);//[abc2]
		System.out.println(c1);

	}
	public static void show3(Collection coll){
		coll.add("abc1");
		coll.add("abc2");
		coll.add("abc3");
		coll.add("abc4");
		Iterator it=coll.iterator();

		while(it.hasNext()){
			System.out.println(it.next());
		}
	}
}