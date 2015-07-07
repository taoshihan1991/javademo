/*
Map:һ�����һ��Ԫ��
map��Ϊ˫�м��� Collection��Ϊ���м���

map�����д洢�ľ��Ǽ�ֵ��
map�����б��뱣֤����Ψһ��

���÷���:
1.���
value put(key,value);

2.�ж�
boolean isEmpty()
boolean containskey()
boolean containsValue()
3.ɾ��
void clear();���map
value remove(key);����ָ����keyɾ��ֵ
4.��ȡ
value get(key)
int size() ; ��ȡ��ֵ�Եĸ���

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
			ȡ��map�е�����Ԫ��
			ԭ��:ͨ��keySet������ȡmap�����еļ����ڵ�Set����
			�ٶ�ÿһ����ͨ��Map���ϵ�get������ȡ���Ӧ��ֵ
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
			ȡ��map�е�����Ԫ��
			ԭ��:ͨ��entrySet������ȡmap��ӳ���ϵ���ڵ�Set����
			�ٶ�Set���Ͻ��е�����ȡ��ӳ���ϵ����,Ȼ��getKey() getValue
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