/*
static�ؼ��� ��̬����

��������:
�޷��ھ�̬��������ʹ�÷Ǿ�̬����
1. ��̬����ֻ�ܷ��ʾ�̬����
2.��̬�в�����ʹ��this����super

���еĴ�������Ϊ��̬������ʱ��û�ж����ǺͶ���մ�ߵĶ����������� 
main�����Ǿ�̬���������п��ܳ����ִ���
*/
class  Person2{
	String name="";
	static String country="CN";
	public static void show(){
		System.out.println(":"+country);
	}
}
public class staticDemo2{
	public static void main(String[] args){
		test();
		System.out.println("staticDemo");
	}
	public static void test(){
		System.out.println("test����");
	}
}