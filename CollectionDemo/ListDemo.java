/*
ע��:���弯�ϵ��������͡�
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
		//���Ԫ��
		//list.add(1,"taoshihan1");
		
		//�޸�Ԫ��
		//System.out.println("set:"+list.set(1,"haha"));

		//��ȡԪ��
		//System.out.println("get:"+list.get(4));


		System.out.println(list);
	}
}