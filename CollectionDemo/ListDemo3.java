/*
ע��:���弯�ϵ��������͡�
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
		//list���е�ȡ��Ԫ�صķ�ʽ
		for(int i=0;i<list.size();i++){
			System.out.println(list.get(i));
		}

		//�����ڵ��������ж�Ԫ����ɾ���
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