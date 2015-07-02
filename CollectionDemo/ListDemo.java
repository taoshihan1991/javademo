/*
注意:定义集合的数据类型。
*/
import java.util.ArrayList;
import java.util.List;
public class ListDemo{
	private static List<String> list;
	public static void main(String[] args){
		list=new ArrayList<String>();
		show();
	}
	public static void show(){
		list.add("taoshihan1");
		list.add("taoshihan2");
		list.add("taoshihan3");
		System.out.println(list);
		//添加元素
		//list.add(1,"taoshihan1");
		
		//修改元素
		//System.out.println("set:"+list.set(1,"haha"));

		//获取元素
		//System.out.println("get:"+list.get(4));


		System.out.println(list);
	}
}