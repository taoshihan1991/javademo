/*
static�ؼ���demo ���ݹ���
static ���εĿ���ֱ�� ����.������ ���ò��ö�����
*/
class  Person{
	String name="";
	static String country="CN";
	public void show(){
		System.out.println(name+":"+country);
	}
}
public class staticDemo{
	public static void main(String[] args){
		Person p=new Person();
		p.name="taoshihan";
		p.country="HA";//����һ�޸�,�����������country�����ű���
		p.show();
		System.out.println("staticDemo"+Person.country);
	}
}