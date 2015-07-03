/*
注意:定义集合的数据类型。
*/

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
public class ListDemo3{

	public static void main(String[] args){
		List list=new ArrayList();


		show(list);
	}
	public static void show(List list){
		list.add("abc1");
		list.add("abc2");
		//list特有的取出元素的方式
		for(int i=0;i<list.size();i++){
			System.out.println(list.get(i));
		}

		//可以在迭代过程中对元素增删查改
		ListIterator it=list.listIterator();
		while(it.hasNext()){
			Object obj=it.next();
			if(obj.equals("abc1")){
				it.set("abc3");
			}
			System.out.println(it.next());
		}
		System.out.println(list);
	}

}