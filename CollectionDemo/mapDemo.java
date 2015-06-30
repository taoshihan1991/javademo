/*
Map:一次添加一对元素
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
public class mapDemo{
	public static void main(String[] args){
		
	}
	public static void method(Map<Integer,String> map){
		map.put(8,'xiaoming');
	}
}