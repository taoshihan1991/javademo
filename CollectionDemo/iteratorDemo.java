/*
注意:定义集合的数据类型。
*/
import java.util.ArrayList;
import java.util.Collection;
public class iteratorDemo{

	public static void main(String[] args){
		Collection coll=new ArrayList();
		coll.add("abc1");
		coll.add("abc2");
		coll.add("abc3");
		coll.add("abc4");
		//使用Collection中的iterator()方法调用集合中的迭代器是为了获取集合中的迭代器对象
		Iterator it=coll.iterator();
		System.out.println(it.next());
	}

}