/*
����
���弯���е���������
�ڳ�����ֻҪ�õ��˴���<E>��,��Ҫ��ȷ��������
���ͼ����Ǹ�������ʹ�õļ���,ȷ�������͵İ�ȫ
����ʱ�Ὣ����ȥ��,���ɵ�class�ļ��ǲ������͵�,�����Ϊ���͵Ĳ���
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