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
public class mapDemo{
	public static void main(String[] args){
		Map<Integer,String> map=new HashMap<Integer,String>();
		method(map);
	}
	public static void method(Map<Integer,String> map){
		System.out.println(map.put(8,"xiaoming"));//null
		System.out.println(map.put(9,"xiaoming"));//null
		System.out.println(map);//{8=xiaoming, 9=xiaoming}
	}
}