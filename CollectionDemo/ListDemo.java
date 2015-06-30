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
		list.add(1,"taoshihan1");
		System.out.println(list);
	}
}