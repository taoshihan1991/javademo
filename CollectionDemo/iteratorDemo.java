/*
ע��:���弯�ϵ��������͡�
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
		//ʹ��Collection�е�iterator()�������ü����еĵ�������Ϊ�˻�ȡ�����еĵ���������
		Iterator it=coll.iterator();
		System.out.println(it.next());
	}

}