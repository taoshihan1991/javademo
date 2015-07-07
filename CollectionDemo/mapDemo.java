/*
Map:一次添加一对元素
map称为双列集合 Collection称为单列集合

map集合中存储的就是键值对
map集合中必须保证键的唯一性

常用方法:
1.添加
value put(key,value);

2.判断
boolean isEmpty()
boolean containskey()
boolean containsValue()
3.删除
void clear();清空map
value remove(key);根据指定的key删除值
4.获取
value get(key)
int size() ; 获取键值对的个数

*/
import java.util.Map;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;
public class mapDemo{
	public static void main(String[] args){
		Map<Integer,String> map=new HashMap<Integer,String>();
		//method(map);
		//method2(map);
		method3(map);
	}
	public static void method(Map<Integer,String> map){
		System.out.println(map.put(8,"xiaoming"));//null
		System.out.println(map.put(9,"xiaoming"));//null
		System.out.println(map);//{8=xiaoming, 9=xiaoming}
	}
	public static void method2(Map<Integer,String> map){
		map.put(1,"taoshihan1");
		map.put(2,"taoshihan2");
		map.put(3,"taoshihan3");
		map.put(4,"taoshihan4");
		/*
			取出map中的所有元素
			原理:通过keySet方法获取map中所有的键所在的Set集合
			再对每一个键通过Map集合的get方法获取其对应的值
		*/
		Set<Integer> keySet=map.keySet();
		Iterator it=keySet.iterator();
		while(it.hasNext()){
			Integer key=(Integer)it.next();
			String value=map.get(key);
			System.out.println(key+":"+value);
		}
	}
	public static void method3(Map<Integer,String> map){
		map.put(1,"taoshihan1");
		map.put(2,"taoshihan2");
		map.put(3,"taoshihan3");
		map.put(4,"taoshihan4");
		/*
			取出map中的所有元素
			原理:通过entrySet方法获取map中映射关系所在的Set集合
			再对Set集合进行迭代获取其映射关系对象,然后getKey() getValue
		*/
		Set<Map.Entry<Integer,String>> entrySet=map.entrySet();

		Iterator it=entrySet.iterator();
		while(it.hasNext()){
			Map.Entry<Integer,String> me=(Map.Entry<Integer,String>)it.next();
			Integer key=me.getKey();
			String value=me.getValue();
			System.out.println(key+":"+value);
		}
	}
}